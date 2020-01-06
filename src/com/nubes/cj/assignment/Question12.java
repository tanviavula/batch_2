package com.nubes.cj.assignment;

import java.util.Scanner;

/*
 *  In a shopping mall, privileged customers (if they have a membership card) 
 *  are being given a 10% discount on the billed amount, 
 *  and the others are being given a 3% discount.
 *  Write a program to accept the billing amount and confirm the membership 
 *  card from the customer; 
 *  calculate and display the net amount to be paid by the customer.
 */
public class Question12 {
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the bill amount:");
		float bill_amount = sc.nextFloat();
		sc.nextLine();
		System.out.println("Do u have memebership card ?");
		String m_status = sc.nextLine();
		float discount = 0;
		if(m_status.equalsIgnoreCase("Y")) {
			discount = bill_amount * 0.1f;
		}else {
			discount = bill_amount * 0.03f;
		}
		float net_amount = bill_amount - discount;
		System.out.println("Bill Amount:"+bill_amount);
		System.out.println("Discount :"+discount);
		System.out.println("Net amount:"+net_amount);
		sc.close();
	}
}
