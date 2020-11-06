package chapter7;

import java.util.ArrayList;


public class HashMapWithLinkedList {

    ArrayList<Integer> list ;

    int capacity ;

   public  HashMapWithLinkedList(int capacity) {

        this.list = new ArrayList<>();
        this.capacity = capacity;
        this.list.ensureCapacity(this.capacity);

        for(int num = 0; num < capacity; num++){
            this.list.add(null);
        }
    }


   public void put(String key , Integer value) {
    //  if(this.list.size() == this.capacity) return;
       int index = getIndex(key);
      this.list.add(index , value);

       System.out.println("success");
   }

   public int get(String key) {
     int index = getIndex(key);
     return this.list.get(index);
   }


   public int getIndex(String key) {

       int code = key.hashCode() % this.list.size();
       System.out.println("Generated key is "  + code);
       return code;
   }

   public  int size(){
       return this.list.size();
   }



}

class KeyValue{

    Integer key;
    Integer value;

    public KeyValue(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }
}
