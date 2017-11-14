package com.algorithms.BOJ;

import java.util.Scanner;

public class Main_2839 {
	/*
	 * 2017.11.11 boj 설탕배달 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을
	 * 배달해야 한다. 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다. 상근이는 귀찮기 때문에,
	 * 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만,
	 * 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다. 상근이가 설탕을 정확하게 N킬로그램 배달해야 할
	 * 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오. 상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게
	 * N킬로그램을 만들 수 없다면 -1을 출력한다. input : 18 ///// output : 4
	 */

	static int minArr(int[][] arr) {
		int result = 0;
		int min = 9999999;

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i][1] && arr[i][1] > 0)
				min = arr[i][1];
		}
		if (min != 0) {
			result = min;
		} else {
			result = -1;
		}

		return result;
	}

	static int sugerDelivery(int N) {

		int result = 0;
		// 총 봉지의 개수.3*2 배열, [3,5,5나머지3]
		int[][] bongdari = new int[3][2];

		// 3키로, 5키로 봉지.
		int bongdari3 = N / 3;
		int namoji3 = N % 3;
		int bongdari5 = N / 5;
		int namoji5 = N % 5;

		if (namoji3 == 0) {
			// 3의 배수로 나눠보기. -> 배열에 저장
			bongdari[0][1] = bongdari3;
		}

		if (namoji5 == 0) {
			// 5의 배수로 나눠보기. 나누어 떨어지면 -> 배열에 저장.
			bongdari[1][1] = bongdari5;

		}

		if (namoji5 != 0) {
			// 5의 배수로 나눴을때 나머지가 발생하면.
			if (namoji5 % 3 == 0) {
				// 나머지가 3의 배수인지 확인, 3의배수이면 5의 지수 + 나머지의 3의 지수. -> 배열저장.
				bongdari[2][1] = bongdari5;
				bongdari[2][1] += namoji5 / 3;
			} else {
				bongdari[2][1] = 999999;
				// 5의 나머지가 3으로 나눠지지 않을경우 5의 지수를 하나씩 제하면서 3으로 나눠본다.
				for (int i = 0; i < bongdari5; i++) {
					int temp = bongdari5 - i;
					int cal = (N - (temp * 5)) % 3;
					int sum = temp + (N - (temp * 5)) / 3;
					if (cal == 0 && sum < bongdari[2][1]) {

						bongdari[2][1] = sum;

					}

				}

			}

		}

		// 저장된 배열중 가장 작은 값을 출력한다.
		result = minArr(bongdari);
		if (result == 999999)
			result = -1;

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int N = sc.nextInt();

		result = sugerDelivery(N);

		System.out.println(result);

		sc.close();

	}

}
