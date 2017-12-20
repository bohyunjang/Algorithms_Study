package com.algorithms.swexpart;

import java.util.Scanner;

public class Solution_1244 {

	static int[] max(int[] input) {
		int result[] = null;
		int MAX = input[0];
		int maxIndex = 0;

		// 가장 큰수 찾기
		for (int i = 0; i < input.length; i++) {

			if (MAX < input[i]) {
				MAX = input[i];
				maxIndex = i;
			}

		}

		// 가장 큰 값과 원래 값 자리교환
		int temp = input[0];
		input[0] = MAX;
		input[maxIndex] = temp;

		result = input;

		return result;
	}

	static int moneyPrize(int input, int ex) {

		int result = 0;
		int[] resultArr = null;
		String temp = String.valueOf(input);
		char[] tempCArr = temp.toCharArray();
		int[] tempArr = new int[tempCArr.length];

		// int형 배열 변환
		for (int i = 0; i < tempArr.length; i++) {
			tempArr[i] = tempCArr[i] - 48;
		}

		// 교환횟수만큼 max값을 앞으로 보낸다
		// 배열의 최대값을 보낸뒤 다시 최대값을 구하기 위한 배열 생성 수정하기..
		for (int i = 0; i < ex; i++) {
			int[] inputArr = new int[tempArr.length];
			if (i < 1) {
				inputArr = tempArr;
			} else {
				for (int j = 0; i < resultArr.length-i; j++) {
					inputArr[j] = resultArr[j+i];
				}
			}

			inputArr = max(inputArr);

		
			if (i > 0) {
				for (int j = 0; j < inputArr.length - i; j++) {
					resultArr[i + j] = inputArr[j];
				}
				inputArr = resultArr;
			} else {
				resultArr = inputArr;
			}

		} // ex

		int cnt = 0;
		for (int i = resultArr.length - 1; i >= 0; i--) {
			result += resultArr[cnt] * (Math.pow(10, i));
			cnt++;
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		int[] result = new int[tc];

		for (int i = 0; i < tc; i++) {
			int input = sc.nextInt();
			int ex = sc.nextInt();
			result[i] = moneyPrize(input, ex);
		}
		for (int i = 0; i < result.length; i++)
			System.out.println("#" + (i + 1) + " " + result[i]);

		sc.close();

	}

}
