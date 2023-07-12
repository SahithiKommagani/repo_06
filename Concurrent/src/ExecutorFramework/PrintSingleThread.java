package ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintSingleThread implements Runnable {
    int n;

    public PrintSingleThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int i;



        for (i = 1; i < n; i++) {

            System.out.print(i + "");
            }
        System.out.println();
            System.out.println(  Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread Ended " + Thread.currentThread().getName());
        }


    public static void main(String[] args) {
        PrintSingleThread[] p = {new PrintSingleThread(10),
                new PrintSingleThread(11),
                new PrintSingleThread(12),
                new PrintSingleThread(13),
        };
        ExecutorService service = Executors.newSingleThreadExecutor();//runs on single thread if thread fails due to any
        // termination another thread come into action
        //executes sequentially
        for (PrintSingleThread ps : p) {
            service.execute(ps);
        }
    }
}
