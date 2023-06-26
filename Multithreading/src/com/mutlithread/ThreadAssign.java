
package com.mutlithread;

public class ThreadAssign extends Thread {
	public void run()
	{  int i;
		for( i=0;i<5;i++)
			System.out.println("Hello Thread " +i);
		synchronized(this)
		{
			try {
				System.out.println("Waiting thread " +i );
				wait();
		
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread is in waiting state ");
	}

	

}
