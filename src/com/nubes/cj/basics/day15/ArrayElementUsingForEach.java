package com.nubes.cj.basics.day15;

public class ArrayElementUsingForEach {
	
		public static void main(String[] args) {
			int arr[] = new int[] {1,2,3,4,9,8,7,6};
			
			for(int i:arr) {
				System.out.println(i);
			}
			
			int[][] matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
			for(int i[]:matrix) {
				for(int j:i) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
			
		}
		
		
		
}
