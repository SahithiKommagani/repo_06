package com.mutlithread;

public class Daemonthread extends Thread {
	public void run()
	{
		while(true)
		{
			System.out.println("running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args)
	{
		Daemonthread t=new Daemonthread();
		//Daemonthread t1=new Daemonthread();
		t.setDaemon(true);//thread which runs background and provides services to other threads or appli
		t.start();
		//t1.start();
		System.out.println("JVM will exit after the execution of main thread,Daemon thread runs in background");
	}

}
