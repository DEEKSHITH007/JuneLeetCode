package com.deekshith.leetcode.june;

import java.util.ArrayList;

public class MultipleOfIndex {

	public static void main(String[] args) {
		/*
		 * Input - { 1,2,3,4} Output - {24,12,8,6}
		 */

		int[] arr = { 1, 2, 3, 4 };
		int mul = 1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (i != j) {
					mul = mul * arr[j];
				}
			}
			list.add(mul);
			mul = 1;
		}
		System.out.println(list);
	}

}
