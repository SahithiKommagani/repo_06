package com.mutlithread;

public class MainThread {

	public static void main(String[] args) {
		ThreadAssign a=new ThreadAssign();
		ThreadAssign a11=new ThreadAssign();
		a.start();
		a11.start();
		ThreadAssign1 a1=new ThreadAssign1(a);
		a1.start();
		
		

	}

}
