
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomLinkedListTest {
    CustomLinkedList linkedList;

    @BeforeEach
    public void init() {
        linkedList = new CustomLinkedList();
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
    }

    @Test
    public void add() {
        linkedList.add(7);
        linkedList.add(8);
        assertEquals(5, linkedList.getSize());
        linkedList.printAll(linkedList);
    }

    @Test
    void addFirst() {
        System.out.println("Before adding to the first element");
        linkedList.printAll(linkedList);
        Node resultNode = linkedList.addFirst(4);
        assertEquals(4, resultNode.data);
        System.out.println("");
        System.out.println("after adding to the first");
        linkedList.printAll(linkedList);
        System.out.println(" ");
        System.out.println("removing data 2");
       Node head =  linkedList.deleteNode(linkedList.head, 2);

       while(head !=null){
           System.out.print(head.data + "-->");
           head = head.next;
       }
    }

    @Test
    void insert() {
        linkedList.insert(2, 12);
        assertEquals(4, linkedList.getSize());
        linkedList.printAll(linkedList);
       // CustomLinkedList reversedLinked = linkedList.reverseLinkedList(linkedList);
       // linkedList.printAll(reversedLinked);

    }

    @Test
    void getSize() {
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
       // linkedList.printAll(linkedList);
        assertEquals(7, linkedList.getSize());
        // linkedList.reverseLinkedList(linkedList.head);
    }

    @Test
    void printAll() {
        linkedList.printAll(linkedList);
    }

    @Test
    void deleteDups() {
        linkedList.add(2);
        assertEquals(3, linkedList.getSize());
        linkedList.printAll(linkedList);
    }

    @Test
    void kthElement() {
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        assertEquals(6, linkedList.kthElement(linkedList.head, 1));

    }

    @Test
    void revere() {
        Node head = linkedList.revere(linkedList.head);
        System.out.println(" After reverseing the list looks like this " );
        while(head != null){
            System.out.print(head.data + " ->");
            head = head.next;
        }

    }

    @Test
    void deleteKthNode() {
        Node result = linkedList.deleteKthNode(7, linkedList.head, 0);
        while(result != null){
                System.out.print(result.data + " -> ");
                result = result.next;
            }


    }
}