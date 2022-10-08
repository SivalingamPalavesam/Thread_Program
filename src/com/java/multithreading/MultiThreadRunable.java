package com.java.multithreading;

public class MultiThreadRunable implements Runnable {	
	@Override
	public void run() 
	{
		System.out.println("Thread is Runnng");
	}

	public static void main(String[] args) {
		 
		MultiThreadRunable obj = new MultiThreadRunable();
		
		Thread  t1 = new  Thread(obj);
		
		t1.start();
	}

}
