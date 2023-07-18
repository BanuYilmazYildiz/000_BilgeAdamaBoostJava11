package com.bilgeadam.week2.lecture005;

import java.util.Scanner;

public class Question24_5adet_sayidan_enbuyuk_enkucuk {

	public static void main(String[] args) {
		/*
		 * Klavyeden 0 ile 100 arasında [0-100] 5 adet sayı al, 5 adet sayıdan en büyük
		 * ve en küçük olanı yazdıralım
		 */
		Scanner sc = new Scanner(System.in);

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int i = 1;

		while (i <= 5) {
			System.out.print("Lütfen bir sayi giriniz: ");
			int sayi = sc.nextInt();

			if (sayi >= 0 && sayi <= 100) {

				if (sayi > max) {
					max = sayi;
				}

				if (sayi < min) {
					min = sayi;
				}
				i++;
			} else {
				System.err.println("Lütfen geçerli bir sayı giriniz (0-100)");
			}

		}
		System.out.println("min= " + min + "\nmax= " + max);
		sc.close();
	}

}
