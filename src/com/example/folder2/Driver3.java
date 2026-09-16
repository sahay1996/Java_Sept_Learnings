package com.example.folder2;
class Threads extends Thread
{
	@Override
	public void run() {
		System.out.println("Threads.run() :: "+Thread.currentThread().getName());
	}
}
public class Driver3 {

	public static void main(String[] args) {
		System.out.println("Driver3.main()----> START ");
		Threads t1 = new Threads();
		t1.setName("My First Thread");
		t1.start();
		Threads t2 = new Threads();
		t2.setName("My Second Thread");
		t2.start();
		System.out.println("Driver3.main()-----> END");
	}

}
