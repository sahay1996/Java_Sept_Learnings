package com.example.folder3;

class MyThred implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable Thread : "+Thread.currentThread().getName());
	}
	
}


public class Thread_Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thread_Runnable.main()--->START : "+Thread.currentThread().getName());
		MyThread myThread = new MyThread();
		Thread t1 = new Thread(myThread);
		t1.setName("Runnable My Thread");
		t1.start();
		System.out.println("Thread_Runnable.main()--->END : "+Thread.currentThread().getName());
	}

}
