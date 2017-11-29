package com.algorithms.codeground;

import java.util.Scanner;

public class Solution_openground3 {
	// 코드그라운드 - 오픈그라운드(알고리즘자습방)
	/*
	 * 한글이 안써져요
	 * 
	 * 조건 1. 8*8 영어 대문자로 이루어진 배열이 주어진다. 2. 현재 알파벳을 기준으로 상하좌우롬나 이동할수 있다. 3. 현재 알파벳보다
	 * 나중에 나오는 알파벳으로만 이동할수 있다. 4. 단 한 번만, 'Z'에서'A'로 이동할수 있다.
	 * 
	 * 위[조건]을 만족하는 초장 길이를 출력하는 프로그램을 작성하시오.
	 * 
	 * 예제의 경우 최대 길이는 8이다.
	 * 
	 * 입력. 첫 줄에 테스트 케이스의 개수 T(1 <T < 300)가 주어진다. 각 케이스마다 8*8 영어 대문자로 이루어진 배열이 주어진다.
	 * 
	 * 출력 각 케이스마다 [조건]을 만족하는 최장 길이를 출력한다.
	 * 
	 */
	static int gksrmfdldksTjwudy(int floor) {

		int result = 0;
		
		
		
		return result;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();
		int[] result = new int[testCase];

		for (int i = 0; i < testCase; i++) {

			int floor = sc.nextInt();

			result[i] = gksrmfdldksTjwudy(floor);

		}

		for (int i = 0; i < testCase; i++) {

			System.out.println("Case # " + (i + 1));
			System.out.println(result[i]);

		}

		sc.close();

	}

}
