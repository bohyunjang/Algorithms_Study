package com.algorithms.hackerrank;

import java.util.Scanner;

public class Solution_day31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String ans = "";

		// if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
		if (n % 2 == 1 || (n > 5 && 21 > n)) {
			ans = "Weird";
		} else {
			ans = "Not Weird";
		}
		System.out.println(ans);

	}

}
