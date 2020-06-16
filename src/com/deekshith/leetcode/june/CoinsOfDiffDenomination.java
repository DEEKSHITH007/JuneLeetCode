package com.deekshith.leetcode.june;

public class CoinsOfDiffDenomination {

	public static void main(String[] args) {
		int amount = 5;
		int[] deno = {1,2,5};
		int count = 0;
		
		
		for(int i =0; i<deno.length;i++) {
			if(amount % deno[i] == 0) {
				++count;
				if(deno[i] == amount) {
					++count;
				}
			}
			
		}
		
		System.out.println(count);
	}

}
