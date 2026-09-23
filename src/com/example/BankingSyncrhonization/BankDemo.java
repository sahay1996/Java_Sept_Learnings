package com.example.BankingSyncrhonization;

public class BankDemo {
	public static void main(String[] args) throws InterruptedException {
		BankAccounts bankAccounts1 = new BankAccounts();
		BankAccounts bankAccounts2 = new BankAccounts();
		
		
		TransferThread1 gpay = new TransferThread1(bankAccounts1, bankAccounts2);
		TransferThread2 phonepay = new TransferThread2(bankAccounts1, bankAccounts2);
		
		gpay.start();
		phonepay.start();
		
		gpay.join();
		phonepay.join();
		
		System.out.println("Current balance Account 1 : "+bankAccounts1.getBalance());
		System.out.println("Current balance Account 2 : "+bankAccounts2.getBalance());
		
		
	}
}
