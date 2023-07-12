package Semphores;

import java.util.concurrent.Semaphore;

class Sempahore1 {
    static int count = 0;
}

class Thread1 extends Thread {
    Semaphore semaphore;
    String message;

    public Thread1(Semaphore semaphore, String message) {
        super(message);
        this.semaphore = semaphore;
        this.message = message;
    }

    @Override
    public void run() {
        if (this.getName().equals("Hello")) {
            System.out.println("Starting " + message);
            try {
                // getting permit
                System.out.println(message + " is waiting for a permit.");

                //Acquiring the lock
                semaphore.acquire();

                System.out.println(message + " gets a permit.");

                // Accessing the shared resource.
                // other waiting threads will wait, until this thread releases the lock
                for (int i = 0; i < 10; i++) {
                    Sempahore1.count++;
                    System.out.println(message + ": " + Sempahore1.count);

                    //sleeps
                    Thread.sleep(10);
                }
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }

            // Release the permit.
            System.out.println(message + " releases the permit.");
            semaphore.release();
        }

        // Run by thread 2
        else {
            System.out.println("Starting " + message);
            try {
                // First, get a permit.
                System.out.println(message + " is waiting for a permit.");

                // acquiring the lock
                semaphore.acquire();

                System.out.println(message + " gets a permit.");

                // Now, accessing the shared resource.
                // other waiting threads will wait, until this thread release the lock
                for (int i = 0; i < 10; i++) {
                    Sempahore1.count--;
                    System.out.println(message + ": " + Sempahore1.count);

                    Thread.sleep(10);
                }
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            // Release the permit.
            System.out.println(message + " releases the permit.");
            semaphore.release();
        }
    }
}



