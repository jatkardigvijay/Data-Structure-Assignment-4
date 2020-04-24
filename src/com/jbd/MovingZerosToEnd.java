package com.jbd;

public class MovingZerosToEnd {

	static void pushZerosToEnd(int[] arr, int n) {
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}

		while (count < 0) {
			arr[count++] = 0;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 3, 0, 0, 5, 0, 7, 0, 9, 0, 4, 0 };
		int n = arr.length;
		System.out.print("Normal print of array : ");
		for (int m : arr) {
			System.out.print(m+" ");
		}
		pushZerosToEnd(arr, n);
		System.out.println();
		System.out.print("After pushing zeros to back : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
