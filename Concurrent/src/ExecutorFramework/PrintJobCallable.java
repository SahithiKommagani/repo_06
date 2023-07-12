package ExecutorFramework;

import java.util.concurrent.*;

public class PrintJobCallable implements Callable<Double> {
    int n;
    double sum=0,avg=0;
    PrintJobCallable(int n)
    {
        this.n=n;
    }
    @Override
    public Double call() throws Exception {
        System.out.println(  "Average of " + n + "numbers"   +"Current thread starting" + Thread.currentThread().getName());
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
            avg=sum/n;
        }
        Thread.sleep(1000);
        return avg;

    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //creating 5 tasks
        PrintJobCallable[] pc={ new PrintJobCallable(10),
                new PrintJobCallable(20),
                new PrintJobCallable(30),
                new PrintJobCallable(40),
                new PrintJobCallable(50),
        };
        //Creating object of ExecutorService
        // asking the executor service to create a thread
        // pool with fixed number of threads
        ExecutorService service= Executors.newFixedThreadPool(2);
        //submitting task to executor service
        for(PrintJobCallable p:pc)
        {
            //holding the return value of call in future object
            Future<Double> f=service.submit(p);
            System.out.println( "Average = "  +f.get());
        }
        service.shutdown();
    }
}
