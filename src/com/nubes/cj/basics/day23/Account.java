package com.nubes.cj.basics.day23;
public class Account{
	public static String bankName = "SBI";
	
	private int accNumber;
	private String name;
	private double balance;
	
	
	public Account(int accNumber,String name,double balance) {
		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;
	}
	public void showInfo() {
		System.out.println(String.format("%s %d %s %f",bankName,accNumber,name,balance));
	}
	
	
}
