package com.algorithms.BOJ;

import java.util.Scanner;

public class Main_2438_o {

	/*
	 * 2017.11.12. boj 2438 별찍기 1. 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}System.out.println();
		}
		sc.close();

	}

}