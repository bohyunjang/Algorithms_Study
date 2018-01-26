package com.algorithms.study;

import java.util.ArrayList;
import java.util.List;

public class Main_lotto {

	// 2018.1.9
	// Fisher–Yates shuffle 알고리즘 (로또 알고리즘)
	// 1~45 까지 중복되지 않게 6개를 뽑아야 한다. (간단히 줄여서 10개 중 3개를 뽑는다고 하자)
	// 참조1 http://giyatto.tistory.com/category/NHN%20NEXT
	// 참조2 https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> lotto = new ArrayList<>();
		int[] result = new int[3];
		
		for(int i=0; i<10; i++) {
			lotto.add(i+1);
		}
		
		for(int i=0; i<3; i++) {
			
			int temp = (int)(Math.random() * 10 + 1);
			result[i] = temp;
			
			
			
			
			
		}
		
	}

}
