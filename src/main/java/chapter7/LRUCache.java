package chapter7;

import java.util.ArrayList;
import java.util.LinkedList;

public class LRUCache  {

    /** ca = 4
     *
     *     [1] -> ()-()-()
     *     [1] -> ()-()-()
     *     [2] -> ()
     *     [3] -> ()-()
     *
     *  */


    int capacity;

    int size = 0;

    private ArrayList<LinkedList> table;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        table = new ArrayList<>(capacity);
    }



    public  void put(int k , int value){

            if(size == capacity) {
                // we need to remove the last entry;
            }else {

            }

        size++;
    }

    public int getIndexForKey(int k){
        Integer key = new Integer(k);
        return key.hashCode() % table.size();
    }

    public int get(int i) {
        return 0;
    }


}
