package com.bilgeadam.week2.lecture002;

import java.util.Scanner;

public class Question6 {
	/**
	 * Dairenin alanı ve çevresi
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double pi = 3.14;
		System.out.print("Lutfen dairenin yaricapini giriniz r= ");
		double r = scanner.nextDouble();
		double alan = pi * r * r;
		double cevre = 2 * pi * r;
		System.out.println("Dairenin; \nAlanı= " + alan + "\nCevresi= " + cevre);
		scanner.close();

	}

}
