package ExecutorFramework;

import java.util.concurrent.*;

public class PrintCached implements Runnable{
    int id;
    String name,address;

    public PrintCached( int id ,String name,String address) {
        this.id=id;
        this.name=name;
        this.address = address;
    }

    @Override
    public void run() {

        //System.out.println(Thread.currentThread().getName() + " Details are " + id + " " + name + " " +address);
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " Details are " + id + " " + name + " " +address);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
     System.out.println("Threads ended " +Thread.currentThread().getName());

    }
    public static void main(String [] args) {
        PrintCached[] p = {new PrintCached(1, "sahithi", "hyderabad"),
                new PrintCached(2, "sindhu", "hyderabad"),
                new PrintCached(3, "srinija", "banglore"),
                new PrintCached(4, "Sanjana", "Pune"),
        };
        // Getting instance of ThreadPoolExecutor using  Executors.newCachedThreadPool factory method
        // ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        ExecutorService service=Executors.newCachedThreadPool();//creates new threads as needed if thread is idle fo rmore than  min
        //it will tear down threads
        for(PrintCached c:p)
        {
           service.submit(c);
            Future f=service.submit(c);
            try {
                System.out.println(f.get()); //returns null upon successful completion of task
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

    }


}
