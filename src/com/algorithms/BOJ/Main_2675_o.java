package com.algorithms.BOJ;

import java.util.Scanner;

public class Main_2675_o {

	/*
	 * 2017.11.12 boj 2675 문자열반복 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 T를 만든 후 출력하는
	 * 프로그램을 작성하시오. 다시 설명하자면, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 T를 만들면 된다. S에는
	 * QR Code "alphanumeric" 문자만 들어있다. QR Code "alphanumeric" 문자는
	 * 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ$%*+-./: 이다.
	 */

	static String stringAgain(int R, String S) {

		String result = "";

		for (int i = 0; i < S.length(); i++) {
			char temp = S.charAt(i);
			for (int j = 0; j < R; j++) {
				result += temp;
			}

		}

		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();
		String S = null;
		int R = 0;
		String[] result = new String[testCase];

		for (int i = 0; i < testCase; i++) {
			R = sc.nextInt();
			S = sc.next();
			result[i] = stringAgain(R, S);
		}

		for (int i = 0; i < testCase; i++) {
			System.out.print(result[i]);
			System.out.println();
		}

		sc.close();

	}

}
