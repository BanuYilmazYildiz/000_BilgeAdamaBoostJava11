package com.bilgeadam.week09.lecture004;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateOrnek {

	public static void main(String[] args) {

		Date date; // eski

		// Daha güncel daha iyi bir yapı
		LocalDate date1 = LocalDate.now(); // yıl - ay -
		System.out.println(date1);

		LocalDate date2 = LocalDate.of(2023, 12, 10); // içeriye yazılan tarihi getirir
		System.out.println(date2);

		long gun = date1.until(date2, ChronoUnit.DAYS);
		System.out.println(gun);
		long hafta = date1.until(date2, ChronoUnit.WEEKS);
		System.out.println(hafta);
		long ay = date1.until(date2, ChronoUnit.MONTHS);
		System.out.println(ay);
		long yil = date1.until(date2, ChronoUnit.YEARS);
		System.out.println(yil);

//		System.out.println(date2.plusDays(25)); // gün ekleme
////		System.out.println(date1.plusDays(25));
//		System.out.println("Ay ekelem -> " + date2.plusMonths(2)); // ay ekleme
//		System.out.println("Yıl ekleme -> " + date2.plusYears(4)); // yıl ekleme
//		System.out.println("Hafta ekleme -> " + date2.plusWeeks(8)); // hafta ekleme
//		System.out.println("Gün çıkarma -> " + date2.minusDays(5));
//		System.out.println();
//		System.out.println("Yıl : " + date2.getYear());
//		System.out.println("Ay : " + date2.getMonthValue()); // date.2getMonth bana ay ismiyle döner
//		System.out.println("Gün : " + date2.getDayOfMonth());
//		System.out.println("Yılın kaçıncı günü : " + date2.getDayOfYear());
//		System.out.println("Günün adi : " + date2.getDayOfWeek());
//		System.out.println(date1.isBefore(date2));
//		System.out.println(date1.isAfter(date2));
//
//		Scanner sc = new Scanner(System.in);
////		System.out.print("Lütfen yıl giriniz : ");
////		int yil = sc.nextInt();
////		System.out.print("Lütfen ay giriniz : ");
////		int ay = sc.nextInt();
////		System.out.print("Lütfen gün giriniz : ");
////		int gun = sc.nextInt();
////		LocalDate date3 = LocalDate.of(yil, ay, gun);
////		System.out.println(date3);
//
//		LocalDate date4 = LocalDate.parse("2023-12-10");
//		System.out.println(date4);
//
//		LocalDate date5 = LocalDate.parse(sc.nextLine());
//		System.out.println(date5);

	}

}
