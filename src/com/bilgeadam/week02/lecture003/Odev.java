package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		/*
		 * Klavyeden 0 girilinceye kadar sayı okumaya devam et, 0 girildiğinde sayıların
		 * toplamını ve ortalamasını yazdır
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz =");
		int toplam = 0;

		double ortalama = 0;
		int sayi = sc.nextInt();
		for (int i = 1; sayi != 0; i++) {
			toplam += sayi;
			ortalama = (double) toplam / i;
			System.out.print("Lutfen bir sayi giriniz: ");
			sayi = sc.nextInt();
		}
		System.out.println("toplam= " + toplam + " ortalama= " + ortalama);
		sc.close();

	}

}
