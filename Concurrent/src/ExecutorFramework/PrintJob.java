package ExecutorFramework;

import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintJob implements Runnable {
    public String empName;

    public PrintJob( String empName) {
        this.empName=empName;
    }

    @Override
    public void run(){
        //creating task
        System.out.println( empName + " job Running started by Thread " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(empName + " job ended by Thread " +Thread.currentThread().getName());

    }
    public static void main(String[] args)
    {
        PrintJob[] p={new PrintJob("sahithi"),
                new PrintJob("sai"),
                new PrintJob("sindhu"),
                new PrintJob("jonny"),
                new PrintJob("sanju"),
                new PrintJob("sweety"),
                new PrintJob("puppy")
        };
        //Creating object of ExecutorService class
        // asking the executor service to create a thread
        // pool with fixed number of threads
        ExecutorService  service= Executors.newFixedThreadPool(4);//4 threads

        for(PrintJob job:p)
        {
            service.submit(job);//submitting task to executor service method //6 jobs
        }
        service.shutdown();


    }
}
