package CyclicBarriers;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierMovie implements Runnable{
 String movie;
    CyclicBarrier cyclicBarrier;

    public CyclicBarrierMovie( String  movie,CyclicBarrier cyclicBarrier) {
        this.movie=movie;
      this.cyclicBarrier=cyclicBarrier;
    }




    @Override
    public void run() {
        System.out.println(movie + " Movie  yet to be Started ...." +Thread.currentThread().getName() );
        try {
            cyclicBarrier.await();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
        System.out.println(movie + " Movie Started");

    }


}



