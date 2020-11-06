package chapter3;

import chapter2.LinkedListPractice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueUsingStackTest {

    QueueUsingStack qs;
    @BeforeEach
    public void init(){
        qs = new QueueUsingStack();

    }


    @Test
    void add() {
        qs.add(6);
        qs.add(7);
        qs.add(8);
        System.out.println(qs.isEmpty());
        System.out.println(qs.remove());
        System.out.println(qs.remove());
        System.out.println(qs.remove());
        System.out.println(qs.isEmpty());
    }

    @Test
    void remove() {
    }

    @Test
    void isEmpty() {

    }
}