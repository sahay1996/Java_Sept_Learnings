package com.example.folder2;

class Th1 implements Runnable {

	@Override
	public void run() {//running the thread
		// TODO Auto-generated method stub
		System.out.println("Th1.run()---> " + Thread.currentThread().getName());
		System.out.println("Th1.run()---> " + Thread.currentThread().getName());
		System.out.println("Th1.run()---> " + Thread.currentThread().getName());
		System.out.println("Th1.run()---> " + Thread.currentThread().getName());
		System.out.println("Th1.run()---> " + Thread.currentThread().getName());
		System.out.println("Th1.run()---> " + Thread.currentThread().getName());
		System.out.println("Th1.run()---> " + Thread.currentThread().getName());
	}
	//Thread execution ended/dead

}

public class Dagha {

	public static void main(String[] args) {
		Th1 th1 = new Th1();
		Thread a0 = new Thread(th1);//new born thread
		a0.setName("My Thread");//setting the name
		a0.start();//runnable
		a0.start();//runnable
	}

}
