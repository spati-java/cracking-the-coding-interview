package chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest {

    LRUCache lRUCache ;
    @BeforeEach
    public void init(){
        lRUCache = new LRUCache(2);
    }

    @Test
    void put() {


    }

    @Test
    void getIndexForKey() {
    }

    @Test
    void test() {
        lRUCache.put(1, 1);
        lRUCache.put(2, 2);


        int actual = lRUCache.get(1);    // return 1

        assertEquals(1, actual);
        lRUCache.put(3, 3); // evicts key 2
       int actual2 =  lRUCache.get(2);    // returns -1 (not found)
        assertEquals(-1, actual2);
        lRUCache.put(4, 4); // evicts key 1

        int actual3 = lRUCache.get(1);    // return -1 (not found)
        assertEquals(-1, actual3);
        int actual4 = lRUCache.get(3);    // return 3
        assertEquals(3, actual4);
        int actual5 =  lRUCache.get(4);
        assertEquals(-4, actual5);

    }


}