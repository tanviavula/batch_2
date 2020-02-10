package com.nubes.cj.basics.day29;

public class CurrentAccount extends Account {

	private float over_draft = 10000;

	public CurrentAccount(String name, float balance) {
		super(name, balance);
	}

	@Override
	public void withdraw(int amount) {
		if (amount <= balance + over_draft) {
			this.balance -= amount;

		} else {
			System.out.println("Sorry! you don't have enough funds");
		}
		System.out.println("Current  Balance:" + this.balance);
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("OverDraft      :"+over_draft);
	}

}
