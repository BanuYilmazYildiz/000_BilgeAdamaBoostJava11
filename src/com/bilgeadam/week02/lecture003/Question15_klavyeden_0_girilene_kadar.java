package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Question15_klavyeden_0_girilene_kadar {
	/*
	 * Klavyeden 0 girilinceye kadar sayı okumaya devam et, 0 girildiğinde sayıların
	 * toplamını ve ortalamasını yazdır
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz =");
		int toplam = 0;
		int i = 1;
		double ortalama = 0;
		int sayi = sc.nextInt();

		while (sayi != 0) {
			toplam += sayi;
			ortalama = (double) toplam / i;
			System.out.print("Lutfen bir sayi giriniz: ");
			sayi = sc.nextInt();
			i++;

		}
		System.out.println("toplam= " + toplam + " ortalama= " + ortalama);
		sc.close();

	}

}
