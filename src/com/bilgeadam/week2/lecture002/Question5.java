package com.bilgeadam.week2.lecture002;

import java.util.Scanner;

public class Question5 {

	/**
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// int integerSayi = scanner.nextInt();,
		System.out.println("Lütfen bir sayı giriniz: ");
		double doubleSayi = scanner.nextDouble();
		scanner.nextLine();
		double ikinciSayi = 5;

		System.out.println(doubleSayi + ikinciSayi);

		System.out.print("Lütfen adınızı giriniz: ");

		// String isim = scanner.nextLine();
		scanner.close();

	}

}
