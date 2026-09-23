package com.example.syncThread;

class CookingTask extends Thread {
	String task;

	public CookingTask(String task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {
		System.out.println(task + " is being prepared by " + Thread.currentThread().getName());
	}
}

public class Resturant {

	public static void main(String[] args) throws InterruptedException {
		CookingTask c1 = new CookingTask("Pasta");
		CookingTask c2 = new CookingTask("Rice");
		CookingTask c3 = new CookingTask("Noodles");
		CookingTask c4 = new CookingTask("Fries");
//		c1.join();
		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}

}
