package com.deekshith.leetcode.june;

public class Fibinocci {

	public static void main(String[] args) {
		System.out.println(fib(10));
	}
	
	public static int fib(int n) {
		if(n==1 || n==2)
			return n;
		
			
			return fib(n-2)+fib(n-1);
	}
		

}
