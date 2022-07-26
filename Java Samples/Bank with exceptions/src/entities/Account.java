package entities;

import java.util.Random;

public class Account {

	private String holder;
	private int accountNumber;
	private double balance;

	public Account(String holder) {
		Random randomGenerator = new Random();
		this.holder = holder;
		this.balance = 0.0;
		accountNumber = 1000 + randomGenerator.nextInt(8999);
	}

	public String getHolder() {
		return holder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public boolean withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			return true;
		}

		return false;
	}

	public boolean transfer(double amount, Account destination) {
		if (withdraw(amount)) {
			deposit(amount);
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		return "Account [holder=" + holder + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}

}
