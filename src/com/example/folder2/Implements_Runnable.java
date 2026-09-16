package com.example.folder2;

class Thre implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thre.run()--->Implementation of thread " + Thread.currentThread().getName());

	}

}

public class Implements_Runnable {

	public static void main(String[] args) {
		Thre t1 = new Thre();
		Thread tX = new Thread(t1);
		tX.start();
	}

}
