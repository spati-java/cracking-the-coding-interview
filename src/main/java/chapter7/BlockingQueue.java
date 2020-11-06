package chapter7;



import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {

    private Queue<Integer>  queue ;

    private int capacity;

    public BlockingQueue(int capacity) {
        this.queue = new LinkedList<>();
        this.capacity = capacity;
    }

    public synchronized  void enqueue( int data ) throws  InterruptedException {
         while(this.queue.size() == capacity){
                    try {
                        System.out.println("waiting ... ");
                        wait();
                    }catch (InterruptedException ie){
                            ie.printStackTrace();
                    }
            }
            System.out.println("writing.. ");
            this.queue.offer(data);
            notifyAll();
    }

    public  synchronized int dequeue()  throws  InterruptedException {
         while(this.queue.isEmpty()){
             System.out.println("Waiting ....");
             wait();

         }
        System.out.println("reading .. ");
         notifyAll();
        return this.queue.poll();

    }

}
