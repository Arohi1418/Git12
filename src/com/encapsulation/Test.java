package com.encapsulation;

public class Test {
	public static void main(String[] args) {
		Account shital = new Account();
		/*
		 * shital.balance=100000; shital.age=456; ///but this should not happen i.e age
		 * should 0 to 18; balance should aslo secured //no one shouldn't set the values
		 * of balance and age for security. System.out.println(shital.balance);
		 * System.out.println(shital.age);
		 */
		shital.setBalance(876);
		System.out.println(shital.getBalance());
		shital.setAge(-89);

	}

}
