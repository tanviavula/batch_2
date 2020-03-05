package com.nubes.cj.basics.day42.app;

public class IDGenerator {

	private static Integer cid = 1000;

	public static Integer getNewId() {
		return cid++;
	}

}
