package com.nubes.cj.basics.day29;

public final class IDGenerator {

		private static int id = 1001;
		private IDGenerator() {
			
		}
		public static int getNewId() {
			return id++;
		}
}
