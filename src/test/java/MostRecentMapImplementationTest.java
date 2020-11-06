import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class MostRecentMapImplementationTest {
    MostRecentMapImplementation mostRecentImpl;
    @BeforeEach
    void init(){
        mostRecentImpl =  new MostRecentMapImplementation();
        mostRecentImpl.put("a" , System.currentTimeMillis() , "Hellow World");
        mostRecentImpl.put("b" , System.currentTimeMillis()+1 , "This  is our new map");
        mostRecentImpl.put("c" , System.currentTimeMillis()+2 , " Testing");
        mostRecentImpl.put("d" , System.currentTimeMillis()+3 , "Success");
        mostRecentImpl.put("e" , System.currentTimeMillis()+4 , "And Success again");
    }
    @Test
    void get() {

      
        String actualM = mostRecentImpl.get("a");
        String expectedM = "Hellow World";
        Assertions.assertEquals(expectedM, actualM);
    }
}