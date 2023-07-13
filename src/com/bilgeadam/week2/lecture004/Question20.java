package com.bilgeadam.week2.lecture004;

import java.util.Scanner;

public class Question20 {
	/*
	 * Girilen sayinin %in kuvveti olup olmadığını bulan
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Lütfen bir sayi giriniz: ");
		int sayi = sc.nextInt();
		boolean kontrol = true;

		if (sayi == 1) {
			System.out.println("Sayı 5'in kuvvetidir.");
			kontrol = false;
			System.out.println("sayi 1 olduğu için kontrol = false");
		} else if (sayi < 0) {
			System.out.println("Lütfen pozitif bir sayı giriniz");
			kontrol = false;
			System.out.println("sayı 0dan küçük kolduğu için kontrol = false");
		}
		System.out.println("Döngü girişi");
		while (kontrol) {
			System.out.println("Döngüye girdik");

			if (sayi % 5 == 0) {
				sayi /= 5;
				if (sayi == 1) {
					System.out.println("sayi 5'in kuvvetidir");
					kontrol = false;
					System.out.println("sayi 1 e eşit olduğu için kontrol = false");
				}
			} else {
				System.out.println("sayi 5'in kuvveti değildir");
				kontrol = false;
				System.out.println("sayi % 5 0 a eşit olmadığı için kontrol = false");

			}

		}
		System.out.println("Döngü çıkışı");
		sc.close();

	}
}
