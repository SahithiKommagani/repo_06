package com.ConcurrentCollections;//program to demonstrate the  traditional collections disadvantages
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentException  extends Thread{
   static  List<String> al=new ArrayList<String>();
    public void run()
    {
        try {
            Thread.sleep(1000);

        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("run method will be executed by child thread t");
        al.add("R"); //we will get concurrent modification exception
    }
    public static void main(String[] args) throws InterruptedException {

        //List<String> al=new ArrayList<String>();
        al.add("a");
        al.add("b");
        al.add("c");
    ConcurrentException t=new ConcurrentException();
        t.start();
        Iterator<String> itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.println("Execution will be done by main thread");
            System.out.println(itr.next());
            Thread.sleep(2000); //first main thread will be sleep so child thread tries to execute
        }


    }
}
