package com.nubes.cj.basics.day14;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {
		int arr[] = getRandomIntegers();
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to search: < 20");
		int ele = sc.nextInt();
		int index = searchElement(arr, ele);
		if(index != -1) {
			System.out.println("Element found at location :"+index);
			int occurance = getOccuranceCount(arr, ele);
			System.out.println("Occured :"+occurance+" times");
		}else {
			System.out.println("Element is not found");
		}
		sc.close();
	}

	public static int getOccuranceCount(int[] a, int ele) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				count++;
			}
		}
		return count;
	}
	
	public static int searchElement(int[] a, int ele) {
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (ele == a[i]) {
				index = i;
				break;
			}
		}
    	return index;
	}

	public static int[] getRandomIntegers() {
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.ceil(Math.random() * 20));
		}
		return arr;
	}
}
