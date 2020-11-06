import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriorityQueueExampleTest {

    PriorityQueueExample pqe;

    @BeforeEach
    public void init(){
        pqe = new PriorityQueueExample();
    }

    @Test
    void returnFiveStringInSortedAndReverseOrdered() {

        String [] words = {"A" , "B" , "C", "D" , "E" , "F"};

        String [] expectedWords = {"E",  "D","C", "B", "A"};

        String [] actualWords = pqe.returnFiveStringInSortedAndReverseOrdered(words);

        assertArrayEquals(expectedWords, actualWords);

    }
}