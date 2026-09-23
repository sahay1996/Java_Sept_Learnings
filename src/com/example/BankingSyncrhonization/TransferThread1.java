package com.example.BankingSyncrhonization;

public class TransferThread1 extends Thread {
	BankAccounts sender;
	BankAccounts reciever;
	public TransferThread1(BankAccounts sender, BankAccounts reciever) {
		super();
		this.sender = sender;
		this.reciever = reciever;
	}
	@Override
	public void run() {
		sender.transfer(reciever, 200);
	}

}
