package chapter10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class RankFromStreamTest {

    RankFromStream rfs;

    @BeforeEach
    public void init() {
        rfs = new RankFromStream();
    }

    @Test
    void getRankOfNumber() {
        List<Integer> stream = Arrays.asList(5,1,4,4,5,9,7,13,3);
        int expectedCount = 3 ;
        int actualCount = rfs.getRankOfNumber(stream , 4) ;
        Assertions.assertEquals(expectedCount , actualCount , "should return a count of all the values lesser than and equal to the num except the number itself");

    }

    @Test
    void binarySearch() {
    }
}