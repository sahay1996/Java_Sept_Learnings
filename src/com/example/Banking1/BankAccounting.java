package com.example.Banking1;

public class BankAccounting {
	private int balance = 1000;// shared resource (bank balance)
	// synchronize method for deposit operation

	public  void deposit(int amount) {
		balance += amount;
		System.out.println(" Deposited : " + amount + ", Balance : " + balance);
	}

	// synchronize method for withdrawal operation
	public  void withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawn : " + amount + ", Balance : " + balance);
		} else {
			System.out.println("Insufficient balance to withdraw : " + amount);
		}
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}