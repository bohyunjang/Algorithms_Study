package com.algorithms.BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1026_o {

	// 2017.12.06 boj 1025 보물 배열 재배열하기
	/*
	 * 옛날 옛적에 수학이 항상 큰 골칫거리였던 나라가 있었다. 이 나라의 국왕 김지민은 다음과 같은 문제를 내고 큰 상금을 걸었다.
	 * 
	 * 길이가 N인 정수 배열 A와 B가 있다. 다음과 같이 함수 S를 정의하자.
	 * 
	 * S = A[0]*B[0] + ... + A[N-1]*B[N-1]
	 * 
	 * S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자. 단, B에 있는 수는 재배열하면 안된다.
	 * 
	 * S의 최솟값을 출력하는 프로그램을 작성하시오.
	 */
	// input
	// 5
	// 1 1 1 6 0
	// 2 7 8 3 1

	static int treasure(int[] a, int[] b) {
		int result = 0;
		int[] temp1 = a;
		int[] temp2 = b;

		Arrays.sort(temp1);
		Arrays.sort(temp2);

		for (int i = 0; i < temp1.length; i++) {
			result += temp1[i] * temp2[temp2.length - i - 1];
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr1 = new int[N];
		int[] arr2 = new int[N];
		int result = 0;

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}

		result = treasure(arr1, arr2);

		System.out.println(result);

		sc.close();

	}

}
