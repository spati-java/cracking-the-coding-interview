import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NavigableMapExampleTest {
    NavigableMapExample navigableMapExample;
    NavigableMap<Integer , String> map;
    @BeforeEach
    public  void init(){
        navigableMapExample = new NavigableMapExample();
        map = new TreeMap<>();
        map.put(1, "RED");
        map.put(2, "BLUE");
        map.put(3, "");
        map.put(5, "A MESSAGE");
        map.put(7, "A MESSAGE");
        map.put(10, "B MESSAGE");
    }
    @Test
    void testHeadMap() {
        Integer expectedKey = 1;
        String expectedValue = "RED";
        NavigableMap<Integer, String> actual = navigableMapExample.testHeadMap(4, this.map);
        Map.Entry<Integer,String>  entry = actual.firstEntry();
        assertEquals(expectedKey, entry.getKey() , "should return the smallest key when not found");
        assertEquals(expectedValue, entry.getValue() , "should return the value of the smallest key when not  found the given key");
    }

    @Test
    void getCeiling() {
        Integer expectedKey = 7;
        String expectedValue = "A MESSAGE";
        Map.Entry<Integer, String> actual = navigableMapExample.getCeiling(6, this.map);
        assertEquals(expectedKey,actual.getKey() , "Should return a key that is  greater than or equal to the given key" );
        assertEquals(expectedValue,actual.getValue() , "Should return the value of the key that is  greater than or equal to the given key" );
    }

    @Test
    void getFloor() {
        Map.Entry<Integer, String> actual = navigableMapExample.getFloor(5, this.map);
        Integer expectedKey = 5;
        String expectedValue = "A MESSAGE";
        assertEquals(expectedKey , actual.getKey() , "should return a key that is smaller than  or equal to the  given key");
        assertEquals(expectedValue , actual.getValue() , "Should return the value of a key that  is equal to the given key or smaller than key when not found");
    }


    @Test
    void getTailMap() {

        NavigableMap<Integer, String> actual = navigableMapExample.getTailMap(6, this.map);
        for(Map.Entry<Integer , String> e : actual.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
        Integer expectedKey = 10;
        String expectedMessage = "B MESSAGE";
        assertEquals(expectedKey, actual.lastEntry().getKey() , "Should return the largest key in the map");
    }
}