package com.algorithms.programmers;

import java.util.Arrays;

/*
 * 2017.11.01
 * programmers 125
	getMinMaxString 메소드는 String형 변수 str을 매개변수로 입력받습니다.
	str에는 공백으로 구분된 숫자들이 저장되어 있습니다.
	str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 String을 반환하는 메소드를 완성하세요.
	예를들어 str이 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
*/

public class Main_125 {

	public String getMinMaxString(String str) {

		String[] temp = null;
		temp = str.split(" ");
		int[] arr = new int[temp.length];
		String result = null;
		
		int max = 0;
		int min = 0;
		
		
		for (int i = 0; i < temp.length; i++) {

			arr[i] = Integer.parseInt(temp[i]);

		}

		Arrays.sort(arr);
		
		max = arr[arr.length-1];
		min = arr[0];
		
		result = min + " " + max;
		return result;
	}

	public static void main(String[] args) {
		String str = "1 2 3 4";
		Main_125 minMax = new Main_125();
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
	}
}
