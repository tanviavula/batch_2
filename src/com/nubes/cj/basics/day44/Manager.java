package com.nubes.cj.basics.day44;

public class Manager {

		public static void main(String[] args) {
			
			MyList<Integer> list = new MyList<>();
			list.add(1001);
			list.add(2001);
			list.add(3001);
			
			
			MyIterator<Integer> it = list.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
}
