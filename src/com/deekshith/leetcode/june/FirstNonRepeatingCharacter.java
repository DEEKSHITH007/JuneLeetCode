package com.deekshith.leetcode.june;

import java.util.LinkedHashMap;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "loveleetcode";
		int i = 0;
		int count = 0;

		
		LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<Character, Integer>();
		
		for(i = 0; i< str.length();i++) {
			if(!hmap.containsKey(str.charAt(i))) {
				hmap.put(str.charAt(i), 1);
			}
			else {
				count  = hmap.get(str.charAt(i));
				hmap.put(str.charAt(i), ++count);
			}
		}
		
		
		
		for(Character key : hmap.keySet()) {
			if(hmap.get(key)==1) {
				System.out.println(key);
				break;
			}
		}
	}

}
