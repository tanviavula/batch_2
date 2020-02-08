package com.nubes.cj.basics.day26;

import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {

		Account acc1 = new Account("Mahesh", 45000);
		Account acc2 = new Account("Charan", 75000);
		Account acc3 = new Account("Balakrishna", 95000);
		Account acc4 = new Account("Balakrishna", 95000);
		Account acc5 = new Account("Balakrishna", 95000);
		Account[] accounts = new Account[] { acc1, acc2, acc3, acc4, acc5 };
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("Enter the account number:");
			int accno = sc.nextInt();

			Account account = searchAccount(accno, accounts);
			if (account != null) {
				System.out.println("1.Deposite 2. Withdraw 3. Balance 4. Exit");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:
					System.out.println("Enter the amount to deposite:");
					float amount = sc.nextFloat();
					account.deposite(amount);
					break;
				case 2:
					System.out.println("Enter the amount to withdraw:");
					float wamount = sc.nextFloat();
					account.withdraw(wamount);
				case 3:
					account.showInfo();
					break;
				case 4:
					sc.close();
					System.exit(0);

				default:
					System.out.println("Please enter choice 1-4 only");
				}

			} else {
				System.out.println("Enter a valid account number:");
			}

		}
		
	}

	

	private static Account searchAccount(int accno, Account[] accounts) {

		for (Account acc : accounts) {
			if (acc.accno == accno) {
				return acc;
			}
		}

		return null;
	}
}
