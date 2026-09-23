package com.example.Banking;

public class BankAccount {

	private int balance = 1000;

	public synchronized void transfer(BankAccount receiver, int amount) {
		if (balance >= amount) {
			System.out.println("[" + Thread.currentThread().getName() + "] checked balance: " + balance);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance = balance - amount;
			receiver.balance = receiver.balance + amount;
			System.out.println("[" + Thread.currentThread().getName() + "] transferred " + amount);
		} else {
			System.out.println("[" + Thread.currentThread().getName() + "] Insufficient Balance");
		}
	}

	public int getBalance() {
		return balance;
	}

}