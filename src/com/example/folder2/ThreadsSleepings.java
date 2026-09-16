package com.example.folder2;

class ThreadsSleep extends Thread {
	@Override
	public void run() {
		System.out.println("ThreadsSleep.run()-->" + Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println("This is thread : "+i);
			if (i == 5) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}

public class ThreadsSleepings {

	public static void main(String[] args) {
		ThreadsSleep t1 = new ThreadsSleep();
		t1.setName("Thread 1");
		t1.start();
	}

}
