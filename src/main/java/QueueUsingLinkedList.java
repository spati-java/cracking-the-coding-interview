import java.util.NoSuchElementException;

public class QueueUsingLinkedList {

    public static class QueueNode<T> {
        T data;
        QueueNode<T> next;

        public QueueNode(T data) {
            this.data = data;
        }

        QueueNode<T> first;
        QueueNode<T> last;

        public void add(T item) {

            QueueNode<T>  t = new QueueNode<T>(item);

            if(last !=null){
                last.next = t;
            }
            last = t;

            if(first == null){
                first = last;
            }

            return;

        }

        // return the first element and remove the first node as well
        public T remove(){

            if(first == null){
                throw new NoSuchElementException("Please add a new element to the queue");
            }

            T data = first.data;
            first = first.next;

            if(first == null) {
                last = null;
            }

            return data;
        }

        public  T peek(){
            if(first == null) throw new NoSuchElementException();
            return first.data;
        }

        public boolean isEmpty(){
            if(first.data == null) return true;
            return false;
        }

    }


}
