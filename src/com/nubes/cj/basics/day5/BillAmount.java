package com.nubes.cj.basics.day5;

import java.util.Scanner;

public class BillAmount {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount:");
		float amount = sc.nextFloat(); 
		float discount = 0;
		
		if(amount > 1000) {
			discount = amount * 0.1f;
		}
		
		float net_amount = amount - discount;
		System.out.println("Amount :"+amount);
		System.out.println("Discount:"+discount);
		System.out.println("Net amount:"+net_amount);
		sc.close();
		
	}
}
