package com.ConcurrentCollections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapThread extends Thread {
    static ConcurrentHashMap<Integer, String> l = new ConcurrentHashMap<>();

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Child thread is running " +l);
        l.put(4, "playing");// no concurrentmodification exception because of ConcurrentHashMap
        l.remove(5,"drawing");
    }

    public static void main(String[] args) {
        l.put(1, "dancing");
        l.put(2, "singing");
        l.put(3, "painting");
        l.putIfAbsent(5,"drawing");//only if its not there it includes
       // l.clear();//removes all key value pairs so size will be 0
        System.out.println(l.size());


        ConcurrentHashMapThread t = new ConcurrentHashMapThread();
        t.start();
        try {
            System.out.println("main thread started executing");
            Thread.sleep(1000);
            //remapping the values
            l.compute(2, (key, val)
                    -> val.concat(" writing "));
            l.compute(3, (key, val)
                    -> val.concat(" Reading"));
            l.compute(2,(key,value)-> value.toUpperCase());
            l.compute(1,(value,key)->key+100);
            System.out.println(l);
            System.out.println("checking contains " + l.contains("drawing"));
            System.out.println("checking if key present " +l.containsKey(8));
            System.out.println("checking if value present " +l.containsValue("singing"));
            l.replace(1,"dancing","acting");//if both key and value matches then the value
            // will be replaced with new value
            l.remove(4,"dancing");//if both key and value match then only it removes
            for (Map.Entry<Integer, String> entry : l.entrySet()) {
                System.out.println(entry.getKey() + entry.getValue());
            }
           Enumeration en = l.elements();//returns enumeration values

            System.out.println("enumeration values");

            // Displaying the Enumeration
            while (en.hasMoreElements()) {
                System.out.println(en.nextElement());
           }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}



