package com.example.Banking2;

public class BankAccount {
	private int balance = 1000;

	public synchronized void transfer(BankAccount reciever, int amount) {
		if (balance >= amount) {
			System.out.println(" [ " + Thread.currentThread().getName() + " ] Checked balance : " + balance);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance = balance - amount;
			reciever.balance = reciever.balance + amount;
			System.out.println(" [ " + Thread.currentThread().getName() + " ] transferred " + amount);
		} else {
			System.out.println("[ " + Thread.currentThread().getName() + " ] Insufficient Balance");
		}

	}
	public int getBalance() {
		return balance;
	}
	
}
