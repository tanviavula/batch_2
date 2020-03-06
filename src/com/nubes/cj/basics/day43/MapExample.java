package com.nubes.cj.basics.day43;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
		public static void main(String[] args) {
			Map<Integer,String> map = new HashMap<Integer, String>();
			
			map.put(1001,"Krish");
			map.put(1002,"Mahesh");
			map.put(1003,"Charan");
			map.put(1001,"Krishna");
			
			
			if(map.get(1001) != null) {
				map.put(1001,map.get(1001).toUpperCase());
			}
			
			System.out.println(map);
			
		}
}
