package com.algorithms.hackerrank;

import java.util.Scanner;

public class Solution_dataType2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble(); // original meal price
		int tipPercent = scan.nextInt(); // tip percentage
		int taxPercent = scan.nextInt(); // tax percentage
		scan.close();
		// int totalCost = (int) Math.round(/* numberToRoundHere */);

		double tipCost = mealCost * tipPercent / 100;
		double taxCost = mealCost * taxPercent / 100;
		
		int totCost = (int)Math.round(mealCost + tipCost + taxCost);
		
		System.out.println(totCost);
	}

}
