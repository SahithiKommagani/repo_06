//creating thread using runnable interface
package com.mutlithread;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		System.out.println("created thread using runnable interface");
		
	}

	public static void main(String[] args) {
		//Runnable r=new Thread2();
		//r.run();
		Thread2 t=new Thread2();
		Thread t1=new Thread(t);//thread(Runnable r)
		t1.start();
		Thread t2=new Thread(t,"Hello Runnable Thread"); //thread(Runnable r,String name) constructor 
		t2.start();
		String str=t2.getName();
		System.out.println(str);

	}


}
