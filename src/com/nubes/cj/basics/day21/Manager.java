package com.nubes.cj.basics.day21;

public class Manager {
	public static void main(String[] args) {

		String data = "1001-Think Pad-Lenovo-45000,1002-Studio-Dell-55000,1003-Air book-Apple-65000,1004-Next Gen-Dell-50";
		String[] arr = data.split(",");

		Product[] products = new Product[arr.length];
		int i = 0;
		for (String d : arr) {
			String pinfo[] = d.split("-");
			int pid = Integer.parseInt(pinfo[0]);
			String pname = pinfo[1];
			String brand = pinfo[2];
			float price = Float.parseFloat(pinfo[3]);
			Product p = new Product(pid, pname, brand, price);
			products[i++] = p;
		}

		for (Product p : products) {
			p.showInfo();
		}

		// < 5000 => 500000

		for (Product p : products) {
			if (p.getPrice() < 5000) {
				p.setPrice(50000);
			}
		}
		System.out.println("-------------------------");
		for (Product p : products) {
			p.showInfo();
		}

		// Give discount 20 % on all product and find the total discount amount
		// Product > 50000 20 % otherwise 10%

		float t_price = 0;
		float discount_amount = 0;
		for (Product p : products) {
			float price = p.getPrice();
			
			t_price += price;
			if (price > 50000) {
				discount_amount += price * .2;
			} else {
				discount_amount += price * .1;
			}
		}
		System.out.println("-----------------------------------");
		System.out.println("Total price:" + t_price);
		System.out.println("Discount :" + discount_amount);
		System.out.println("After Discount:" + (t_price - discount_amount));

	}
}
