package com.example.folder1;

public class MyThread1 extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		Payment payment = new Payment();
		payment.doPayment();
	}
}
