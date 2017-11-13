package com.algorithms.BOJ;

import java.util.Scanner;

public class Main_1003 {
	
	/*
	 * 2017.11.12 boj 1003 피보나치
	 * 
	 */

	static int fibonacci(int n) {
		int k = n-1;
		int j = n-2;
		
	    if (n==0) {
	        System.out.println("0");
	        return 0;
	    } else if (n==1) {
	        System.out.println("1");
	        return 1;
	    } else {
	        return fibonacci(k) + fibonacci(j);
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();
		int N = 0;
		
		for(int i=0; i<testCase; i++) {
			N = sc.nextInt();
			fibonacci(N);
		}
			
		
		sc.close();

	}

}
