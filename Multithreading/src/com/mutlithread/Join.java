package com.mutlithread;

public class Join  extends Thread{
	public void run()
	{
		for(int i=1;i<=3;i++){    
			   try{    
			    Thread.sleep(1000);    
			   }catch(Exception e){System.out.println(e);}   
			   Thread.yield();
			  System.out.println(i);    
			  }    
		 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Join j=new Join();
     Join j1=new Join();
     Join j2=new Join();
     j.start();
     try {
		j.join();//first the thread 1 will excecute then after termination of thread1 thread2,3 will execute
		System.out.println(j.getState());//terminated
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     j1.start();
     j2.start();
     System.out.println(Thread.currentThread().getName() + " is currently running");
     System.out.println("Priority of thread1 " +j.getPriority());
     System.out.println("Priority of thread2 " +j1.getPriority());
     System.out.println("Priority of thread3 " +j2.getPriority());
	}

}
