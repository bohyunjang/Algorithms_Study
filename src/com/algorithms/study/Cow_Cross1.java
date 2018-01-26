package com.algorithms.study;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author jb
 * @since 2018 01 26
 * @category algorithm study
 **/
public class Cow_Cross1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();
		Map<Integer, Integer> cow = new HashMap<Integer, Integer>();
		int num = 0;
		int move = 0;
		int count = 0;

		for (int i = 0; i < testCase; i++) {
			num = sc.nextInt();
			move = sc.nextInt();

			if (!cow.containsKey(num)) {
				cow.put(num, move);
			} else if (!cow.get(num).equals(move)) {
				count++;
				cow.put(num, move);
			}

		}

		System.out.println(count);
		sc.close();

	}

}
