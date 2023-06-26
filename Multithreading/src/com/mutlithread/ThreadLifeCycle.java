//example demonstartes thread life cycle
package com.mutlithread;

public class ThreadLifeCycle extends Thread {

	public void run() {
		for (int i = 0; i <= 3; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread is in blocked state ");
				// e.printStackTrace();
			}
			System.out.println(i);
		}

		synchronized (this) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("Thread is running ");

	}

	public static void main(String[] args) {
		ThreadLifeCycle t = new ThreadLifeCycle();
		ThreadLifeCycle t1 = new ThreadLifeCycle();
		ThreadLifeCycle t2 = new ThreadLifeCycle();

		System.out.println("Thread State before running start method =" + t.getState());// new state -thread created but
																						// didnot run
		t.start();
		t1.start();
		t2.start();

		System.out.println("Thread State t =" + t.getState());// whenever thread started enters into runnable state

		try {
			Thread.sleep(1000);
			System.out.println("Thread State1 =" + t.getState()); // timed waiting
			synchronized (t) {
				System.out.println("notifying ");
				t.notify();
				System.out.println(" state " + t.getState()); // blocked state
			}
		} catch (InterruptedException e) {
			System.out.println("main thread interrupted");
		}

		// Thread.yield();

	}

}
