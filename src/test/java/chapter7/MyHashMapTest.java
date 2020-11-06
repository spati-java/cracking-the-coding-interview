package chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashMapTest {

    MyHashMap myMap ;

    @BeforeEach
    public  void init() {
        myMap = new MyHashMap(2);
        myMap.put("A" , 1);
        myMap.put("AB" , 1);
        myMap.put("BA" , 2);

    }

    @Test
    void put() {
        myMap.put("AB" , 1);
        myMap.put("b" , 2);
        myMap.put("BA" , 2);
        System.out.println(myMap.size);
    }

    @Test
    void get() {
        assertEquals(1 , myMap.get("AB"));
        System.out.println(myMap.size);
    }
}