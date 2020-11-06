package chapter3;

import model.StackNode;


public class StackUsingLinkedList {


    StackNode top = null;

    public synchronized  void push(int data) {
        StackNode t = new StackNode(data);
            t.next = top;
            top = t;
    }


    public  int pop(){
        int val = top.data;
        top = top.next;
        return val;
    }

    public boolean isEmpty() {
        return top == null;
    }



}
