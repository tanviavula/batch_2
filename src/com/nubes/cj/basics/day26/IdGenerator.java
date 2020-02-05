package com.nubes.cj.basics.day26;

public final class IdGenerator {
	
	private static int id = 1001;
	
	private IdGenerator() {
	}
	
	public static int newId() {
		//Logic 
		return id++;
	}
	
	
	

}
