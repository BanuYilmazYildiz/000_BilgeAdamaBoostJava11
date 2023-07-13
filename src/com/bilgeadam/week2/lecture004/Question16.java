package com.bilgeadam.week2.lecture004;

public class Question16 {
	/*
	 * 1'den 100'e kadar olan çift sayıların toplamının tek sayıların toplamına
	 * oranı
	 */
	public static void main(String[] args) {

		int ciftToplam = 0;
		int tekToplam = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				ciftToplam += i;
			} else {
				tekToplam += i;
			}

		}
		double oran = (double) ciftToplam / tekToplam;
		System.out.println("Çift sayıların toplam =" + ciftToplam + "\nTek sayıların toplamı = " + tekToplam
				+ "\nÇift sayıların tek sayılara oranı = " + oran);

	}

}
