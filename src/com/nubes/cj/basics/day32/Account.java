package com.nubes.cj.basics.day32;
abstract class A{
	abstract void m1();
	abstract void m2();
}
abstract class B extends A{
	void m1() {
		
	}
}
class C extends B{

	@Override
	void m2() {
			
	}
	
}


public abstract class Account {

	double balance = 45000;

	public abstract double getIntrestAmount();

	public void showBalance() {
		double t_amount = getIntrestAmount() + balance;
		System.out.println("Total amount :" + t_amount);
	}
}
