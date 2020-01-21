package com.nubes.cj.basics.day15;

public class MatrixSum {

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 2, 3, 4 }, {5, 6, 7,8 }, { 9, 10,0, 0 } };
		int sum = 0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				sum += matrix[i][j]; 
			}
			System.out.println();
			
		}
		System.out.println("Elements sum is "+sum);
	}
}
