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

	static int numberSize(int n) {
		int temp = n;
		int cnt = 1;
		while (true) {

			if (temp > 10) {
				temp = temp / 10;
				cnt++;
			} else {
				break;
			}

		}

		return cnt;

	}

	// 입력된 정수를 자리별 배열에 저장.
	static int[] arrNum(int N) {

		int[] result = null;
		int numberSize = numberSize(N);
		int[] arr = new int[numberSize];

		// 입력된 수를 자리수에 맞춰 배열에 저장.
		int cnt = numberSize - 1;
		int r = N;
		for (int i = 0; i < numberSize; i++) {

			int temp = (int) Math.pow(10, cnt);
			arr[i] = (int) r / temp;
			r = (int) r % temp;
			cnt--;

		}

		result = arr;

		return result;
	}

	static String sameNumber(int N) {

		String result = null;
		int numberSize1 = numberSize(N);
		int[] arr = new int[numberSize1];
		int sumN = 0;

		// 입력된 수를 자리수에 맞춰 배열에 저장.
		arr = arrNum(N);

		for (int i = 0; i < arr.length; i++)
			sumN += arr[i];

		//System.out.println("SUM:: " + sumN);

		// 총합의 좌우 대칭 비교.
		int numberSize2 = numberSize(sumN);
		int[] arrSum = new int[numberSize2];
		arrSum = arrNum(sumN);

		// 배열의 첫번째항과 마지막항의 값이 같은지 비교.
		int divdeNumber = numberSize2 - 1;
		String compareResult = null;
		if (numberSize2 == 1) {
			result = "YES";
		}
		for (int i = 0; i < numberSize2 / 2; i++) {

			compareResult = compareNumber(arrSum[i], arrSum[divdeNumber]);
			if (compareResult == "NO") {
				result = compareResult;
				break;
			} else {
				result = compareResult;
				divdeNumber--;
			}

		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = 0;
		int testCase = sc.nextInt();
		String[] result = new String[testCase];
		for (int i = 0; i < testCase; i++) {
			n = sc.nextInt();
			result[i] = sameNumber(n);
			//System.out.println(result);
		}
		
		for(int i=0; i<testCase; i++) System.out.println(result[i]);

	}

}
