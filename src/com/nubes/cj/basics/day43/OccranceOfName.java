package com.nubes.cj.basics.day43;

import java.util.Map;
import java.util.HashMap;

public class OccranceOfName {

		public static void main(String[] args) {
			String data = "ABCDABCDABCDBCDCADRADEFDASSDKJDFHIDFKJDJFKJDFKLDJFKDJFKJDKFJKDFKJHGHJKLHGFDSDFGHJKLKJHLKJHGFDFGHJKLKHGFDFGHJK";
			String arr[] = data.split("");
			Map<String,Integer> map = new HashMap<>();
			
			for(String ch:arr) {
				if(map.get(ch) == null) {
					map.put(ch,1);
				}else {
					int count = map.get(ch);
					map.put(ch,count+1);
				}
			}
		    System.out.println(map);
			
		}
}
