package com.bilgeadam.week04.lecture003;

public class Question50 {

	public static void main(String[] args) {
		/*
		 * 
		 * int[] dizi = { 1, 5, 1, 9, 5, 1, 9, 8, 0, 0 };
		 * 
		 * Yukarıdaki dizide tekrar eden sayıları ve kaç kere tekrar ettiklerini
		 * yazdıralım.
		 */

		int[] dizi = { 1, 5, 1, 9, 5, 1, 9, 8, 0, 0 };
		tekrarEdenMiktar(dizi);

	}

	public static void tekrarEdenMiktar(int[] dizi) {
		boolean[] kontrol = new boolean[dizi.length]; // hepsi false yazıyorr

		for (int i = 0; i < dizi.length; i++) {
			if (kontrol[i] == true) {
				continue;
			}
			int sayac = 1;
			for (int j = i + 1; j < dizi.length; j++) {
				if (dizi[i] == dizi[j]) {
					sayac++;
					kontrol[j] = true;
				}
			}
			System.out.println(dizi[i] + " sayısı " + sayac + " tane vardır.");

		}
	}
}
