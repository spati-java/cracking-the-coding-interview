import java.util.*;

public class CustomNavigableMap<K, V> {
    private Map<Integer, String> database = new HashMap<>();
    private List<Integer> keyList;
    public CustomNavigableMap(){
        this.database = new HashMap<>();
        this.keyList = new ArrayList<>();
    }
    // should return the next smallest if not found
    public  String getFloor(Integer key) {
        int index = binarySearch(key);
        return index == -1 ? "-1": this.database.get(this.keyList.get(index));
    }
    public void put(Integer key, String value){
        keyList.add(key);
        database.put(key, value);
        Collections.sort(this.keyList);
    }

    public int binarySearch(Integer key) {
        int start = 0;
        int end = this.keyList.size()-1;
        int index = -1;
        System.out.println(this.keyList);
        while(start < end){
            int mid = (start + end) /2;
            if(this.keyList.get(mid) == key)
                return mid;
            else if(this.keyList.get(mid) > key)
                end = mid -1;
            else
                start = mid +1;
        }
        if(index == -1){
            index = findClosestSmaller(key);
        }
        return index;
    }

    private int findClosestSmaller(Integer key) {
        System.out.println(this.keyList);
        int start  = 0;
        int end = this.keyList.size()-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(this.keyList.get(mid) < key && this.keyList.get(end) > key)
                return mid;
           // else if()
                end = mid - 1;
        }
        return -1;
    }


}

class Entry<K, V> {

     private K key;
     private V value;
}
