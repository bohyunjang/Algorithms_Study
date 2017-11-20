package com.algorithms.study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main_8983_study {

	// 17.11.18 토요일스터디
	// 백준 18983 사냥꾼
	
	static int hunter(int[] mArr, int[][] nArr, int L) {
		
		int result = 0;
		
		Arrays.sort(mArr);
		Arrays.sort(nArr);
 
		
		System.out.println("hunter!");
		
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt(); // 사대수
		int N = sc.nextInt(); // 동물수
		int L = sc.nextInt(); // 사정거리
		int[] mArr = new int[M]; // 사대
		int[] mResult = new int[M];
		int[][] nArr = new int[N][2]; // 동물
		
		for(int i=0; i<M; i++) {
			mArr[i] = sc.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			nArr[i][0] = sc.nextInt(); // 동물 i의 위치 x좌표
			nArr[i][1] = sc.nextInt(); // 동물 i의 위치 y좌표
		}
		
		for(int i=0; i<M; i++) mResult[i] = hunter(mArr, nArr, L);
		
		for(int i=0; i<M; i++) System.out.println(mResult[i]);
		
		sc.close();

	}

}
