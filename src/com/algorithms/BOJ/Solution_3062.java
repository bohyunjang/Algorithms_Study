package com.algorithms.BOJ;

import java.util.Scanner;

public class Solution_3062 {

	// 배열의 처음과 끝을 비교 메소드.
	static String compareNumber(int x, int y) {

		// boolean result = false;
		String result = null;

		if (x == y) {
			result = "YES";
		} else {
			result = "NO";
		}

		return result;
	}

	static String sameNumber(int N) {

		String result = null;
		int numberSize = (int) Math.log10(N);
		int[] arr = new int[numberSize];

		int cnt = arr.length;
		for (int i = 0; i < numberSize / 2; i++) {
			
			 //= compareNumber(arr[i], arr[cnt]);
			
			
		}

		result = String.valueOf(N);

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String result = null;
		int n = 0;
		int testCase = sc.nextInt();

		for (int i = 0; i < testCase; i++) {

			n = sc.nextInt();
			result = sameNumber(n);
			System.out.println(result);
		}

	}

}
