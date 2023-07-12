package BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Producer implements Runnable {
    BlockingQueue<Integer> bq;
    String message;
    int number;
    int sum=0;
    public Producer(BlockingQueue<Integer> bq,String message) {
        this.bq = bq;
        this.message=message;
    }


    @Override
    public void run() {
            try {
                for (int i = 1; i <= 30; i++) {
                    bq.put(i);//adding objects to queue
                    System.out.println(message + i);
                    Thread.sleep(1000);
                }
                bq.put(-1);  // indicates end of producing
                 System.out.println("Producer STOPPED.");
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }




