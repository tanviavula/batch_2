package com.nubes.cj.basics.day13;

import java.time.LocalDateTime;
import com.nubes.cj.basics.day13.pms.Product;

public class Manager {
	
	//public static void main(String args[]) 
	
	//public static void main(final String args[])
	
	//public final static void main(String args[])
	
	//public static void main(String... args)
	
	//public final static void main(String... args)
	
	public final static  void main(final String[] args){
		
		String name = args[0];
		int age = Integer.parseInt(args[1]); // "23" , "13", "45"
		float height = Float.parseFloat(args[2]);
		System.out.println(name+" "+age+" "+height);
		System.out.println("----------------------------------------");
		int num = 25;
		int m = 5 , n = 3;
		double res = Math.sqrt(num);
		double pow = Math.pow(m, n);
		System.out.println("Sqrt of "+num +" is "+res);
		System.out.println(m+" ^ "+n +" is "+pow);
		
		Product product = new Product(1001,"Lenovo ThinkPad",56000);
		product.showInfo();
		System.out.println(LocalDateTime.now());
	
	}
	
}
