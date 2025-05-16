package com.qtech.intership.daysix;

public class MainClass {
	public static void main(String[]args) {
		BankAccount account=new BankAccount();
		try {
			account.deposite(500);
		}
		catch (invalidAmount Exception e) {
			System.out.println("Transaction error:"+e.getMessage);
		}
		account.displayBalance();
		}
		}


