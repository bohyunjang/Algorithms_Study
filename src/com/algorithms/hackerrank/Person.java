package com.algorithms.hackerrank;

import java.util.Scanner;

public class Person {

	private int age;

	public Person(int initialAge) {
		// Add some more code to run some checks on initialAge

		if (initialAge < 0) {
			age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		} else {
			age = initialAge;
			amIOld();
			yearPasses();
		}
	}

	public void amIOld() {
		// Write code determining if this person's age is old and print the correct
		// statement:
		if (age < 10) {

			System.out.println("You are young.");

		} else if (age < 16) {

			System.out.println("You are a teenager.");

		} else {

			System.out.println("You are old.");
		}
	}

	public void yearPasses() {
		// Increment this person's age.
		age++;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < t; i++) {
			int iniAge = sc.nextInt();
			Person p = new Person(iniAge);
			
		}

		sc.close();

	}

}
