package com.nubes.cj.basics.day17;

public class StringMethods {
	public static void main(String[] args) {
		String data = "Lakshman,Kr ishna,Nareen,Basha,Suresh,M ahesh,Jayesh,Ramesh,CV ,Raman,Rajesh";
		String[] names = data.split(",");
		/*
		 * for(String name:names) { System.out.println(name); }
		 */
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		// Print names which are starts with letter S or N
		System.out.println("__________________________________________");
		for (String name : names) {
			if (name.startsWith("S") || name.startsWith("N")) {
				System.out.println(name);
			}
		}
		// Print the names which ends with sh
		System.out.println("------------------------------------------------");
		for (String name : names) {
			if (name.endsWith("sh")) {
				System.out.println(name);
			}
		}

		// Print the names which contains "sh"

		System.out.println("--------------------------------------------------");
		for (String name : names) {
			if (name.contains("sh")) {
				System.out.println(name);
			}
		}
		// Print all the names having < 5 Characters
		System.out.println("-----------------------------------------------------");
		for (String name : names) {
			if (name.length() < 6) {
				System.out.println(name);
			}
		}

		// Print first 3 character of the all names and print in uppercase

		for (String name : names) {
			name = name.replace(" ", "");
			
			if (name.length() >= 3) {
				String subName = name.substring(0, 3).toUpperCase(); // 0 1 2
				System.out.println(subName);
			}
		}
		
		String name = "  Krish  ";
		System.out.println(name.trim().length());
		
		String n = "Kri sh na";
		
		
		// "Kri " => "KRI " => " " => "" => 0
		System.out.println(n.substring(0,4).toUpperCase());
		System.out.println(n.substring(0,4).toUpperCase().substring(3));
		System.out.println(n.substring(0,4).toUpperCase().substring(3).trim());
		System.out.println(n.substring(0,4).toUpperCase().substring(3).trim().length());
				
		// Display the names which are palindrome 
		System.out.println("------------- Palindrome strings ------------------");
		String s_names = "liril,amma,dad,manoj,suresh,12321,hello";
		
		for(String ele:s_names.split(",")) {
			if(isPalindrome(ele)) {
				System.out.println(ele);
			}
		}
		String emailData = "lakshman.a@heraizen.com,krish.t@wipro.co.in,nareen.b@ibm.in,balu.m@tesco.com";
		// Print only brand/company name of the employees who attended workshop
		System.out.println("------------------------------------------------------");
		String emails[] = emailData.split(",");
		for(String email:emails) {
			String d[] = email.split("@");
			String bname = d[1];
			int index = bname.indexOf(".");
			String cname = bname.substring(0,index);
			cname = cname.substring(0,1).toUpperCase().concat(cname.substring(1));
			System.out.println(cname);
			
		}
		
	}
	
	public static boolean isPalindrome(String str) {
			int n = str.length();
		   for(int i=0,j=n-1; i <= n / 2 ;i++,j--) {
			   if(str.charAt(i) != str.charAt(j)) {
				   return false;
			   }
		   }
		   return true;
	}

}
