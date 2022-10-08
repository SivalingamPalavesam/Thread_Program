package com.java.multithreading;

public class DaemonThreadExample extends Thread {
	
	public void run()
	{
		
		for( int i = 1 ; i < 5 ; i++)
		{
			
			System.out.println(getName());
			
		}
	}

	public static void main(String[] args) {
		
		DaemonThreadExample obj = new DaemonThreadExample();
		
		DaemonThreadExample obj1 = new DaemonThreadExample();
		
		obj.setName("First name ");
		
		obj1.setName("Last name");
		
		obj.setDaemon(true);
		
		obj.setPriority(Thread.MAX_PRIORITY);
		
		obj.start();
		
		obj1.start();
	}

}
