package com.nubes.cj.basics.day10;

import java.util.Scanner;

public class ReportGenerator {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Select report type pdf,excel,csv ");
			String r_type = sc.nextLine();
			
			switch (r_type) {
				
			case "PDF":
			case "pdf":
				 System.out.println("You selected pdf report"); //logic 
				 break;
			case "CSV":
			case "csv":
				 System.out.println("You selected csv report"); // logic
				 break;
			case "excel":
			case "EXCEL":
				 System.out.println("You selected excel report");
				 break;
			default:
				System.out.println("We don't support the format which you are looking for..");
				break;
			}
			sc.close();
		}
}
