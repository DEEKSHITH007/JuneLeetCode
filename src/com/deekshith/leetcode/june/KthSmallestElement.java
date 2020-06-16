package com.deekshith.leetcode.june;

public class KthSmallestElement {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 5, 6, 2 };
		int k = 2;
		int temp = 0;
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j-1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		

		 System.out.println(arr[k-1]);
	}

}
