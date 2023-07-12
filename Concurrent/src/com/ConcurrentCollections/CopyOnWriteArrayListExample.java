package com.ConcurrentCollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample extends Thread{


     static CopyOnWriteArrayList<String> l=new CopyOnWriteArrayList<>();
    public void run()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        l.add("Hello");

    }
    public  static void main(String[] args)
    {
        l.add("Bye");
        l.add("sahithi");
        l.add("Hyderabad");
        l.addIfAbsent("Bye");//if the object is not there then only it adds
        CopyOnWriteArrayListExample t=new CopyOnWriteArrayListExample();

       t.start();
      CopyOnWriteArrayList<String > c=new CopyOnWriteArrayList<>();
      c.add("A");
      c.add("B");
      c.add("Sahithi");
      c.addAll(l);//adds all objects to list c irrespectiive of whether it is present or not
      System.out.println( "After addAll " +c);
      CopyOnWriteArrayList<String > c1=new CopyOnWriteArrayList<>();
      c1.add("c");
      c1.add("A");
      c1.addAllAbsent(c);//adds if objects doesnot present
        System.out.println( "After addAllAbsent " +c1);
        Iterator<String> itr=c1.iterator();
        c1.add("sindhu");//it wont be reflected to iterator
        try {
            Thread.sleep(1000);
            while(itr.hasNext())

            {

               /* if(itr.next()=="Bye")
                    itr.remove(); *///iterator remove is not supported in copyonwritearraylist it will throw
                //UnsupportedOperationException
                System.out.println(itr.next());

            }
            System.out.println(l.remove("Bye"));//bye will be removed from list and return true
            System.out.println(l);
        }
         catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
