package com.algorithms.study;

import java.util.Scanner;

public class Main_cynap {

	// cynap 17하반기 공채 사전코딩문제
	// http://www.synapsoft.co.kr/jsp/recruit/17.html
	// 12.2 ~ 12.17
	// 타일판은 5 × 5
	// 타일 종류는 1 ~ 4의 네 가지
	// 가로나 세로로 3개 이상 같은 타일이 연속될 경우 펑! 사라지고, 그 자리에는 위쪽의 타일들이 내려와서 메꿉니다.
	// 내려오면서 비게 된 자리는 0으로 채워집니다.

	static void printArr(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	// 가로줄 같은 값 찾기
	static int[] searchRow(int[] rowArr) {

		int[] result = new int[2];
		int count = 1; // 같은 값이 몇개인지
		int spoint = 0; // 시작점

		for (int i = 0; i < rowArr.length - 1; i++) {

			if (rowArr[i] == rowArr[i + 1] && count == 1) {
				spoint = i;
				count++;
			} else if (rowArr[i] == rowArr[i + 1]) {
				count++;
			}
		}

		result[0] = spoint;
		result[1] = count;

		return result;
	}

	// 세로줄 같은 값 찾기
	static int[] searchCol(int[] rowArr) {

		int[] result = new int[2];
		int count = 1; // 같은 값이 몇개인지
		int spoint = 0; // 시작점

		for (int i = 0; i < rowArr.length - 1; i++) {

			if (rowArr[i] == rowArr[i + 1] && count == 1) {
				spoint = i;
				count++;
			} else if (rowArr[i] == rowArr[i + 1]) {
				count++;
			}
		}

		result[0] = spoint;
		result[1] = count;

		return result;
	}

	// 세로줄(0의 개수만큼 아래로 떨어진다) 기준으로 0의 시작점, 갯수 구하기

	// 없어 진 값 채우기 수정버전
	static int[] gravity(int[] anyArr) {

		int arrLength = anyArr.length;
		int[] result = new int[arrLength];
		int temp = arrLength - 1;

		for (int i = 0; i < result.length; i++)
			result[i] = 0;
		for (int i = anyArr.length - 1; i >= 0; i--) {
			if (anyArr[i] == 0) {
			} else {
				result[temp] = anyArr[i];
				temp--;

			}
		}

		return result;

	}

	static int[][] anypung(int[][] anyArr) {
		// 배열에서 연속된 숫자 0000 으로 변환

		int[][] result = new int[5][5];
		int[] temp = new int[5];
		int[] rTemp = new int[2];

		int count = 0;
		while (true) {

			// System.out.println("row");
			for (int i = 0; i < anyArr.length; i++) {
				for (int j = 0; j < anyArr.length; j++) {
					temp[j] = anyArr[i][j];

				}
				rTemp = searchRow(temp);
				// System.out.println("가로 같은 값 // 시작점." + rTemp[0] + " 같은갯수 " + rTemp[1]);
				if (rTemp[1] > 2) {

					for (int j = rTemp[0]; j < rTemp[0] + rTemp[1]; j++) {
						anyArr[i][j] = 0;
					}
				}
			} // 가로

			// System.out.println("col");
			for (int j = 0; j < anyArr.length; j++) {
				for (int i = 0; i < anyArr.length; i++) {
					temp[i] = anyArr[i][j];

				}
				rTemp = searchCol(temp);
				// System.out.println("세로 같은 값 // 시작점 " + rTemp[0] + " 같은갯수 " + rTemp[1]);

				if (rTemp[1] > 2) {

					for (int i = rTemp[0]; i < rTemp[0] + rTemp[1]; i++) {
						anyArr[i][j] = 0;
					}
				}

			} // 세로

			// printArr(anyArr);
			// System.out.println("=============");

			// 세로 기준으로 0값 채우기
			int[] gArr = new int[5];
			int[] gTemp = new int[5];
			int zCount = 0;
			for (int j = 0; j < anyArr.length; j++) {
				for (int i = 0; i < anyArr.length; i++) {
					gArr[i] = anyArr[i][j];
				}

				gTemp = gravity(gArr);

				for (int i = 0; i < anyArr.length; i++) {
					anyArr[i][j] = gTemp[i];
				}

			}

			// printArr(anyArr);
			// System.out.println("///////////");
			// 세로 기준 내려갈 것이 없으면 끝
			if (count == 3) {
				break;
			} else {
				count++;
			}

		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[][] anyArr = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				anyArr[i][j] = sc.nextInt();
			}
		}

		anypung(anyArr);
		printArr(anyArr);

		sc.close();
	}

}
