package com.algorithms.codefights;

import java.util.Arrays;
import java.util.Scanner;

public class Main_intro3 {
	// 2017.11.07 codefights intro2.1

	/*
	 * Given an array of integers, find the pair of adjacent elements that has the
	 * largest product and return that product.
	 * 
	 * Example
	 * 
	 * For inputArray = [3, 6, -2, -5, 7, 3], the output should be
	 * adjacentElementsProduct(inputArray) = 21.
	 * 
	 * 7 and 3 produce the largest product.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int result = 0;
		String temp = sc.nextLine();
		String[] tempArr = new String[temp.length()];
		tempArr = temp.split(", ");
		int[] inputArray = new int[tempArr.length];

		for (int i = 0; i < tempArr.length; i++)
			inputArray[i] = Integer.parseInt(tempArr[i]);

		
		int max = -100;
		int multiple = 0;
		for(int i=0; i<inputArray.length -1; i++) {
			
			multiple = inputArray[i] * inputArray[i+1];
			if(max < multiple) max = multiple;
			
		}
		
		result = max;
		
		System.out.println(result);
		
	}// main

}
