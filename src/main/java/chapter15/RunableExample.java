package chapter15;

import java.util.ArrayList;
import java.util.List;

public class RunableExample  implements  Runnable {
    int count = 0;
    private  List<Integer> integerList = new ArrayList<>();
    public void run(){

        System.out.println("Running Thread");

        while(count < 10) {
            System.out.println("Thread is running");
            try {
                    Thread.sleep(2000);
                    if(Thread.currentThread().getName().equals("Jumbo")){
                        integerList.add(count++);
                    }
                    if(Thread.currentThread().getName().equals("Mambo")){
                        System.out.println("ArrayList size " + integerList.size());
                    }
            }catch ( InterruptedException e ){

                System.out.println(e.getCause());
            }
        }
        System.out.println(integerList);

    }

    public static void main(String [] args){
        RunableExample runbl = new RunableExample();
        Thread t1 = new Thread(runbl);
        Thread t2 = new Thread(runbl);
        t1.setName("Jumbo");
        t2.setName("Mambo");
        t1.start();
        t2.start();

    }
}
