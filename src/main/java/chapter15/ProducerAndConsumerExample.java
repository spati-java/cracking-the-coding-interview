package chapter15;

public class ProducerAndConsumerExample {

    public static void main(String [] args){

        MyQ q = new MyQ();
        new Producer(q);
        new Consumer(q);
    }
}

class MyQ {

    private int num ;
    public boolean valueSet = false;


    public synchronized  void put( int num) {

        while (this.valueSet){
            try {
                wait();
            }catch (InterruptedException e){}
        }

        this.num = num;
        this.valueSet = true;

        System.out.println("Put: " + this.num);
        notify();
    }


    public synchronized  void get() {
        System.out.println("Get " + this.num);
        while (!this.valueSet){
            try {
                wait();
            }catch (InterruptedException e){}
        }
        this.valueSet = false;
        notify();
    }

}

class Producer implements  Runnable{


    MyQ q ;

    public  Producer( MyQ q ){
        this.q = q;
        Thread t = new Thread(this, "Producer");
        t.start();
    }


    @Override
    public void run() {
            int i = 0;

            while(true){
                try {
                    this.q.put(i++);
                    Thread.sleep(1000);
                }catch (InterruptedException e){

                }
            }
        }
}


class  Consumer implements  Runnable {

    MyQ q ;

    public Consumer(MyQ q) {
        this.q = q;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    @Override
    public void run() {

            while(true){
                try {
                    this.q.get();
                    Thread.sleep(2000);
                }
                catch (InterruptedException e){

                }
            }


    }


}
