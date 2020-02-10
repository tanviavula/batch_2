package com.nubes.cj.basics.day29;

public class Account {
	int accnumber;
	String name;
	float balance;
	public Account(String name, float balance) {
		if(this.accnumber == 0) {
			this.accnumber = IDGenerator.getNewId();
		}
		this.name = name;
		this.balance = balance;
	}
	
	public void withdraw(int amount) {
		if(amount <= this.balance) {
			this.balance -= amount;
		}
		System.out.println("Current Balance:"+this.balance);
	}
	public void deposite(int amount) {
		this.balance += amount;
		System.out.println("Current Balance:"+this.balance);
	}
	
	public void showInfo() {
		System.out.println("Account number:"+accnumber);
		System.out.println("Name          :"+name);
		System.out.println("Balance       :"+balance);
	}

	public int getAccnumber() {
		return accnumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
	
}
