package com.algorithms.programmers;

// 2017.11.01
// String 을 Int형으로 변환.
public class Main_112 {
	 public static int getStrToInt(String str) {
			
	      	int result = Integer.parseInt(str);
	      
	        return result;
	    }
	    //아래는 테스트로 출력해 보기 위한 코드입니다.
	    public static void main(String args[]) {
	        System.out.println(getStrToInt("-1234"));
	    }
}
