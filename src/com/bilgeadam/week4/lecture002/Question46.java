package com.bilgeadam.week4.lecture002;

import java.util.Scanner;

public class Question46 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Kullanıcıya kaç sayı alacağımızı soralım. (2 ya da 3 sayı)

		// 2 gelirse topla() metodu içinde iki değerimizi alıp toplayalım.

		// eğer 3 gelirse de aynı metodu overload şeklinde yazalım. Aldığımız 3 değeri
		// metoda geçelim.

		// main'de dışarıdan kaç sayı alacağımızı belirliyoruz, o sayılara göre
		// koşullarımızı belirleyip o koşullarda yazdığımız 2 metottan birisini
		// çağıracağız.

		System.out.print("Kaç sayı gireceksiniz, 2 mi?, 3 mü? : ");
		int adet = sc.nextInt();
		switch (adet) {
		case 2:
			System.out.println("Toplam = " + topla());
			break;
		case 3: {
			System.out.print("sayi 1: ");
			int sayi1 = sc.nextInt();
			System.out.print("sayi 2: ");
			int sayi2 = sc.nextInt();
			System.out.print("sayi 3: ");
			int sayi3 = sc.nextInt();
			System.out.println("Toplam = " + topla(sayi1, sayi2, sayi3));
		}
			break;
		default:
			System.out.println("Çıkış yaptınız");
		}
	}

	private static int topla() {
		System.out.print("sayi 1: ");
		int sayi1 = sc.nextInt();
		System.out.print("sayi 2: ");
		int sayi2 = sc.nextInt();
		return sayi1 + sayi2;
	}

	private static int topla(int sayi1, int sayi2, int sayi3) {
		int toplam = sayi1 + sayi2 + sayi3;
		return toplam;
	}

}
