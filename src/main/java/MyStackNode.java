import java.util.EmptyStackException;

public class MyStackNode<T> {

    StackNode<T> top;
    int size = 0;

    public static class StackNode<T> {
        T data;
        StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }
    }

    public void push(T item) {

        StackNode<T> t = new StackNode(item);

        if (top == null) {
            top = t;
        }

        t.next = top;
        top = t;
        size++;
    }

    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public T peek() {
        if(top == null){ throw new EmptyStackException(); }
        return top.data;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
       return size;
    }


}
