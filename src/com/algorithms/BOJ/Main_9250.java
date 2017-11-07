package com.algorithms.BOJ;

import java.util.Scanner;

public class Main_9250 {

	/*
	 * 2017.11.05 boj 9250 문자열 집합 판별. 집합 S는 크기가 N이고, 원소가 문자열인 집합이다. Q개의 문자열이 주어졌을 때,
	 * 각 문자열의 부분 문자열이 집합 S에 있는 판별하는 프로그램을 작성하시오. 문자열의 여러 부분 문자열 중 하나라도 집합 S에 있으면
	 * 'YES'를 출력하고, 아무것도 없으면 'NO'를 출력한다.
	 * 
	 * 예를 들어, 집합 S = {"www","woo","jun"} 일 때, "myungwoo"의 부분 문자열인 "woo" 가 집합 S에 있으므로
	 * 답은 'YES'이고, "hongjun"의 부분 문자열 "jun"이 집합 S에 있으므로 답은 'YES'이다. 하지만, "dooho"는 모든
	 * 부분 문자열이 집합 S에 없기 때문에 답은 'NO'이다.
	 * 
	 */

	static String searchWord(String[] S, String q) {

		String result = null;

		for (int i = 0; i < S.length; i++) {
			
			boolean temp = S[i].contains(q);
			if (temp) {

				result = "YES";

			} else {

				result = "NO";
				break;

			}

		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] S = new String[n];
		for (int i = 0; i < n; i++) {
			S[i] = sc.next();
		}

		int Q = sc.nextInt();
		String[] result = new String[Q];
		for (int i = 0; i < Q; i++) {

			String q = sc.next();
			result[i] = searchWord(S, q);
		}

		for (int i = 0; i < result.length; i++)
			System.out.println(result[i]);
		sc.close();

	}

}
