package com.example.Banking4;

public class BankProcessor {
	public static void main(String[] args) throws InterruptedException {
		BankAccounts accounts1 = new BankAccounts();
		BankAccounts accounts2 = new BankAccounts();

		TransferThread1 gpay = new TransferThread1(accounts1, accounts2);
		TransferThread2 phonePay = new TransferThread2(accounts1, accounts2);

		gpay.start();
		phonePay.start();

		gpay.join();
		phonePay.join();

		System.out.println("Accounts1 balance : " + accounts1.getBalance());
		System.out.println("Accounts2 balance : " + accounts2.getBalance());
	}
}
