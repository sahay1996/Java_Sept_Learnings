package com.example.Banking4;

public class BankAccounts {
	private int balance = 1000;
	public void transfer(BankAccounts reciever,int amount)
	{
		if (balance>=amount) {
			System.out.println("[ "+Thread.currentThread().getName() +" ] checked balance : "+balance);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance = balance-amount;
			reciever.balance = reciever.balance+amount;
			System.out.println(" [ " + Thread.currentThread().getName() + " ] transferred " + amount);
		}
		else {
			System.out.println("Insufficient balance : "+Thread.currentThread().getName());
		}
	}
	public int getBalance() {
		return balance;
	}
	
	
	
}
