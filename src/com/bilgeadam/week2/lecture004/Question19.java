package com.bilgeadam.week2.lecture004;

import java.util.Scanner;

public class Question19 {
	/*
	 * Girilen sayının asal olup olmadığını gösteren program
	 */

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Lütfen bir sayi giriniz: ");
//		int sayi = sc.nextInt();
//
//		if (sayi == 2) {
//			System.out.println("Asal sayıdır");
//		} else if (sayi % 2 == 0 || sayi == 1) {
//			System.out.println("Asal sayı değildir");
//		} else {
//			for (int i = 3; i <= sayi; i += 2) {
//				if (sayi == i) {
//					System.out.println("Asal sayıdır");
//				} else if (sayi % i == 0) {
//					System.out.println("Asal sayı değildir");
//
//				}
//			}
//		}
//		sc.close();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayı giriniz : ");
		long sayi1 = scanner.nextInt();

		long startTime = System.nanoTime();

		if (sayi1 == 2) {
			System.out.println("Asal sayıdır");
		} else if (sayi1 < 2 || sayi1 % 2 == 0) {
			System.out.println("Asal Sayı Değildir");
		} else {
			boolean asal = true;
			for (int i = 3; i <= sayi1 - 1; i += 2) {
				if (sayi1 % i == 0) {
					asal = false;
					break;
				}
			}

			if (asal) {
				System.out.println("Asaldır");
			} else {
				System.out.println("Asal Sayı Değildir");
			}

		}
		long endTime = System.nanoTime();
		long timeElapse = endTime - startTime;

		System.out.println("Execution time in nanosecond= " + timeElapse);
		System.out.println("Execution time in milisecond= " + timeElapse / 1000000);

		scanner.close();

	}

}
