package com.example.synchronizationThread;

class Task{
	public synchronized void printNumbers() {
		for(int i=0;i<10;i++)
		{
			System.out.println("Printing : "+i+"[ " +Thread.currentThread().getName()+" ] ");
		}
	}
}
class PrinterThread extends Thread{
	Task task;

	public PrinterThread(Task _task) {
		super();
		this.task = _task;
	}
	@Override
	public void run() {
		task.printNumbers();
	}
	
}

public class Driver {
	public static void main(String[] args) {
		Task task1 = new Task();
		PrinterThread t1 = new PrinterThread(task1);
		t1.start();
		PrinterThread t2 = new PrinterThread(task1);
		t2.start();
		
	}
}
