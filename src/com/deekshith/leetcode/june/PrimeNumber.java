package com.deekshith.leetcode.june;

public class PrimeNumber {

	public static void main(String[] args) {
		boolean isp = isPrime(15);
		System.out.println(isp);

	}
	
	public static boolean isPrime(int num) {
		if(num <= 1)
			return false;
		for(int i =2 ; i<num ;i++) {
			if(num%i == 0)
				return false;
		}
		
		return true;
		
		
	}

}
