package com.example.Banking;


public class TransferThread1 extends Thread {
	private BankAccount sender;
	private BankAccount receiver;

	public TransferThread1(BankAccount sender, BankAccount receiver) {
		this.sender = sender;
		this.receiver = receiver;
	}

	public void run() {
		sender.transfer(receiver, 800);
	}
}