package com.algorithms.BOJ;

import java.util.Scanner;

public class Main_2443_o {

	// 2017.12.14 boj 별문제6

	// 2 * n -1, 2 * n - 3개의 별이 찍히는 알고리즘 작성
	// n : 10, ( 9 7 5 3 1)

	static void star6(int n) {

		int odd = 1;
		int empty1 = 0;
		int empty2 = 0;
		for (int i = n; i > 0; i--) {

			int temp = 2 * n - odd;

			for (int a = 0; a < empty1; a++) {
				System.out.print(" ");
			} // 처음 빈칸

			for (int b = 0; b < temp; b++) {
				System.out.print("*");
			}

			for (int c = 0; c < empty2; c++) {
				//System.out.print("2");
			} // 마지막 빈칸

			System.out.println(); // 별모양
			odd += 2;
			empty1++;
			empty2++;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		star6(n);

		sc.close();

	}

}
