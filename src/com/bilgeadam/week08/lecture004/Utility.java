package com.bilgeadam.week08.lecture004;

import java.util.Random;
import java.util.Scanner;

public class Utility { // her yerden erişilebilir sınıflar

	/**
	 * içindeki her şey her yerden erişilebilir olmalı
	 */

	static Scanner scanner = new Scanner(System.in);

	public static String stringDegerAlma(String sorgu) {
		System.out.print(sorgu);
		return scanner.nextLine();
	}

	public static int intDegerAlma(String sorgu) {
		System.out.print(sorgu);
		return Integer.parseInt(scanner.nextLine());
	}

	public static int randomSayi() {
		Random random = new Random();
		int sayi = random.nextInt(1, 82);
		return sayi;
	}

}
