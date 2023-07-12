package Phaser;

import java.util.concurrent.Phaser;

public class MainPhaser {
    public static void main(String[] args)
    {
        Phaser ph=new Phaser();
        ph.register();
        int currentPhase;
        Demo d=new Demo(ph,10);
        Demo d1=new Demo(ph,20);
        Thread t=new Thread(d);
        Thread t1=new Thread(d1);
        t.start();
        t1.start();
        /*currentPhase = ph.getPhase();
        System.out.println(currentPhase);
        ph.arriveAndDeregister();
        if(ph.isTerminated())
            System.out.println("Terminated");
       ph.arriveAndAwaitAdvance();
        System.out.println("Phase " + currentPhase
                + " Complete");
        System.out.println("Phase Zero Ended");

        ph.arriveAndAwaitAdvance();
        System.out.println("Phase " + currentPhase
                + " Complete");
        System.out.println("Phase one Ended");
        ph.arriveAndDeregister();//arrives and degisters without waiting
       if(ph.isTerminated())
                System.out.println("Terminated");*/
    }
}
