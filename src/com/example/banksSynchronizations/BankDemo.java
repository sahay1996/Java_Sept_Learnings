package com.example.banksSynchronizations;

public class BankDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BankAccount bankAccount1 = new BankAccount();
		BankAccount bankAccount2 = new BankAccount();

		TransferThread1 gpay = new TransferThread1(bankAccount1, bankAccount2);
		TransferThread2 phonepay = new TransferThread2(bankAccount1, bankAccount2);

		gpay.start();
		phonepay.start();

		gpay.join();
		phonepay.join();
		
		System.out.println("Amount in account 1 : "+bankAccount1.getBalance());
		System.out.println("Amount in account 2 : "+bankAccount2.getBalance());

	}

}
