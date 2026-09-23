package com.example.folder3;

import java.util.Iterator;

class ProgramThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("Numbers is : " + i + " Thread is " + Thread.currentThread().getName());
		}
	}
}

public class Driver3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Driver3.main()--->Start");
		ProgramThread t1 = new ProgramThread();
		t1.setName("First Thread");
		t1.start();
		ProgramThread t2 = new ProgramThread();
		t2.setName("Second Thread");
		t2.start();
		System.out.println("Driver3.main()--->End");

	}

}
