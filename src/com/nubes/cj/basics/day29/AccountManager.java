package com.nubes.cj.basics.day29;

import java.util.Scanner;

public class AccountManager {

	public static void main(String[] args) {

		Account[] accounts = new Account[1000];
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1.Create 2.Withdraw 3. Deposite 4.Show accounts 5. Reports 6. exit");
			System.out.println("Enter your choice:");
			System.out.println("--------------------------------------------------------------------");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				Account account = acceptAndGetAccount();
				if (account != null) {
					accounts[count++] = account;
				}
				break;
			case 2:
				System.out.println("Enter the account number:");
				int accno = sc.nextInt();
				boolean is_found = false;
				for (int i = 0; i < count; i++) {
					Account acc = accounts[i];
					if (acc.getAccnumber() == accno) {
						System.out.println("Enter the amount to with draw:");
						int amount = sc.nextInt();
						acc.withdraw(amount);
						is_found = true;
						break;
					}
				}
				if (!is_found)
					System.out.println("Sorry! given account number is not found:");
				break;
			case 3:
				System.out.println("Enter the account number:");
				int accno_d = sc.nextInt();
				boolean is_found_d = false;
				for (int i = 0; i < count; i++) {
					Account acc = accounts[i];
					if (acc.getAccnumber() == accno_d) {
						System.out.println("Enter the amount to with deposite:");
						int amount = sc.nextInt();
						acc.deposite(amount);
						is_found_d = true;
						break;
					}
				}
				if (!is_found_d)
					System.out.println("Sorry! given account number is not found to deposite amount:");
				break;
			case 4:
				if(count == 0) {
					System.out.println("No accounts are added yet....");
				}else {
					for(int i=0;i<count;i++) {
						Account obj = accounts[i];
						obj.showInfo();
						System.out.println("--------------------------------");
					}
				}
				break;
			case 5:
				reports(accounts,count);
				break;
			case 6:
				
				sc.close();
				System.exit(0);
			default:
				System.out.println("Enter a valid option to continue...");
			}

		}
		
		

		
	}

	private static void reports(Account[] accounts, int count) {
		
		if(count == 0) {
			System.out.println("Sorry! accounts needs to be added....");
		}else {
			System.out.println("Current Accounts:");
			float cblance = 0;
			int t_count = 0;
			for(int i=0;i<count;i++) {
				Account acc = accounts[i];
				if(acc instanceof CurrentAccount) {
					System.out.println(String.format("%d %s %f",acc.getAccnumber(),acc.getName(),acc.getBalance()));
					t_count++;
					cblance += acc.getBalance();
				}
			}
			System.out.println("Total Current Account :"+t_count);
			System.out.println("Total Currenct Account Balance:"+cblance);
			
			System.out.println("Saving Accounts:");
			float sblance = 0;
			int s_count = 0;
			for(int i=0;i<count;i++) {
				Account acc = accounts[i];
				if(acc instanceof SavingsAccount) {
					System.out.println(String.format("%d %s %f",acc.getAccnumber(),acc.getName(),acc.getBalance()));
					s_count++;
					sblance += acc.getBalance();
				}
			}

			System.out.println("Total Savings Account :"+s_count);
			System.out.println("Total Savings Account Balance:"+sblance);
		}
		
	}

	private static Account acceptAndGetAccount() {
		Scanner sc = new Scanner(System.in);
		Account account = null;

		System.out.println("Enter the name:");
		String name = sc.nextLine();
		System.out.println("Enter the Balance");
		float balance = sc.nextFloat();

		System.out.println("1.Savings 2. Current Account:");
		System.out.println("Enter your choice:");
		int type = sc.nextInt();

		if (type == 1) {
			account = new SavingsAccount(name, balance);
		} else if (type == 2) {
			account = new CurrentAccount(name, balance);
		} else {
			System.out.println("Invalid account type is entered:");
		}
	
		return account;
	}
}
