import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    MyQueue<Integer> myQ;

    @BeforeEach
    public void init(){
         myQ = new MyQueue<>();
        myQ.offer(3);
        myQ.offer(2);
        myQ.offer(1);
    }

    @Test
    void offer() {

        myQ.offer(5);
        myQ.offer(6);
        myQ.offer(3);
        myQ.offer(7);
        myQ.offer(8);

        while(!myQ.isEmpty()){

            System.out.print(myQ.pop() +  " " );
        }
    }

    @Test
    void pop() {

       assertEquals(3,myQ.pop());
        assertEquals(2,myQ.pop());

    }

    @Test
    void peek() {

        assertEquals(3,myQ.peek());
    }

    @Test
    void isEmpty() {

        while(!myQ.isEmpty()){

            myQ.pop();
        }

        assertEquals(true, myQ.isEmpty());
    }
}