package chapter10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SparseSearchTest {

    SparseSearch ss ;


    @BeforeEach
    public void init(){
        ss = new SparseSearch();
    }
    @Test
    void sparseSearch() {

        String [] array = {"", "" , "car" ,"", "", "dad", "" ,"ball"};
        String sk = "ball";
        int expected = 7;
        int actual = ss.sparseSearch(array, sk );
        assertEquals(expected, actual);

    }
}