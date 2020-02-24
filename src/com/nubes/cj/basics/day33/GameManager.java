package com.nubes.cj.basics.day33;

import java.util.Arrays;
import java.util.stream.Collectors;

interface Generator{
	public void getRandomNumbers(int num);
}
interface Sort{
	public void sort(int order);
}
interface NumberOperation extends Generator,Sort{
	public void print();
}

class NumberGenerator implements Generator,Sort,NumberOperation{

	private int[] arr;
	@Override
	public void print() {
		if(arr!=null) {
			for(int ele:arr) {
				System.out.println(ele);
			}
		}
	}

	@Override
	public void sort(int order) {
		if(arr != null) {
			if(order == 1) {
				Arrays.sort(arr);
			
			}else {
				Arrays.sort(arr);
			}
		}
	}

	@Override
	public void getRandomNumbers(int num) {
		arr = new int[num];
		for(int i = 0;i<num;i++) {
			arr[i] = (int)Math.ceil(Math.random()*100);
		}
	}

	
	
}

class NumberCleanCode implements NumberOperation{

	private Object[] arr;
	@Override
	public void print() {
		if(arr!=null) {

			for(int i=0;i<arr.length;i++) {
				if(i<arr.length-1)
					System.out.print(i+",");
				else
					System.out.print(i);
			}
		}
	}

	@Override
	public void sort(int order) {
		if(arr != null) {
			arr = Arrays.asList(this.arr).stream().sorted().collect(Collectors.toList()).toArray();
		}
	}

	@Override
	public void getRandomNumbers(int num) {
		arr = new Object[num];
		for(int i = 0;i<num;i++) {
			arr[i] = (int)Math.ceil(Math.random()*100);
		}
	}
	
}

public class GameManager {

		public static void main(String[] args) {
			NumberOperation obj = new NumberCleanCode();
			obj.getRandomNumbers(20);
			obj.sort(1);
			obj.print();
		}
}
