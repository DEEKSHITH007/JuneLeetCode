package com.deekshith.leetcode.june;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		boolean isa = isAnagram(str1, str2);
		System.out.println(isa);
		
	}
	
	public static boolean isAnagram(String str1, String str2) {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(ch1.length==ch2.length) {
			for(int i =0;i<ch2.length-1;i++) {
				if(ch1[i]!=ch2[i]) {
					return false;
				}
			}
			return true;
		}
		return false;
		
		
		
	}

}
