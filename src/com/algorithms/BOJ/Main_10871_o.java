package com.algorithms.BOJ;

import java.util.Scanner;

public class Main_10871_o {

	/*
	 * 17.11.12. boj X보다 작은수 10871 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이 때, A에서 X보다 작은 수를
	 * 모두 출력하는 프로그램을 작성하시오.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[N];

		for (int i = 0; i < N; i++)
			A[i] = sc.nextInt();

		for (int i = 0; i < N; i++) {
			if (A[i] < X)
				System.out.print(A[i] + " ");
		}

		sc.close();

	}

}
