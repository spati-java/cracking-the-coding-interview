package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class StackAndQueueTest {
    StackAndQueue sq;
    @BeforeEach
    public void init(){
        sq = new StackAndQueue();
    }

    @Test
    void sortStack() {
        Stack<Integer> input = new Stack<>();
        input.push(5);
        input.push(2);
        input.push(6);
        input.push(3);
        input.push(1);
        input.push(1);
        int [] expected = {1,1,2,3,5, 6};
        Stack<Integer> sorted = sq.sortStack(input);
        List<Integer> sortedList = new ArrayList<>(sorted);
        int [] actual = sortedList.stream().mapToInt(e->e).toArray();
        assertArrayEquals(expected, actual);

    }
}