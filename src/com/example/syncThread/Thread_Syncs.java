package com.example.syncThread;

class Myth1 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread Name for Myth1 : " + Thread.currentThread().getName());
	}
}

class Myth2 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread Name for Myth2 : " + Thread.currentThread().getName());
	}
}

public class Thread_Syncs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Thread_Syncs.main()--->START");
		Myth1 m1 = new Myth1();
		Myth2 m2 = new Myth2();
		Myth2 m3 = new Myth2();
		m1.start();
		m2.start();
		m3.start();
		System.out.println("Thread_Syncs.main()--->END");
	}

}
