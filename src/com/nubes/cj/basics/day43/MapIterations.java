package com.nubes.cj.basics.day43;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIterations {

		public static void main(String[] args) {
			
			Map<Integer, Double> map = new HashMap<>();
			
			for(int i=1;i<=10;i++) {
				map.put(i,Math.pow(i,3));
			}
			
			Set<Integer> keys = map.keySet();
			System.out.println(keys);
			Collection<Double> values = map.values();
			System.out.println(values);
			
			for(Integer key:keys) {
				System.out.println(key+" : "+map.get(key));
			}
			
		     Set<Entry<Integer, Double>> entrySet = map.entrySet();
		     
		     for(Entry<Integer, Double> entry:entrySet) {
		    	 System.out.println(entry.getKey()+" : "+entry.getValue());
		     }
		     
		  
			
		}
}
