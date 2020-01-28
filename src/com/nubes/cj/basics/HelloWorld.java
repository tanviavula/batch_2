package com.nubes.cj.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloWorld {
	public static void main(String args[]) {
		String data = "eat,ate,pat,apt,tea,now";
		Map<String, List<String>> map = Arrays.asList(data.split(","))
			  .stream()
			  .collect(Collectors.groupingBy(t ->{
				  char ch[] = t.toCharArray();
				  Arrays.parallelSort(ch);  
				  return new String(ch);
			  },Collectors.toList()));
		
		System.out.println(map.values());
		getGroupedAnagrams(data.split(","));
	}

	
	private static void getGroupedAnagrams(String[] arr) {
		Map<String,List<String>> map= new HashMap<>();
		for(String s:arr) {
			String key=Stream.of(s.split("")).sorted().collect(Collectors.joining());
			List<String> lst = map.get(key)!=null? map.get(key):new ArrayList<String>();
			lst.add(s);
			map.put(key, lst);
		}
		for(List<String> list:map.values()) {
			System.out.println(list);
		}
	}
	
	
	
}
