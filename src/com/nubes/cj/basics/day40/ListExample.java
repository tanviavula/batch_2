package com.nubes.cj.basics.day40;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListExample {
	public static void main(String[] args) {
		List<String> blist = Stream.of("Rajesh", "Manonj", "Charan", "Govind").collect(Collectors.toList());
		List<String> glist = Stream.of("Rani","Swathi","Tanvi","Dhatri","Aruna").collect(Collectors.toList());
		
		List<String> allPlayers = new ArrayList<String>();
		allPlayers.addAll(blist);
		allPlayers.addAll(glist);
		System.out.println(allPlayers);
	    System.out.println(allPlayers.containsAll(glist));
	    
	    //allPlayers.stream().forEach(e->System.out.println(e));
	    
	    Iterator<String> iterator = allPlayers.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			if(name.equals("Tanvi")) {
				iterator.remove();
				System.out.println(name +" is removed from the list");
			}else {
				System.out.println(name);
			}
		}
		System.out.println(allPlayers);
		
		ListIterator<String> listIterator = allPlayers.listIterator();
		while(listIterator.hasNext()) {
			String name = listIterator.next();
			System.out.print(name+" ");
		}
		System.out.println("\nReverse order:\n");
		while(listIterator.hasPrevious()) {
			String name = listIterator.previous();
			if(name.equals("Rani")) {
				listIterator.add("Venkat");			
			}
			System.out.print(name+" ");
		}
		System.out.println(allPlayers);
	}
}
