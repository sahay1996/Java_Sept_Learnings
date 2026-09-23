package com.example.banksSynchronizations;

public class TransferThread2 extends Thread {
	BankAccount sender;
	BankAccount reciver;

	public TransferThread2(BankAccount sender, BankAccount reciver) {
		super();
		this.sender = sender;
		this.reciver = reciver;
	}

	@Override
	public void run() {
		sender.transfer(reciver, 800);
	}
}
