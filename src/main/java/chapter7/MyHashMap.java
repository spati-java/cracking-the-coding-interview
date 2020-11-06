package chapter7;

import java.util.ArrayList;

public class MyHashMap<K, V> {
    public int size = 0;
    private ArrayList<LinkedListNode> arrayList;

    private static class LinkedListNode<K, V> {

        LinkedListNode<K, V> next;
        LinkedListNode<K, V> prev;

        K key;
        V value;


        public LinkedListNode(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap(int capacity) {
            arrayList = new ArrayList<>();
            arrayList.ensureCapacity(capacity);
            for(int i = 0; i < capacity; i++){
                arrayList.add(null);
            }
    }

    public  void put(K key, V value) {

        LinkedListNode tempNode = getNodeForKey(key);
        if(tempNode != null){
            tempNode.value = value;
            return ;
        }
        tempNode = new LinkedListNode(key, value);
        int index = getIndexForKey(key);
        /// figure out why this part is so important;
        if(arrayList.get(index) != null) {
            tempNode.next = arrayList.get(index);
            tempNode.next.prev = tempNode;
        }
        arrayList.set(index , tempNode);
        size++;
    }


    public V get(K key){
        LinkedListNode<K, V> node = getNodeForKey(key);
        return  node != null ? node.value : null;
    }

    private LinkedListNode getNodeForKey(K key) {

        int index = getIndexForKey(key);

        LinkedListNode<K, V> current = arrayList.get(index);
        while (current != null) {
            if(current.key == key) return current;
            current = current.next;
        }
        return  null;
    }

    private int getIndexForKey(K key) {
        return key.hashCode() % arrayList.size();
    }


}
