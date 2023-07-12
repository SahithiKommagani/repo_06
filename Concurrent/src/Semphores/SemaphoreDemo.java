package Semphores;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {


        public static void main(String args[]) throws InterruptedException {
            // Creating a Semaphore object with number of permits = 1
            Semaphore semaphore = new Semaphore(1);//if permit=2 both gets permit at atime

            Thread1 t1 = new Thread1(semaphore, "Hii");
            Thread1 t2 = new Thread1(semaphore, "Bye");

            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println("count: " + Sempahore1.count);
        }
    }

