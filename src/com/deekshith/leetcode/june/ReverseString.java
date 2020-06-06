package com.deekshith.leetcode.june;

public class ReverseString {

	public static void main(String[] args) {
		char[] arr = {'h','e','l','l','o'};
		char[] arr2 = new char[arr.length];
		int j = 0;
		for(int  i = arr.length-1; i>=0;--i) {
			arr2[j] = arr[i];
			++j;
		}
		
		for(int i = 0; i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
	}

}
