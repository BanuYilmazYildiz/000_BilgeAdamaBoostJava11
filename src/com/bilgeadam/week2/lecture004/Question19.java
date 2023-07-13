package com.bilgeadam.week2.lecture004;

import java.util.Scanner;

public class Question19 {
	/*
	 * Girilen sayının asal olup olmadığını gösteren program
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Lütfen bir sayi giriniz: ");
		int sayi = sc.nextInt();

		if (sayi == 2) {
			System.out.println("Asal sayıdır");
		} else if (sayi % 2 == 0 || sayi == 1) {
			System.out.println("Asal sayı değildir");
		} else {
			for (int i = 3; i <= sayi; i += 2) {
				if (sayi == i) {
					System.out.println("Asal sayıdır");
				} else if (sayi % i == 0) {
					System.out.println("Asal sayı değildir");

				}
			}
		}
		sc.close();

	}

}
