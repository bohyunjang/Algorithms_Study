package com.algorithms.hackerrank;

import java.util.Scanner;

public class Solution_dataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);
		////

		int i1 = Integer.parseInt(scan.nextLine());
		double d1 = Double.parseDouble(scan.nextLine());
		System.out.println(d1 + " " + d);
		String s1 = scan.nextLine();
		
		System.out.println(i + i1);
		System.out.println(d1 + d);
		System.out.println(s + s1);

		scan.close();
	}

}
