package com.bilgeadam.week3.lecture003;

public class Question36_dizideki_sayilar_toplamı {

	public static void main(String[] args) {
		// dizideki bütün sayıların toplamını yazdıralım
		// 0, 120, 5, 85, -256, 16, 1258, 81, 14
		// dizinin her elemanı için;
		// çift ise çift tek ise tek yazdıralım.

		int[] sayilar = { 0, 120, 5, 85, -256, 16, 1258, 81, 14 };

		int toplam = 0;
		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
			if (sayilar[i] % 2 == 0) {
				System.out.println(sayilar[i] + "\t-> çift");
			} // if
			else
				System.out.println(sayilar[i] + "\t\t-> tek ");
		} // for
		System.out.println("Dizideki sayıların toplamı: " + toplam);

	}// main

} // class
