package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackUsingLinkedListTest {


    StackUsingLinkedList sll;

    @BeforeEach
    public void init(){
        sll = new  StackUsingLinkedList();
    }

    @Test
    void push() {

        sll.push(4);
        sll.push(3);
        sll.push(1);
        sll.push(5);
       sll.pop();
       sll.pop();
        assertEquals(3,sll.pop());
    }

    @Test
    void pop() {
    }
}