package CyclicBarriers;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String args[])
    {

        CyclicBarrier barrier = new CyclicBarrier(6);
        CyclicBarrierMovie c = new CyclicBarrierMovie("Adipurush",barrier);

        CyclicBarrierHero c1=new CyclicBarrierHero("Prabhas" ,barrier);
        for(int i=1;i<5;i++) {
            Thread t = new Thread(c);
            t.start();
        }
        for(int i=1;i<5;i++) {
            Thread t1 = new Thread(c1);

            t1.start();
        }
        System.out.println("Executed successfuly");






    }
}
