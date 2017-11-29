package com.algorithms.codeground;

import java.util.Scanner;

public class Solution_openground1 {
	// 코드그라운드 - 오픈그라운드(알고리즘자습방)
	// 국거영역 - 캠브리지 대학의 연구결과
	// 첫번째 마지막 글짜 제외 바꾸기

	static int cambridge(String word) {

		String sResult = String.valueOf(word.charAt(0));

		for (int i = word.length() - 2; i > 0; i--)
			sResult += word.charAt(i);

		sResult += word.charAt(word.length() - 1);

		int result = Integer.valueOf(sResult);
		
		return result;

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();
		int result = 0;

		for (int i = 0; i < testCase; i++) {

			String inputData = sc.next();
			if (inputData.length() < 2) {
				result = Integer.valueOf(inputData);

			} else {
				String tempData = String.valueOf(inputData);
				result = cambridge(tempData);

			}
			
			System.out.println("Case #" + (i + 1));
			System.out.println(result);

		}

		sc.close();

	}

}
