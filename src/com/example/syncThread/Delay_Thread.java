package com.example.syncThread;

class Working {
	public void doWorkings() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread Name is : "+Thread.currentThread().getName()+" i  is : "+i);
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

class DelayingThread extends Thread {
	Working workings;

	public DelayingThread(Working workings) {
		super();
		this.workings = workings;
	}

	@Override
	public void run() {

		workings.doWorkings();

	}
}

public class Delay_Thread {

	public static void main(String[] args) {
		System.out.println("Delay_Thread.main()--->START");
		Working working = new Working();
		DelayingThread delayingThread = new DelayingThread(working);
		delayingThread.start();
	}

}
