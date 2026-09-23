package com.example.folder3;

class Cooking extends Thread {
	@Override
	public void run() {
		System.out.println("Cook Started Preparing the Order [" + Thread.currentThread().getName() + " ]");
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Food Prepartion Done [" + Thread.currentThread().getName() + " ]");
	}
}

public class Driver1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.currentThread().setName("Waiter");
		System.out.println("Waiter Took the Order [" + Thread.currentThread().getName() + " ] ");
		Cooking t1 = new Cooking();
		t1.setName("Cook");
		t1.start();
		t1.join();
		System.out.println("Waiter Served the Food [" + Thread.currentThread().getName() + " ]");
	}

}
