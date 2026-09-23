package com.example.BankingTransactions;

public class TransferThread1 extends Thread {

	BankAccount sender;
	BankAccount reciever;
	public TransferThread1(BankAccount sender, BankAccount reciever) {
		super();
		this.sender = sender;
		this.reciever = reciever;
	}
	
	@Override
	public void run() {
		sender.doTransfer(reciever, 200);
	}
}
