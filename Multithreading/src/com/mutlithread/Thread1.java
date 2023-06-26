//creating thread extending thread class
package com.mutlithread;

public class Thread1 extends Thread {
	public void run(){  
		int i=0;
		while(i<=10)
		{
		System.out.println("thread is running " + i); 
		i++;
		}
	}
	

	public static void main(String[] args) {
		Thread1 t=new Thread1();
		t.start();//when we start a thread it calls run method
		//order of execution of threads is not same
		System.out.println( " ID of thread " +t.getId());
		System.out.println("Name of Thread " + t.getName());
		System.out.println( "GetPriority " +t.getPriority());
		System.out.println("ThreadGroup " +t.getThreadGroup());
		System.out.println( "State of thread " +t.getState());
		Thread t1=new Thread("Hello Thread"); //using Thread(String str) constructor
		t1.start();
		String str=t1.getName();
		System.out.println(str);
		}

}
