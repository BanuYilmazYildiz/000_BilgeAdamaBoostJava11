package com.bilgeadam.week09.lecture005;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class SiparisGunu {
	/**
	 * Bir alısveris tarihimiz olsun.
	 * 
	 * Her ayın 15'i fatura kesim tarihi
	 * 
	 * 1- Alışveriş tarihi fatura tarihinden önce mi diye kontrol edelim. Önce ise
	 * fatura tarihinden önce yazsın. Fatura tarihinden sonra yazsın.
	 * 
	 * 2- Yeni fatura tarihini yazdıralım
	 * 
	 */

	public static void main(String[] args) {

		LocalDate alisverisTarihi = LocalDate.of(2023, 07, 19);

//		int faturaGun = 15;
//
//		if (alisverisTarihi.getDayOfMonth() < faturaGun) {
//			System.out.println("Fatura Tarihinden Önce");
//		} else {
//			System.out.println("Fatura tarihinden Sonra");
//		}
//
//		LocalDate yeniFatura = alisverisTarihi.withDayOfMonth(faturaGun).plusMonths(1);
//		System.out.println("Yeni fatura tarihi : " + yeniFatura);

		LocalDate faturaTarihi = LocalDate.of(alisverisTarihi.getYear(), alisverisTarihi.getMonth(), 15);

		if (alisverisTarihi.isBefore(faturaTarihi)) {
			System.out.println("Fatura tarihine daha var...");
		} else {
			System.out.println("Fatura tarihinden sonra...");
			faturaTarihi = faturaTarihi.plusMonths(1);
			System.out.println("Bir sonraki fatura tarihi : " + faturaTarihi);
			System.out.println("Fatura tarihine kalan gün : " + alisverisTarihi.until(faturaTarihi, ChronoUnit.DAYS));
			System.out
					.println("Fatura tarihine kalan gün2 : " + ChronoUnit.DAYS.between(alisverisTarihi, faturaTarihi));
		}

		Period period = Period.between(alisverisTarihi, faturaTarihi);
		long fark = period.getDays();
		System.out.println("Fatura tarihine kalan gün3 : " + fark);

	}
}
