package com.example.Banking4;

public class TransferThread2 extends Thread {
	BankAccounts sender;
	BankAccounts reciver;
	public TransferThread2(BankAccounts sender, BankAccounts reciver) {
		super();
		this.sender = sender;
		this.reciver = reciver;
	}
	@Override
	public void run() {
		sender.transfer(reciver, 200);
	}
}
