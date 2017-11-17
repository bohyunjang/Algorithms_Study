package com.algorithms.BOJ;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_14467_o {

	/*
	 * 2017. 11. 07 BOJ 소가 건너는 이유. 존이 할 일은 소가 길을 건너는 것을 관찰하는 것이다. 존은 소의 위치를 N번
	 * 관찰하는데, 각 관찰은 소의 번호와 소의 위치 하나씩으로 이루어져 있다. 존은 소를 10마리 가지고 있으므로 소의 번호는 1 이상 10
	 * 이하의 정수고, 소의 위치는 길의 왼쪽과 오른쪽을 의미하는 0과 1 중 하나다. 이 관찰 기록을 가지고 소가 최소 몇 번 길을 건넜는지
	 * 알아보자. 즉 같은 번호의 소가 위치를 바꾼 것이 몇 번인지 세면 된다.
	 */

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
