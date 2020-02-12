package com.nubes.cj.basics.day30;

import java.util.Arrays;

public class PassByObject {

		public static void main(String[] args) {
			int[] nums = new int[] {1,2,3,4,5};
			System.out.println(Arrays.toString(nums));
			incrementByOne(nums);
			System.out.println(Arrays.toString(nums));
		}
		
		public static void incrementByOne(int[] arr) {
			
			for(int i=0;i<arr.length;i++) {
				arr[i] = arr[i] + 1;
			}
			System.out.println(Arrays.toString(arr));
		}
}
