package chapter10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingAndSearchingTest {

    SortingAndSearching ss;

    @BeforeEach
    public void inti(){
        ss = new SortingAndSearching();
    }

    @Test
    void mergeSort() {

        int [] input = {2,1};
        int [] actual = ss.mergeSort(input);
        int [] expected = {1,2};
        assertArrayEquals(expected, actual);
    }


    @Test
    void testAnagram(){
        String s = "anagram" ;
        String t = "aangram";

        int [] alphabet = new int[26];

        for(int i = 0; i < s.length(); i++){
            alphabet[0]++;
        }
    }
}