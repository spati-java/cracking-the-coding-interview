import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomStackTest {

    CustomStack stack ;

    @BeforeEach
    public void init(){
        stack = new CustomStack();
    }

    @Test
    public void testPush(){
        stack.push(4);
        stack.push(5);
        stack.push(7);

        assertEquals(3, stack.getSize());
    }

    @Test
    public void testPeek(){

        stack.push(4);
        stack.push(5);
        stack.push(7);

        assertEquals(7, stack.peek());
        //assertEquals(2, stack.getSize());
    }

    @Test
    public void testPoll(){

        stack.pop();
        assertEquals(-1, stack.pop());
        stack.push(4);
        stack.push(5);
        stack.push(7);
        stack.push(4);
        stack.push(5);

        //assertEquals(, stack.poll());
        assertEquals(12, stack.getSize());

        int [] myStack = stack.getStack();
        for(int i = 0; i < stack.getSize(); i++){
            System.out.println("Element: " + myStack[i]);
        }

    }

}