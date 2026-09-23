package com.example.folder3;

class EmailSender extends Thread {
	@Override
	public void run() {
		//When thread is in running state -->
		//Thread is doing work/task
		//from running to waiting/blocked
		//once waiting is over thread moves to runnable state
		//once cpu allows, thread moves to running state
		//once run method is completed by thread, then it moves to terminated(Dead) State
		System.out.println("EmailSender.run()---> "+Thread.currentThread().getName());
	}
}

public class Driver2 {

	public static void main(String[] args) {
		System.out.println("Driver2.main()--->Start : "+Thread.currentThread().getName());
		EmailSender t1 = new EmailSender();//Once Thread Object is created, STATE = NEW
		t1.setName("Email Thread");//Setting the name of Thread
		t1.start();//State = Runnable, start method with register the thread in thread scheduler
		//again starting the thread 
	//	t1.start();//State = Terminated/Dead  Throws java.lang.IllegalThreadStateException
		System.out.println("Driver2.main()--->End : "+Thread.currentThread().getName());
	}

}
