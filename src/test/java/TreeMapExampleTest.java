import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TreeMapExampleTest {

    TreeMapExample tree;

    @BeforeEach
    public void init(){
        tree = new TreeMapExample();
    }

    @Test
    void searchWords() {


        String [] words = {"AB" , "AA", "AC", "BCA", "CCB", "CC", "CA"};

        String [] expectedArray = {"A", "AN", "APPLE", "Hello", "Is", "NOT", "This", "Tree", "example","test" };

        List<String> expectedList = Arrays.asList(expectedArray);
       // List<String> actualList = tree.searchWords(words) ;

        //assertLinesMatch(expectedList, actualList , "test treemap methods");



    }
}