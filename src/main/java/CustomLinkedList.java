
public class CustomLinkedList {

    Node head;

    int size = 0;

    public static void main(String[] args) {

        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.head = linkedList.add(5);
    }

    public Node add(int data) {

        if (head == null) {
            head = new Node(data);
            size++;
            return head;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
        size++;
        return head;
    }

    public Node addFirst(int data) {
        if (head == null) {
            add(data);
        } else {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }


    public Node reverseLinkedList(Node head) {
        if (head == null) {
            return null;
        }
        Node prev = null;
        Node next = null;
        Node current = head;
        while (current != null) {
            next = current.next;
            head.next = prev;
            prev = head;
            head = next;
            current = next;
        }

        return prev;

    }

    public Node deleteNode(Node head, int d) {

        Node n = head;

        if (n.data == d) return head.next;
        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }

        return head;
    }

    public int getSize() {
        return size;
    }

    public void printAll(CustomLinkedList linkedList) {
        if (linkedList.getSize() == 0) {
            System.out.println("List is empty , first create some using the add method");
        } else {
            Node current = linkedList.head;
            while (current != null) {
                if (current.next == null) {
                    System.out.print(current.data);
                } else System.out.print(current.data + "--->");

                current = current.next;
            }
        }
    }

    public Node insert(int position, int data) {
        if (head == null) {
            System.out.println("First create using add method ");
            return head;
        } else {

            int count = 1;

            Node current = head;

            while (current.next != null) {

                if (count == position) {

                    Node temp = new Node(data);
                    temp.next = current.next;
                    current.next = temp;
                    size++;
                }

                current = current.next;
                count++;

            }

            return head;
        }
    }

    public Node revere (Node head){
        if(head == null){
            return null;
        }
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null) {
            next = current.next;
            head.next = prev;
            head = next;
            prev =  current;
            current = next;
        }

        return prev;
    }


    public  int kthElement(Node head, int k) {
        if( head == null){
            return 0;
        }

        int index = kthElement(head.next, k) + 1;
        if(index == k) {
            System.out.println(head.data);
        }
        return  index;
    }


    public Node deleteKthNode(int size, Node head , int k) {


        if( k >=  size) {
            return  null;
        }

        // node position is k (to delete) node head position is zero.
        Node current = head ;

        if(k == 0) {
            head = head.next;
            return head;
        }


        int index = 0;
        while(current.next != null){
            if((index+1) == k){
               current.next =  current.next.next;
               return head;
            }
            current = current.next;
            index++;
        }

        current.next = current.next.next;

        return head;

    }



    Node deleteDups(Node head){

        // no buffer allowed so use 2 pointers technique

        Node current = head;

        while(current != null){

            Node runner = current;

            while(runner.next != null) {

                if (current.data == runner.next.data) {

                    runner.next = runner.next.next;

                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }

        return  head;
    }


}

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}


