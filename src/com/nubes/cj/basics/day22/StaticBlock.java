package com.nubes.cj.basics.day22;

public class StaticBlock {
		
		static int a  = 10;
		static {
			a++;
		}
		public static void main(String[] args) {
			System.out.println(a);
			System.out.println("Main method.....");
		}
		static {
			a++;
		}
		static {
			--a;
			a--;
		}
}
