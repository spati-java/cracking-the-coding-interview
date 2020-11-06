import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyStackNodeTest {

    MyStackNode<Integer> myStackNode;

    @BeforeEach
    public  void init(){
        myStackNode = new MyStackNode<>();
        myStackNode.push(1);
        myStackNode.push(2);
        myStackNode.push(3);
    }

    @Test
    void push() {
        myStackNode.push(3);
        assertEquals(4, myStackNode.getSize(), "add a new element to the top of the stack");
    }

    @Test
    void pop() {
        Integer data = myStackNode.pop();
        assertEquals(3, data , "should return the top element then remove it ");
        assertEquals(2, myStackNode.getSize(), "should return size ");
        assertEquals(false , myStackNode.isEmpty(), "should check if the the stack is empty");
    }

    @Test
    void peek() {
        assertEquals(3, myStackNode.peek(), "should return the top element ");
    }

    @Test
    void isEmpty() {
        assertEquals(false, myStackNode.isEmpty());
    }

    @Test
    void size() {
        assertEquals(3, myStackNode.getSize());

    }
}