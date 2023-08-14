package com.bilgeadam.week02.lecture003;

public class Question11_toplam50olanakadar_sayilarin_toplami {
	/*
	 * 1 den baslayarak gelen bütün sayilari toplayalım. Toplamımız 50 yi geçene
	 * kadar çalışsın. Sonuçta toplamı yazdıralım ve bu döngünün kaç kere
	 * çalıştığını yazdıralım.
	 */

	public static void main(String[] args) {

//		int i = 1;
//		int sayac = 0;
//		int toplam = 0;
//		while (toplam <= 50) {
//			toplam += i;
//			sayac=i;
//			i++;
//			//sayac++;
//			//System.out.println("Toplam = " + toplam + "\nDongü " + sayac + " kere çalışmıltır.");
//
//		}
//		System.out.println("Toplam = " + toplam + "\nDongü " + sayac + " kere çalışmıltır.");

		int toplam = 0;
		int sayac = 0;
		for (int i = 1; toplam <= 50; i++) {
			toplam += i;
			sayac = i;
			// sayac++;
			System.out.println("Toplam = " + toplam + "\tDongü  = " + sayac);
		}
		System.out.println("Toplam = " + toplam + "\tDongü = " + sayac);
	}

}
