package com.bilgeadam.week2.lecture003;

import java.util.Scanner;

public class Question12 {
	/*
	 * Girilen sayının basamakları toplamını yazdırınız
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz : ");
		int sayi = sc.nextInt();

//		int toplam = 0;
//		int basamakDegeri;
//		int sayac = 0;
//
//		while (sayi > 0) {
//			basamakDegeri = sayi % 10;
//			toplam += basamakDegeri;
//			sayi = sayi / 10;
//			sayac++;
//		}
//		System.out.println("Basamak değerleri toplamı= " + toplam + "\nBasamak Sayisi= " + sayac);

		int toplam = 0;
		int sayac = 0;

		do {
			toplam += sayi % 10;
			sayi /= 10;
			sayac++;
		} while (sayi != 0);
		System.out.println("Basamaklar toplamı: " + toplam);
		System.out.println("Basamaklar sayısı: " + sayac);
		sc.close();
	}

}
