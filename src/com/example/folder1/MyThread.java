package com.example.folder1;

public class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("My Thread Created");
		MyThread1 myThread1 = new MyThread1();
		myThread1.setName("First Thread");
		myThread1.start();
		MyThread1 myThread2 = new MyThread1();
		myThread2.setName("Second Thread");
		myThread2.start();
		MyThread1 myThread3 = new MyThread1();
		myThread3.setName("Third Thread");
		myThread3.start();
		
	}

}
