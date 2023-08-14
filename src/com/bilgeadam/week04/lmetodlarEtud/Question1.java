package com.bilgeadam.week04.lmetodlarEtud;

public class Question1 {

	public static void main(String[] args) {
		/**
		 * Ali --> {15,20,8,50,30} veli --> {5,15} ayşe --> {100,50,10,15,20,30,50}
		 */

		int[] ali = { 15, 20, 8, 50, 30 };
		int[] veli = { 5, 15 };
		int[] ayşe = { 100, 50, 10, 15, 20, 30, 50 };
//		int toplam = 0;
//		for (int i = 0; i < ali.length; i++) {
//			toplam += ali[i];
//		}
//		System.out.println(toplam);
//
//		for (int i = 0; i < veli.length; i++) {
//			toplam += veli[i];
//		}
//		System.out.println(toplam);
//
//		for (int i = 0; i < ayşe.length; i++) {
//			toplam += ayşe[i];
//		}
//		System.out.println(toplam);
		int aliAdisyon = toplamUcret(ali);
		System.out.println(ikiSayiTopla(aliAdisyon, vergiMikarı(aliAdisyon)));

	}

	public static int toplamUcret(int[] dizi) {
		int toplam = 0;
		for (int i = 0; i < dizi.length; i++) {
			toplam += dizi[i];
		}

		return toplam;
	}

	public static double vergiMikarı(int fiyat) {
		double taxRate = 0.18;
		return taxRate * fiyat;
	}

	public static double ikiSayiTopla(int fiyat, double vergili) {
		return fiyat + vergili;
	}

}
