package Reentrant;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockex extends Thread {
    static ReentrantLock l = new ReentrantLock();
    String message;

    ReentrantLockex(String message) {
        this.message = message;
    }

    public void run() {
        do {


            try {
                if (l.tryLock(1000, TimeUnit.MILLISECONDS)) //checks for lock if presents it executes if part or else part but continue to execute
                {
                    System.out.println(Thread.currentThread().getName() + "got locked");

                        Thread.sleep(1000);
                    l.unlock();
                    System.out.println(Thread.currentThread().getName() + "released lock");
                       //infinite loop breaks
                           break;

                } else {
                    System.out.println(Thread.currentThread().getName() + "unable to perform operations because its locked");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
        while (true);
    }


    public static void main(String [] args)
    {
        ReentrantLockex e=new ReentrantLockex("Sahithi");
        ReentrantLockex e1=new ReentrantLockex("Sindhu");
        ReentrantLockex e2=new ReentrantLockex("Hitachi");
//if lock present it will execute other wise alternative but no waiting state
        e.start();
        e1.start();
        e2.start();
    }
}
