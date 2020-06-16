package com.deekshith.leetcode.june;

public class HCF {

	public static void main(String[] args) {
		// HCF of 3 numbers
		
		int a = 7;
		int b = 5;
		int c = 13;
		int hcf = 0;
		int lcm = 0;
		
		
		for(int i =1 ; a >= i || b >= i ; i++) {
			if( a % i == 0 && b % i == 0 && c % i == 0) {
				hcf = i; 				
			}
		}
		lcm = (a*b*c)/hcf;
		System.out.println(lcm);
		
		System.out.println(hcf);
	}

}
