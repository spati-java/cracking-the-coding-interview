import java.util.Stack;

public class QueueUsingStack {

}


class QueueNode<T> {
    int data ;
    public QueueNode( int data){
        this.data = data;
    }
}


class MyQueue<T> {
    Stack<QueueNode<T>> stack1 = new Stack<>();
    Stack<QueueNode<T>> stack2 = new Stack<>();

    public void offer( int data) {

        QueueNode<T> t = new QueueNode<T>(data);
        // get all elements of stack1 and save in stack2  temporarily
        while(!stack1.isEmpty()) {
            QueueNode<T> temp = stack1.pop();
            stack2.push(temp);
        }

        stack1.push(t);
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }


    public int pop() {
        return stack1.pop().data;
    }

    public int peek(){
        return stack1.peek().data;
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

}

