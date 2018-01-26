package com.algorithms.study;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author jb
 * @since 2018 01 26
 * @category algorithm study
 **/
public class Loap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i, j = 0;
		int N = sc.nextInt();
		int array[] = new int[N];

		for (i = 0; i < N; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array); // 오름차순 정렬

		for (i = N - 1; i > -1; i--) {
			if (j < array[i] * (N - i))
				j = array[i] * (N - i);
		}

		System.out.println(j);

	}
}
