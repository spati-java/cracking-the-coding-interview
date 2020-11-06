import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class CustomQueueTest {

    CustomQueue queue;

    @BeforeEach
    public void init() {
        queue = new CustomQueue();
    }

    @Test
    public void testEnqueue() {

    }

    @Test
    public void testDeque() {

        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(9);
        queue.enqueue(9);
        queue.enqueue(9);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        int actualElem = queue.dequeue();
        int expectedElement = 8;
        assertEquals(expectedElement, actualElem);
    }

    @Test
    public void testSize(){

        // add a bunch to the queue
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(10);
        queue.enqueue(10);


        assertEquals(8, queue.size(), "should return size 8");
    }

}