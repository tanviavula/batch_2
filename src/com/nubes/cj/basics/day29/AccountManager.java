package com.nubes.cj.basics.day29;

import java.sql.Savepoint;

public class AccountManager {

		public static void main(String[] args) {
		/*
		 * Account acc1 = new Account("Lakshman", 65456); Account acc2 = new
		 * Account("Manoj", 2556); Account acc3 = new Account("Krishna", 45456); Account
		 * acc4 = new Account("Basha", 45456);
		 * 
		 * SavingsAccount sb1 = new SavingsAccount("Naresh", 100); SavingsAccount sb2 =
		 * new SavingsAccount("Ramesh", 200); SavingsAccount sb3 = new
		 * SavingsAccount("Suresh", 700);
		 * 
		 * CurrentAccount cb1 = new CurrentAccount("JSL", 898765); CurrentAccount cb2 =
		 * new CurrentAccount("Nubes", 88765); CurrentAccount cb3 = new
		 * CurrentAccount("J4ALL", 98765);
		 * 
		 * Account[] accArr = new Account[] {acc1,acc2,acc3,acc4, sb1,sb2,sb3,
		 * cb1,cb2,cb3};
		 * 
		 * float cacc_blance = 0; float sacc_blance = 0;
		 * 
		 * for(Account obj : accArr) { if(obj instanceof CurrentAccount) { cacc_blance
		 * += obj.getBalance(); }else if(obj instanceof SavingsAccount) { sacc_blance +=
		 * obj.getBalance(); } }
		 * System.out.println("Balance of Current accounts :"+cacc_blance);
		 * System.out.println("Balance of Savings accounts :"+sacc_blance);
		 */
			Account[] account = new Account[100];
			int count = 0;
			while(true) {
				System.out.println("1.Create 2.Withdraw 3. Deposite 4. exit");
				System.out.println("1.Saving 2. Current");
			
			}
		
		}
}
