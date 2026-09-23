package com.example.Banking3;

public class BankAccount {
	private int balance = 1000;
	public synchronized void transfer(BankAccount reciever, int amount) {
		if(balance>=amount) {
			System.out.println("T");
		}
	}
}
