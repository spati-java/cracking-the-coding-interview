package chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashMapWithLinkedListTest {

    HashMapWithLinkedList myMap;

    @BeforeEach
    public void init(){
        myMap = new HashMapWithLinkedList(5);

    }

    @Test
    void put() {
       this.myMap.put("a" , 1);
    }

    @Test
    void get() {
        //this.myMap.put(3, 10);
        //int actual = this.myMap.get(2);
       //assertEquals(20, actual);
    }
}