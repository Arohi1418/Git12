package com.encapsulation;

import java.util.Set;

public class Account {
	private String acccountNumber;
	private String accountType;
	private float balance;
	private int age;

	public void setAge(int age) {
		if (age < 18 && age >= 0) {
			System.out.println("apne papa ko bulake lao");
		} else if (age >= 18 && age <= 100) {
			this.age = age;
		} else {
			System.err.println("Invalid Age " + age);
		}

	}

	public void setBalance(float balance) {
		if (balance <= 0) {
			// System.out.println("Invalid amount: "+balance); // black color if writing
			// out;
			System.err.println("Invalid amount: " + balance); // red color with error;
		} else {
			this.balance = balance;
			System.out.println("your balance is updated successfully");
		}
	}

	public float getBalance() {
		System.out.println("Your account balance is: " + balance);
		return balance;
	}

}
