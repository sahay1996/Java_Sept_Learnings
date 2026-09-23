package com.example.synchronizationThread;

class Kaam1 {
	public synchronized void executeKaam() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Execution is done by Thread [ " + Thread.currentThread().getName() + " ]");
		}
	}
}

class MultiThreads extends Thread {
	Kaam1 kaam1;

	public MultiThreads(Kaam1 _kaam1) {
		super();
		this.kaam1 = _kaam1;
	}

	@Override
	public void run() {
		kaam1.executeKaam();
	}
}

public class Synchronized {

	public static void main(String[] args) {
		Kaam1 kaam1 = new Kaam1();
		MultiThreads multiThreads = new MultiThreads(kaam1);
		multiThreads.setName("First Thread");
		multiThreads.start();
		MultiThreads multiThreads1 = new MultiThreads(kaam1);
		multiThreads1.setName("Second Thread");
		multiThreads1.start();
	}

}
