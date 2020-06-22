package com.deekshith.leetcode.june;

public class Pallindrome {

	public static void main(String[] args) {
		String str = "madam";
		int length = str.length();
		char ch1 ;
		char ch2;
		for(int i=0;i<length-1;i++) {
			ch1 = str.charAt(i);
			ch2= str.charAt(length-1);
			if(ch1==ch2){
				length--;
			}
			else if(ch1!=ch2) {
				System.out.println("Not a pallindrome");
				break;
			}
			
		}
		
	}

}
