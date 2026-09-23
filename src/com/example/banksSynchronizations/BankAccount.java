package com.example.banksSynchronizations;

public class BankAccount {
	private int balance = 1000;

	public synchronized  void transfer(BankAccount reciver, int amount) {
		if (balance >= amount) {
			System.out.println(" [ " + Thread.currentThread().getName() + " ]  Checked balance : " + balance);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance = balance - amount;
			reciver.balance = reciver.balance + amount;
			System.out.println(" [ " + Thread.currentThread().getName() + " ] transferred " + amount);
		} else {
			System.out.println("Insufficient Balance : " + Thread.currentThread().getName());
		}
	}

	public int getBalance() {
		return balance;
	}
}
