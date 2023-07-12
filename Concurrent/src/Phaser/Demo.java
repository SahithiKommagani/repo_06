package Phaser;

import java.util.concurrent.Phaser;

public class Demo implements Runnable{
    Phaser p;
    int number;
    int sum=0;

    public Demo(Phaser p,int number) {
        this.p = p;
        this.number=number;
    }

    @Override
    public void run() {
        System.out.println(number +"phase 1 entered");
        for(int i=0;i<number;i++)
        {
           sum=sum+i;
        }
        System.out.println("sum =" +sum);
        p.arriveAndAwaitAdvance();
        //wait for 2 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("phase 1 ended");
        System.out.println(number +"phase 2 entered");
        for(int i=0;i<number;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum =" +sum);
        p.arriveAndAwaitAdvance();
        //wait for 2 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("phase 2 ended ");


    }
}
