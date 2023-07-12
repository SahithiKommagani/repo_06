package com.ConcurrentCollections;

import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapExample {
    public static void main(String[] args)
    {
        ConcurrentHashMap<Integer,String> m=new ConcurrentHashMap<>();
        m.put(1,"sahi");
        m.put(2,"sindhu");
        m.put(3,"sweety");
        //concurrentmap has all methods of map and extra it has 3 methods
        m.putIfAbsent(1,"sahithi");//it will not update bcz key is already present in map
        m.putIfAbsent(5,"Hi");//it will update
        m.remove(1,"sahi");//if both key and value match then only it removes
        m.replace(2,"sindhu","sahi");//if both key and value matches then the value
        // will be replaced with new value

        System.out.println(m);

    }
}
