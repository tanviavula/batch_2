package com.nubes.cj.basics.day26;

public class Account {
	
		int accno;
		String name;
		float balance;
		
		public Account(String name,float balance) {
			this.accno = IdGenerator.newId();
			this.name = name;
			this.balance = balance;
		}
		
		public void withdraw(float amount) {
			if(this.balance >= amount) {
				this.balance -= amount;
			}else {
				System.out.println("Sorry! you don't have enough funds....");
			}
			showBalance();
		}
		public void deposite(float amount) {
			this.balance += amount;
			showBalance();
			
		}
		public void showBalance() {
			System.out.println("You have balance of :Rs "+this.balance);
		}
		public void showInfo() {
			System.out.println("------------------------------");
			System.out.println("Account Number:"+this.accno);
			System.out.println("Name:"+this.name);
			System.out.println("Balance: "+this.balance);
		}
}
