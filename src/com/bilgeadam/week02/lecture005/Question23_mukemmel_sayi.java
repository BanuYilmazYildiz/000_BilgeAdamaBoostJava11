package com.bilgeadam.week02.lecture005;

import java.util.Scanner;

public class Question23_mukemmel_sayi {

	public static void main(String[] args) {
		/*
		 * girilen sayının mükemmel sayı olup olmadığını
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Lütfen bir sayi giriniz: ");
		int sayi = sc.nextInt();

		int toplam = 0;

		for (int i = 1; i <= sayi / 2; i++) {
			if (sayi % i == 0) {
				toplam += i;
			}
		}

		if (sayi == toplam) {
			System.out.println("mükemmel sayıdır");
		} else
			System.out.println("Mükemmel sayı eğildir");
		sc.close();

	}
}
