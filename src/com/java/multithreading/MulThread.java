package com.java.multithreading;

//Extends keyword use in direct access object

public class MulThread extends Thread //  inbuild class
{
	public void run()
	{
		System.out.println("Thread  is  Running");
//		stop();
		suspend();
		System.out.println("Thread is not run");
		
	}
	
	public static void main(String[] args) {
		
		MulThread obj = new MulThread();
		 
		obj.start();   //active method
		
		
	}

}
