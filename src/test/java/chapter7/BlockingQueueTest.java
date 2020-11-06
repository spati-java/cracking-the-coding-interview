package chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlockingQueueTest {

    BlockingQueue blockingQueue;


    @BeforeEach
    public void init() throws InterruptedException{
        blockingQueue = new BlockingQueue(5);
        blockingQueue.enqueue(2);
    }

    @Test
    void enqueue() throws  InterruptedException {
        blockingQueue.dequeue();
        blockingQueue.enqueue(2);
        blockingQueue.enqueue(2);
        blockingQueue.enqueue(2);
        blockingQueue.enqueue(2);
    }

    @Test
    void dequeue() throws  InterruptedException{

        int result = blockingQueue.dequeue();
        System.out.println(result);
    }
}