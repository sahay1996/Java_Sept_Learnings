package com.example.Banking1;

public class BankingDemo {
	public static void main(String[] args) throws InterruptedException {
		BankAccounting accounting = new BankAccounting();
		Thread t1 = new Thread(()->{
			accounting.deposit(200);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread t2 = new Thread(()->{
			accounting.withdraw(100);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("Final balance : "+accounting.getBalance());
	}
}
