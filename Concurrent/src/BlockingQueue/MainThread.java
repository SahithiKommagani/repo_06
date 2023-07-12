package BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainThread {
    public static void main(String [] args)
    {

        BlockingQueue<Integer> bq=new ArrayBlockingQueue<>(10);
        //producer thread creation
        Producer p=new Producer(bq,"Hello Producer"); //one producer
        Consumer c=new Consumer(bq,"Hello Consumer ");
        Consumer c1=new Consumer(bq,"Hello Consumer2");
        Thread t=new Thread(p);
        Thread t1=new Thread(c);
        Thread t2=new Thread(c1);//consumer thread //two comsumer threads
        t.start();
        t1.start();
        t2.start();


    }
}
