package com.bilgeadam.week09.lecture005;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
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
		boolean kontrol = false;
		int sayi = 0;
		do {
			try {
				System.out.print(sorgu);
				sayi = Integer.parseInt(scanner.nextLine());
				kontrol = false;
			} catch (NumberFormatException e) {
				System.out.println("Lütfen tam sayı giriniz");
				kontrol = true;
			}
		} while (kontrol);
		return sayi;
	}

	public static LocalDate stringTarihAlma() {
		boolean kontrol = false;
		LocalDate date = null;
		do {
			try {
				date = LocalDate.parse(stringDegerAlma("Lütfen bir tarih degeri giriniz (yıl-ay-gün): "));
				kontrol = false;
			} catch (DateTimeParseException e) {
				System.out.println("Girdiğiniz tarih değeri hatalıdır lütfen örnekteki gibi giriniz; (2020-01-29)");
				kontrol = true;
			}
		} while (kontrol);
		return date;
	}

}
