package com.algorithms.BOJ;

import java.util.Scanner;

public class Main {

	// 입력된 숫자의 자리수 구하기.
	static int numberSize(int n) {

		int temp = n;
		int cnt = 1;
		while (true) {

			if (temp > 10) {
				temp = temp / 10;
				cnt++;
			} else {
				break;
			}

		}

		return cnt;
	}

	// 입력된 수를 자리수에 맞춰 배열에 저장.
	static int[] arrNum(int n) {

		int[] result = null;
		int numberSize = numberSize(n);
		result = new int[numberSize];

		int cnt = numberSize - 1; // 배열의 크기는 원사이즈 -1.
		int r = n;
		for (int i = 0; i < numberSize; i++) {

			int temp = (int) Math.pow(10, cnt);
			result[i] = (int) r / temp;
			r = (int) r % temp;
			cnt--;

		}

		return result;
	}

	// 입력된 배열을 뒤집기.
	static int[] arrRevers(int[] arr) {

		int[] result = new int[arr.length];
		int temp = arr.length - 1; // 배열은 0부터 시작.

		for (int i = 0; i < arr.length; i++) {

			result[i] = arr[temp];
			temp--;

		}

		return result;

	}

	// 배열의 처음과 끝을 비교. (같으면 YES, 다르면 NO)
	static String compareArr(int x, int y) {

		String result = null;

		if (x == y) {
			result = "YES";
		} else {
			result = "NO";
		}

		return result;

	}

	// 입력된 숫자와 숫자의 대칭숫자의 합이 대칭인지 판별하는 메소드.
	static String sameNumber(int n) {

		String result = null;
		// 입력된 숫자의 길이 저장.
		int inputNumberSize = numberSize(n);
		int[] arr = new int[inputNumberSize]; // 입력된 수가 저장된 배열.
		int[] arrR = new int[inputNumberSize]; // 뒤집은 수가 저장된 배열.
		int sum = 0; // 입력된 수와 뒤집은 수를 합.

		// 입력된 수를 자리수에 맙춰서 배열에 저장.
		arr = arrNum(n);

		// 저장된 배열을 이용하여 뒤집은 수를 배열에 저장.
		arrR = arrRevers(arr);

		// 뒤집은 배열을 int형으로 변환.
		int nr = 0;
		int rSize = inputNumberSize - 1;
		for (int i = 0; i < inputNumberSize; i++) {
			nr += arrR[i] * Math.pow(10, rSize);
			rSize--;
		}

		// 입력뒨 수, 뒤집은 수 합.
		sum = nr + n;

		int sumSize = numberSize(sum);
		int[] arrSum = new int[sumSize];

		// 대칭을 비교하기 위해 배열에 저장.
		arrSum = arrNum(sum);

		// 대칭 비교.
		// 1자리는 대칭이므로 YES, 2자리 이상일때에는 비교 후 결과 출력.
		int cnt = sumSize / 2;
		int divdeSize = sumSize - 1;
		String compareResult = null;
		if (cnt > 0) {

			int i = 0;
			while (true) {

				compareResult = compareArr(arrSum[i], arrSum[divdeSize - i]);
				i++;
				cnt--;
				if (compareResult.equals("NO") || cnt == 0)
					break;

			}

		} else {
			compareResult = "YES";
		}

		result = compareResult;

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// testcase, 케이스별 변수 입력.
		int n = 0;
		int testCase = sc.nextInt();
		String[] result = new String[testCase];
		for (int i = 0; i < testCase; i++) {
			n = sc.nextInt();
			result[i] = sameNumber(n);

		}

		for (int i = 0; i < testCase; i++)
			System.out.println(result[i]);
		
		sc.close();

	}

}
