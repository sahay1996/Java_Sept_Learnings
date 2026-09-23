package com.example.Banking2;

import java.time.LocalTime;

public class BankProcessor {

	public static void main(String[] args) throws InterruptedException {
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time: " + currentTime);
		BankAccount bankAccount1 = new BankAccount();// sender's account
		BankAccount bankAccount2 = new BankAccount();// reciever's account

		TransferThread1 phonepay = new TransferThread1(bankAccount1, bankAccount2);
		TransferThread2 gpay = new TransferThread2(bankAccount1, bankAccount2);

		phonepay.start();
		gpay.start();

		phonepay.join();
		gpay.join();

		System.out.println("Account 1 : " + bankAccount1.getBalance());
		System.out.println("Account 2 : " + bankAccount2.getBalance());
		LocalTime endTime = LocalTime.now();
		System.out.println("Current Time: " + endTime);
		System.out.println("End Time : " + " " + endTime);

	}

}
