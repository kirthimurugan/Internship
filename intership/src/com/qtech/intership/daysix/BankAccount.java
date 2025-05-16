package com.qtech.intership.daysix;

public class BankAccount {
	private int accountNo;
	private double balance;
    public int getAccountNo() {
    	return accountNo;
    }
    public void setAccountNo(int AccountNo) {
    	this.accountNo = accountNo;
    }
    public double getBalance() {
    	return balance;
    }
    public void setBalance(double balance) {
    	this.balance = balance;
    }
    public BankAccount() {
    	super();
    }
	public BankAccount(int accountNo, double balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}
void deposite(int amount) throws InvalidAmountException {
	if(balance>amount) {
		throw new InvalidAmountException("InvalidAmountException");
		balance =balance + amount;
	}
}
void withdraw(int amount)throws InsufficientFundException {
	if (balance<amount) {
		throw new InsufficientFundException(InsufficientFundException");"
				+ "
	}
}
	public String toString() {
		return "BankAccount [accNo=" + accountNo + ", balance=" + balance + "]";
	}
    void deposite (int amount) {
    	balance = balance + amount;
    }
    void withdraw(int amount)throws InsufficientFundException {
    	if(balance < amount) {
    		throw new InsufficientFundException("InsufficientFundException");
    	}
    	else {
    	balance = balance - amount;
    }
    void displayBalance(double amount){
    	System.out.println("My current balance is :"+balance);
    }	
}

