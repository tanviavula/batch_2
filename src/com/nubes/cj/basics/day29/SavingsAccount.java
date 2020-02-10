package com.nubes.cj.basics.day29;

public class SavingsAccount extends Account {

	private float minBalance = 1000;

	public SavingsAccount(String name, float balance) {
			super(name, balance);
	}
	
	@Override
	public void withdraw(int amount) {
		if(amount > (balance - minBalance)) {
			System.out.println("Sorry! you don't have enough funds");
		}else {
			this.balance -= amount;
		}
		System.out.println("Current  Balance:"+this.balance);
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Min Balance    :"+minBalance);
	}

}
