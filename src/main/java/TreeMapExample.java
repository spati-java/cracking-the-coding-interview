import java.util.*;

public class TreeMapExample {




    public String searchWords( String [] words){

        TreeSet<Integer>  treeSet = new TreeSet<>();


       TreeMap<String , Integer> map = new TreeMap<>();
        int index = 1;

        for(String word: words){
            map.put(word, index);
            index++;
        }

        System.out.println(map);

        return  map.lastKey();

    }

}
