package com.nubes.cj.basics.day34;

import java.io.Serializable;
import java.util.Arrays;

interface Generator {
	public void generateRandomInt(int n);

	public void showNumbers();

	public int[] getElements();

	default void sortDesc() {
		
	}
	
	default void sort() {
		int arr[] = getElements();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
	}
}

class ArrangeElement implements Generator {

	private int arr[];

	@Override
	public void generateRandomInt(int n) {
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (int) Math.ceil(Math.random() * n);
		}
	}

	@Override
	public void showNumbers() {
		System.out.println(Arrays.toString(arr));

	}

	@Override
	public int[] getElements() {
		return arr;
	}

}

public class Manager {

	public static void main(String[] args) {

		Generator obj = new ArrangeElement();
		obj.generateRandomInt(50);
		obj.showNumbers();
		obj.sort();
		obj.showNumbers();
	}
}
