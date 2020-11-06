package model;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    private   Map<Character , TrieNode> children;
    private boolean isWord;

    public TrieNode(){
        this.children = new HashMap<>();
        this.isWord = false;
    }

    public  Map<Character , TrieNode> getChildren(){
        return this.children;
    }

    public boolean isWord(){
        return this.isWord;
    }

    public void setIsWord(boolean isWord){
        this.isWord = isWord;
    }

    public void setEndOfWord(boolean b) {
        this.isWord = true;
    }
}
