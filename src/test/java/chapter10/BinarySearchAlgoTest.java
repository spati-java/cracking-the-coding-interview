package chapter10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchAlgoTest {

    BinarySearchAlgo bsa ;

    @BeforeEach
    public void init(){
        bsa = new BinarySearchAlgo();
    }

    @Test
    void getIndex() {

        int [] ar  = {1,1,1,1,1};

        assertEquals(2, bsa.getIndex(ar, 1));
    }
}