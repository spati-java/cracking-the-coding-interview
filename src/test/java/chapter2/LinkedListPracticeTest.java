package chapter2;

import model.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListPracticeTest {
    LinkedListPractice llp;
    ListNode myNode = null;
    @BeforeEach
    public void init(){
        llp = new LinkedListPractice();

    }
    @Test
    public void sumList(){

            ListNode l1 = new ListNode(6);
            l1.next = new ListNode(1);
            l1.next.next = new ListNode(7);

            ListNode l2  = new ListNode(2);
            l2.next = new ListNode(9);
            l2.next.next = new ListNode(5);

            ListNode test = llp.sumList(l1, l2);

            while(test != null){
                System.out.print(test.val + "->");
                test = test.next;
            }
    }

    @Test
    void isPalindrom() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(1);

        ListNode temp = l1;

        ListNode reverseNode = llp.reverse(l1);

        while(temp != null && reverseNode != null) {

            System.out.println("before reverse");

            System.out.print(temp.val +"  ");

            temp = temp.next;

            System.out.println("after reverse");

            System.out.print(reverseNode.val +"  ");

            reverseNode = reverseNode.next;
        }
    }

    @Test
    void reverse() {
    }

    @Test
    void kthToLast() {
        ListNode l1 = new ListNode(6);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(7);
        l1.next.next.next = new ListNode(8);
        // (6) -> (1) -> (7)->(8)
        int actual = llp.kthToLast(l1, -1);
        int expected = 6;

        assertEquals(expected,actual);

    }
}