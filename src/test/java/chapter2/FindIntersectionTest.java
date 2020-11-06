package chapter2;

import model.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIntersectionTest {

    FindIntersection fi = new FindIntersection();

    @BeforeEach
    public void init(){
        fi = new FindIntersection();

    }

    @Test
    void findIntersection() {

        ListNode l1 = new ListNode(6);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(7);

        ListNode l2  = new ListNode(2);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(5);

    }
}