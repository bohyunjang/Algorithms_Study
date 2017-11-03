package com.algorithms.programmers;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*
 * 	2017.11.01
 * 	문자열 정
 * 	reverseStr 메소드는 String형 변수 str을 매개변수로 입력받습니다.
	str에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 String을 리턴해주세요.
	str는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
	예를들어 str이 "Zbcdefg"면 "gfedcbZ"을 리턴하면 됩니다.
 */
public class Main_98 {
	public String reverseStr(String str) {

		Integer[] charArr = new Integer[str.length()];
		String[] stringArr = new String[str.length()];
		String result = null;

		for (int i = 0; i < str.length(); i++) {
			charArr[i] = (int)str.charAt(i);
		}

/*		for (int k = 0; k < charArr.length; k++) {
			for (int i = 0; i < charArr.length -1; i++) {
				if (charArr[i] < charArr[i + 1]) {
					int temp = charArr[i];
					charArr[i] = charArr[i + 1];
					charArr[i + 1] = temp;
				}
			}

		}
*/
		
		//Arrays.sort(charArr);
		Arrays.sort(charArr, Collections.reverseOrder());
		
		
		for (int i = 0; i < charArr.length; i++) {

			//stringArr[i] = Character.toString( charArr[i]);

		}

		result = stringArr[0];
		for (int i = 1; i < charArr.length; i++) {
			result += stringArr[i];
		}

		return result;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Main_98 rs = new Main_98();
		//System.out.println(rs.reverseStr("Zbcdefg"));
		System.out.println(rs.reverseStr("Zbcdefgdsfsdfsd"));
	}
}
