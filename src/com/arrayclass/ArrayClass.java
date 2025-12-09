package com.arrayclass;

import java.util.Arrays;

public class ArrayClass {
	public static void main(String[] args) {
		
		int[] CC = {1,2,3,4,5,6,7,8,9,22,3,4,55,85,65};
		
//		int index = Arrays.binarySearch(CC, 5);
//		System.out.println(index);
		
		Arrays.sort(CC);
//		Arrays.sort() modifies the array in place and returns nothing (void).
//
//		System.out.println() expects something printable → but void cannot be printed → compile error.
//		So we have to use toString converstion
		System.out.println(Arrays.toString(CC));
		
		Arrays.fill(CC, 12);//fill all value as 12
		for(int i: CC) {
			System.out.print(i+" ");
		}
		
	}
}
