//class contains run method with wait ()
package com.mutlithread;

public class ThreadAssign1 extends Thread{
	private   ThreadAssign assign;

	public ThreadAssign1(ThreadAssign a) {
		// TODO Auto-generated constructor stub
		this.assign=a;
	}


	public void setAssign(ThreadAssign assign) {
		this.assign = assign;
	}


	public void run()
	{
		try {
			Thread.sleep(10000);
			synchronized(assign)
			{
				assign.notifyAll();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("thread notified after 10000 milliseconds");
		
	}

}
