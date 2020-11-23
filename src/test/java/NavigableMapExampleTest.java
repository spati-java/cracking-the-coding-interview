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
        map.put(00, "GRAY");
        map.put(01, "RED");
        map.put(2, "BLUE");
        map.put(3, "");
        map.put(5, "A MESSAGE");
        map.put(7, "A MESSAGE");
        map.put(10, "B MESSAGE");
    }
    @Test
    void testHeadMap() {
        Integer expectedKey = 00;
        String expectedValue = "GRAY";
        NavigableMap<Integer, String> actual = navigableMapExample.testHeadMap(4, this.map);
        System.out.println(actual.firstEntry().getKey());
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
        Integer expectedKey = 10;
        String expectedValue = "B MESSAGE";
        assertEquals(expectedKey, actual.lastEntry().getKey() , "Should return the largest key in the map");
        assertEquals(expectedValue, actual.lastEntry().getValue() , "Should return the largest key in the map");
    }

    @Test
    void getDescendingKeySet() {
        NavigableMap<Integer, String> actual = navigableMapExample.getDescendingKeySet(map);
        //for (Map.Entry<Integer , String> e: actual.entrySet())
        System.out.println(actual);
    }

    @Test
    void testCheckCharactersDigit(){
        String key = "00.00";
        boolean actual = checkCharactersDigit(key);
        assertEquals(true, actual);

    }

    public boolean checkCharactersDigit(String key){

        if(key == null || key.isEmpty() || key.length() != 5 || key.charAt(2) != '-')
            return false;

        String [] keys = key.split("\\-");

        for(String k: keys) {
            for(int index = 0; index < k.length(); index++){
                if(!Character.isDigit(k.charAt(index)))
                    return false;
            }
        }
        return  true;
    }

}