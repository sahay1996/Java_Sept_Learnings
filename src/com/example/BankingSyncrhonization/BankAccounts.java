package com.example.BankingSyncrhonization;

public class BankAccounts {
	static int balance = 1000;

	public void transfer(BankAccounts reciever, int amount) {
		System.out.println(" [ " + Thread.currentThread().getName() + " ] 20 lines code - sending email "
				+ "notificatoin .... requested the fund transfer ");
		if (balance >= amount) {
			System.out.println(" [ " + Thread.currentThread().getName() + " ] checked balance :  " + balance);

			synchronized (this) {

				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				balance = balance - amount;
				reciever.balance = reciever.balance + amount;
				System.out.println(" [ " + Thread.currentThread().getName() + " ] transferred amount :" + amount);

			}
		} else {
			System.out.println(" [ " + Thread.currentThread().getName() + " ] Insufficient balance ");
		}

		System.out.println("BankAccounts.transfer()----> 20 lines of code -------");
	}

	public int getBalance() {
		return balance;
	}
}
