package com.algorithms.codeground;

import java.util.Scanner;

public class Solution_openground2 {
	// 코드그라운드 - 오픈그라운드(알고리즘자습방)
	// 수학영역 - 카드쌓기
	// N층의 카드를 쌓는데 필요한 카드의 갯수

	static int cardTower(int floor) {

		int result = 0;
		int ff = floor * floor;

		result = (3 * ff + floor) / 2;

		return result;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();
		int[] result = new int[testCase];

		for (int i = 0; i < testCase; i++) {

			int floor = sc.nextInt();

			result[i] = cardTower(floor);

		}

		for (int i = 0; i < testCase; i++) {

			System.out.println("Case # " + (i + 1));
			System.out.println(result[i]);

		}

		sc.close();

	}

}
