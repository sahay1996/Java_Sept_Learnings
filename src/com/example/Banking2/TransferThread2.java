package com.example.Banking2;

public class TransferThread2 extends Thread {
	 BankAccount sender;
	 BankAccount reciever;
	public TransferThread2(BankAccount _sender, BankAccount _reciever) {
		super();
		this.sender = _sender;
		this.reciever = _reciever;
	}
	

	@Override
	public void run() {
		sender.transfer(reciever, 800);
	}
}
