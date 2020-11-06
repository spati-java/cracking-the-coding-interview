package chapter4;

import model.TrieNode;

public class TrieExample {

    private TrieNode root;

    public  TrieExample(){
            this.root = new TrieNode();
        }

    public void insert(String word) {

            TrieNode current = this.root;

        for( char c : word.toCharArray()) {
            TrieNode node =    current.getChildren().computeIfAbsent(c , c1-> new TrieNode());
            current = node;
        }

        current.setEndOfWord(true);
    }

    public boolean find(String word){

        TrieNode current = this.root;

        for(char key: word.toCharArray()) {

            TrieNode node = current.getChildren().get(key);
            if(node == null ) return false;
            current = node;
        }

        return current.isWord();


    }

    public void delete(String word){
            delete(this.root , word,  0);

    }

    private  boolean delete(TrieNode current, String word, int index) {

            if(index == word.length() ){
                if(!current.isWord())
                    return false;
                current.setIsWord(false);
                return current.getChildren().size() == 0;
            }

            char temp = word.charAt(index);

            TrieNode trieNode = current.getChildren().get(temp);

            if(trieNode == null) return false;
            boolean shouldDeleteCurrentNode = delete(trieNode, word, index+1);

            if(shouldDeleteCurrentNode){
                current.getChildren().remove(temp);
                return current.getChildren().size() == 0;
            }

            return  false;
    }

}
