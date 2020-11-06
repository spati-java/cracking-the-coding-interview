import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionExamplesTest {

    RecursionExamples rc ;

    @BeforeEach
    public void init(){
        rc = new RecursionExamples();
    }

    @Test
    void reverse() {

        String w = "ABCD";

        String expected = "DCBA";

        assertEquals(expected, rc.reverse(w, 0));

    }
}