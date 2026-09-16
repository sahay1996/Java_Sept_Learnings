package com.example.folder2;

class Mythread extends Thread {
	@Override
	public void run() {
		System.out.println("Mythread.run() : " + Thread.currentThread().getName());
		Payment payment = new Payment();
		payment.pay();
	}
}

public class Driver {

	public static void main(String[] args) {
		System.out.println("Driver.main()--->Main thread : " + Thread.currentThread().getName());
		Mythread thread1 = new Mythread();
		thread1.setName("Thread 1 ");
		thread1.start();
		Mythread thread2 = new Mythread();
		thread2.setName("Thread 2 ");
		thread2.start();
		System.out.println("Driver.main()---> END :" + Thread.currentThread().getName());
	}

}
class Payment{
	public void pay() {
		System.out.println("Payment.pay() : "+Thread.currentThread().getName());
	}
}
