package BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    BlockingQueue<Integer> bq;
    String message;

    public Consumer(BlockingQueue<Integer> bq,String message) {
        this.bq = bq;
        this.message=message;
    }


    public void run() {
        while (true) {
            try {
                System.out.println(message + bq.take() + " " + Thread.currentThread().getName());
                Thread.sleep(1000);
                System.out.println("Consumer Stopped");
            }


            catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
    }
}

