package com.nubes.cj.basics.day39;

import java.util.Arrays;
import java.util.Scanner;

class Store {

	private int[] arr;
	private int count = 0;

	public Store() {
		arr = new int[3];
	}

	public void addItem(int itemCode) {
		if (count < arr.length) {
			arr[count++] = itemCode;
		} else {
			int[] temp = new int[arr.length + 3];
			System.arraycopy(arr, 0, temp, 0, arr.length);
			arr = temp;
			arr[count++] = itemCode;
		}
		System.out.println("Item is added :" + itemCode);
	}

	public void removeItem(int itemCode) {

		int index = -1;
		if (count == 0) {
			System.out.println("There are no items to remove");
			return;
		}
		for (int i = 0; i < count; i++) {
			if (arr[i] == itemCode) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("Item with the code :" + itemCode + " is not found");
		} else {
			int temp[] = new int[arr.length];
			System.arraycopy(arr, 0, temp, 0, index);
			System.arraycopy(arr, index + 1, temp, index, arr.length - index - 1);

			arr = temp;
			count--;
		}
	}

	public void showItems() {
		if (count == 0) {
			System.out.println("No items are added yet.... please add items");
			return;
		}
		for (int i = 0; i < count; i++) {
			System.out.println(arr[i]);
		}
	}

}

public class ListExample {
	public static void main(String[] args) {

		Store store = new Store();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.Add 2.Remove 3.Show 4.Exit:");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the item code add:");
				int itemCode = sc.nextInt();
				store.addItem(itemCode);
				break;
			case 2:
				System.out.println("Enter the item code to remove:");
				int itemToRemove = sc.nextInt();
				store.removeItem(itemToRemove);
				break;
			case 3:
				store.showItems();
				break;
			case 4:
				sc.close();
				System.exit(1);
			default:
				System.out.println("Enter the valid choice 1-4");
			}
		}
	}
}
