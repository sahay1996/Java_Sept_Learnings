package com.example.BankingTransactions;

public class BankAccount {
	private int balance = 1000;

	public void doTransfer(BankAccount reciever, int amount) {
		if (balance >= amount) {
			System.out.println(" [ " + Thread.currentThread().getName() + " ]  Checked balance : " + balance);
//			synchronized (this) {

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				balance = balance - amount;
				reciever.balance = reciever.balance + amount;
				System.out.println(" [ " + Thread.currentThread().getName() + " ] transferred " + amount);
//			}
		} else {
			System.out.println(" [ " + Thread.currentThread().getName() + " ]Balance is insufficient ");
		}

	}

	public int getBalance() {
		return balance;
	}

}
