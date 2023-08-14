package com.bilgeadam.week02.lecture004;

import java.util.Scanner;

public class Question21_haftanin_gunleri {
	/*
	 * Kullanıcı 1 ile 7 arasında bir sayı girsin. (1 v e 7 dahil) Bu sayıya denk
	 * gelen haftanın günleri
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Lütfen bir sayi giriniz: ");
		int sayi = sc.nextInt();
		switch (sayi) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salı");
			break;
		case 3:
			System.out.println("Çarşamba");
			break;
		case 4:
			System.out.println("Perşembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.err.print("Lütfen 1 ile 7 arasında bir sayı giriniz");

		}
		sc.close();
	}

}
