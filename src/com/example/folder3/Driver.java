package com.example.folder3;

class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("MyThread.run()---> "+Thread.currentThread().getName());
	}
}

public class Driver {

	public static void main(String[] args) {
		System.out.println("STARTING THE MAIN :"+Thread.currentThread().getName());
		MyThread t1 = new MyThread();
		t1.start();
		MyThread t2 = new MyThread();
		t2.start();
		MyThread t3 = new MyThread();
		t3.start();
		System.out.println("ENDING THE MAIN :"+Thread.currentThread().getName());
	}

}
