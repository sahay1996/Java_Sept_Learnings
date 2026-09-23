package com.example.folder3;

class Task {
	public synchronized void printNumbers() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Printing : " + i + " [ " + Thread.currentThread().getName() + " ]");
		}
	}
}

class PrinterThread extends Thread {
	Task task;

	PrinterThread(Task _task) {
		// TODO Auto-generated constructor stub
		this.task = _task;
	}

	@Override
	public  void run() {
		task.printNumbers();
	}
}

public class Task_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task task1 = new Task();
		PrinterThread t1 = new PrinterThread(task1);
		t1.setName("First Thread");
		t1.start();

		PrinterThread t2 = new PrinterThread(task1);
		t2.setName("Second Thread");
		t2.start();

	}

}
