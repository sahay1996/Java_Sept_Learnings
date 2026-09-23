package com.example.BankingTransactions;

public class TransferThread2 extends Thread{
	
	BankAccount sender;
	BankAccount reciever;
	public TransferThread2(BankAccount sender, BankAccount reciever) {
		super();
		this.sender = sender;
		this.reciever = reciever;
	}
	
	@Override
	public void run() {
		sender.doTransfer(reciever, 800);
	}

}
