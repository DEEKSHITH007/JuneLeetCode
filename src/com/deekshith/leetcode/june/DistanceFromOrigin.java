package com.deekshith.leetcode.june;

import java.util.ArrayList;

public class DistanceFromOrigin {

	public static void main(String[] args) {
		int[][] arr = {{1,3},{-2,2}};
		int k = 1;
		int m,n,dis = 0;
		
		ArrayList<Double> lis = new ArrayList<Double>();
		
		for(int i =0; i<arr.length;i++) {
				 n = (arr[i][0]- 0) * (arr[i][0]- 0);
				 m = (arr[i][1]- 0) * (arr[i][1]- 0);
				 dis = n+m;
				lis.add(Math.sqrt(dis));
			}
		
		int [][] temp = {{}} ;
		
		for(int j = 0; j<lis.size()-1;j++) {
			if(lis.get(j)>lis.get(j+1)) {
			  temp[j]	= arr[j];
			  arr[j] = arr[j+1];
			  arr[j] = temp[j];
			}
		}
		
		for(int i =  0;i<k;i++) {
			for(int j = 0;j<k;j++)
			System.out.println(arr[i][j]);
		}
		
	}

}
