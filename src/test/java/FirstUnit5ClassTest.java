import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("Fast")
class FirstUnit5ClassTest {

    @Test
    @DisplayName("My 1st JUnit 5 test! 😎")
    void myFirstTest(){

        StringBuilder builder = new StringBuilder("Hello World this is my first test");
        String expected = "Hello World this is my first test";
        String actual = builder.toString();
        assertEquals(expected, actual, "Should return this message: Hello World this is my first test");

    }


}