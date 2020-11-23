import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomNavigableMapTest {

    CustomNavigableMap customNavigableMap;

    @BeforeEach
    public void init() {
        customNavigableMap = new CustomNavigableMap();
        customNavigableMap.put(6, "Hello");
        customNavigableMap.put(20, "World");
        customNavigableMap.put(30, "Yo!");
        customNavigableMap.put(50, "YoYO");
        customNavigableMap.put(100, "YoYO");
        customNavigableMap.put(200, "YoYOYO");
    }

    @Test
    void getFloor() {

        String expectedMessage = "Hello";

        String actualMessage = customNavigableMap.getFloor(300);
        System.out.println(actualMessage);
    }
}