package com.deekshith.leetcode.june;

public class ReverseAstring {

	public static void main(String[] args) {
		String str = "Deekshith ";
		char[] chr = str.toCharArray();
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(chr[i]);
		}
	}

}
