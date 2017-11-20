package com.algorithms.BOJ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main_14468 {

	/*
	 * 17.11.17.boj 14468 // 소가 길을 건너는 이유2 // 존의 농장에는 원형 목초지가 있고, 그 둘레에 길이 둘러져 있다.
	 * 존의 소는 매일 아침 이 길을 건너가 풀을 먹고 저녁에 다시 길을 건너가 헛간으로 돌아간다.
	 * 
	 * 이 소들은 자신의 습관대로 매일 똑같은 방법으로 길을 건넌다. 각각의 소는 원형 길의 정해진 한 점을 지나 들어오고, 다른 점을 지나
	 * 나간다. 어떤 두 소도 길 위의 같은 점을 지나가지 않는다. 이걸 지켜본 존은 이 점들을 분석해 보기로 했다. 소는 총 26마리고, A,
	 * B, ... Z라는 이름이 붙는다. 존은 52개의 점을 시계방향으로 보면서 각 점을 어떤 소가 지나가는지 기록했다. 이렇게 만들어 낸
	 * 52글자의 문자열에는 각 알파벳이 두 번씩 나타날 것이다.
	 * 
	 * 어떤 두 소는 어떤 방법으로 걷든 그 경로가 어딘가에서 만나야 될 수도 있다. 그런 소가 총 몇 쌍인지 구해 보자.
	 * 
	 */

	// 소가 풀을 먹는동안 지나가는 소들의 수 출력.
	static List<String> meetingCow(String cows) {

		ArrayList<String> cow = new ArrayList<>();

		String cowcc = "";
		cowcc += cows.charAt(0);
		for (int i = 0; i < cows.length() - 2; i++) {
			// 수정 -> 중간에 겹치는 글자들은 제거
			boolean same = false;

			char a = cows.charAt(i + 1);
			for (int j = 0; j < cows.length() - 2; j++) {
				char b = cows.charAt(j + 2);
				if (a == b) {
					same = true;
					break;
				}

			}

			if (!same && cows.charAt(0) <= cows.charAt(i + 1)) {
				cowcc += cows.charAt(i + 1);
				cow.add(cowcc);
				cowcc = "";
				cowcc += cows.charAt(0);
			} else {
				i++;
			}
		}

		return cow;
	}

	static int cowMove2(String cow) {

		int result = 0;
		Map<String, List<String>> cowcow = new HashMap<String, List<String>>();
		int cnt = 0;

		// 각 소별로 만나는 소를 찾기
		char cowNum = cow.charAt(0);
		while (true) {

			String cows = "";
			int startCow = 0;
			int endCow = 0;
			boolean indata = false;
			for (int i = 0; i < cow.length(); i++) {
				if (cowNum == cow.charAt(i) && !indata) {
					startCow = i; // 시작점.
					indata = true;
				} else if (cowNum == cow.charAt(i) && indata) {
					endCow = i; // 끝점.
					break;
				}
			} // for
			cows = cow.substring(startCow, endCow + 1);
			cowcow.put(String.valueOf(cowNum), meetingCow(cows));
			if (cnt == 56) {
				break;
			}else {
				cowNum++;
				cnt++;
			}


		} // while.

		// 각 소당 겹치는 경우의수의 총합 출력.
		cowNum = 'A';
		for (int i = 0; i < cowcow.size(); i++) {
			String cowNumSS = String.valueOf(cowNum);
			if (!cowcow.get(cowNumSS).isEmpty()) {
				result += cowcow.get(cowNumSS).size();
			}
			cowNum++;
		} // for

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String cow = sc.next();
		int result = 0;

		result = cowMove2(cow);

		System.out.println(result);

		sc.close();

	}

}
