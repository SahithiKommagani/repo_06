package CyclicBarriers;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierHero implements Runnable{
    public String getHero() {
        return Hero;
    }

    public void setHero(String hero) {
        Hero = hero;
    }

    private String Hero;
    CyclicBarrier cb;

    public CyclicBarrierHero(String Hero ,CyclicBarrier cb) {
        this.Hero=Hero;
        this.cb = cb;
    }

    @Override
    public void run() {
        System.out.println(Hero + " yet to be entered");
        try {
            cb.await(); //waits untill all parties invoked await at this barrier
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Hero + "has Entered");
    }
}
