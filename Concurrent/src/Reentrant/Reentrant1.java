package Reentrant;

import java.util.concurrent.locks.ReentrantLock;

public class Reentrant1 {
    public static void main(String[] args)
    {
        ReentrantLock r=new ReentrantLock();
        r.lock();
        r.lock();
        System.out.println(r.isLocked());//true because it holds 2 locks
        System.out.println(r.isHeldByCurrentThread());//true
        System.out.println(r.getQueueLength());//0 because no thread is waiting
        r.unlock();
        System.out.println(r.getHoldCount());//only 1 lock because unlocked 1
        r.unlock();
        System.out.println(r.isLocked());
        System.out.println(r.isFair());
    }
}
