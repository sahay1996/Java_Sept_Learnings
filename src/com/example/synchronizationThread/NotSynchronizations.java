package com.example.synchronizationThread;

class Kaam {
	public  void executeThread() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread execution Name is : " + Thread.currentThread().getName());
		}
	}
}

class Threadings extends Thread {
	Kaam kaam;

	public Threadings(Kaam _kaam) {
		super();
		this.kaam = _kaam;
	}

	@Override
	public void run() {
		kaam.executeThread();
	}
}

public class NotSynchronizations {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kaam kaam1 = new Kaam();
		Threadings t1 = new Threadings(kaam1);
		t1.setName("First Thread");
		t1.start();
		Threadings t2 = new Threadings(kaam1);
		t2.setName("Second Thread");
		t2.start();
	}
}
