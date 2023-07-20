package com.bilgeadam.week3.lecture003;

public class Question38 {

	public static void main(String[] args) {
		/*
		 * dizide 13 sayısına denk gelene kadar devam edelim 13 sayısı bukunduktan sonra
		 * ondan bir sonraki sayı 13 değil ise sonraki sayıyı toplama ekleyelim 1, 13,
		 * 13, 13, 5, 1
		 * 
		 */

		int sayilar[] = {  13, 1, 13, 13, 13, 5, 1, 13, 5, 13 };

		int toplam = 0;
		for (int i = 0; i < sayilar.length - 1; i++) {
			if (sayilar[i] == 13 && sayilar[i + 1] != 13) {
				toplam += sayilar[i + 1];

			} // if
		} // for
		System.out.println("toplam: " + toplam);

	}// main

}
// class
