package com.example.BankingTransactions;


public class BankDemo {
	public static void main(String[] args) throws InterruptedException {
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		
		TransferThread1 gpay = new TransferThread1(account1,account2);
		TransferThread2 phonePay = new TransferThread2(account1,account2);
		
		gpay.start();
		phonePay.start();
		
		gpay.join();
		phonePay.join();
		
		System.out.println("Account 1 : " + account1.getBalance());
		System.out.println("Account 2 : " + account2.getBalance());
		
	}
}
