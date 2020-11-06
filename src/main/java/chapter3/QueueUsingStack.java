package chapter3;

import model.ListNode;

import java.util.EmptyStackException;

public class QueueUsingStack {

    private  ListNode first;
    private  ListNode last;


    public synchronized void add(int data) {
        ListNode t  = new 	ListNode(data);

        if(first == null) {
            first = t;
            last = first;
        }

        if(last != null) {
            last.next = t;
            last = last.next;
        }
    }


    public int remove() {
        if(first == null) throw new EmptyStackException();
        int data = first.val;
        first = first.next;
        if(first == null) last = null;
        return data;
    }


    public boolean isEmpty(){

        return first == null;
    }

}
