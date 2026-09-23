package com.example.Banking;

public class BankDemo {

	public static void main(String[] args) throws InterruptedException {

		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();

		TransferThread1 phonePay = new TransferThread1(account1, account2);

		TransferThread2 gpay = new TransferThread2(account1, account2);
		phonePay.start();
		gpay.start();

		phonePay.join();
		gpay.join();

		System.out.println("Account 1: " + account1.getBalance());
		System.out.println("Account 2: " + account2.getBalance());
	}
}