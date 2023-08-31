package com.bilgeadam.week09.lecture004;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DogumGunu {

	public static void main(String[] args) {
		/**
		 * Dışarıdan String olarak goğum günü alınız
		 * 
		 * Daha sonra doğduğunuz günden bu güne kadar kaç yıl, ka. gün, ka. hafta, kaç
		 * ay geçtiğini hasaplayip yazdirin
		 * 
		 * bir sonraki doğum gününe ne kadar kaldı
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Doğum tarihinizi giriniz : ");
		String tarih = sc.nextLine();
		LocalDate dogumgunu = LocalDate.parse(tarih);
		LocalDate bugun = LocalDate.now();

		System.out.println();
		System.out.print("Dogdunuz gunden bugune kadar -> " + dogumgunu.until(bugun, ChronoUnit.YEARS) + " yil, ");
		System.out.print(dogumgunu.until(bugun, ChronoUnit.MONTHS) + " ay, ");
		System.out.print(dogumgunu.until(bugun, ChronoUnit.WEEKS) + " hafta, ");
		System.out.println(dogumgunu.until(bugun, ChronoUnit.DAYS) + " gun gecti ");

		LocalDate gelecekDogumGunu = dogumgunu.withYear(bugun.getYear());

		if (gelecekDogumGunu.isBefore(bugun) || gelecekDogumGunu.isEqual(bugun)) {
			gelecekDogumGunu = gelecekDogumGunu.plusYears(1);
		}

		System.out.println("Bir sonraki dogum gunu : " + gelecekDogumGunu);
		System.out.print("Gelecek Doğum Gününe " + bugun.until(gelecekDogumGunu, ChronoUnit.MONTHS) + " ay, ");
		System.out.print(bugun.until(gelecekDogumGunu, ChronoUnit.WEEKS) + " hafta, ");
		System.out.println(bugun.until(gelecekDogumGunu, ChronoUnit.DAYS) + " gun kaldi.");
	}

}
