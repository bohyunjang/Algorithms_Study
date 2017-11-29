package com.algorithms.study;

import java.util.Scanner;

public class Main_cynap {

	// 타일판은 5 × 5
	// 타일 종류는 1 ~ 4의 네 가지
	// 가로나 세로로 3개 이상 같은 타일이 연속될 경우 펑! 사라지고, 그 자리에는 위쪽의 타일들이 내려와서 메꿉니다.
	// 내려오면서 비게 된 자리는 0으로 채워집니다.

	static Integer[][] anypung(Integer[][] anyArr) {
		// 배열에서 연속된 숫자 0000 으로 변환

		Integer[][] result = new Integer[5][5];

		
		
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Integer[][] anyArr = new Integer[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				anyArr[i][j] = sc.nextInt();
			}
		}

		
		for(int i=0; i<anyArr.length; i++)
			for(int j=0; j<anyArr.length; j++)
				System.out.println(anyArr[i][j]);
		
		//anypung(anyArr);

	}

}
