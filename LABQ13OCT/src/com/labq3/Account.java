package com.labq3;

public class Account {

	private int balance = 500;

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amount) {

		balance = balance - amount;
	}

}
