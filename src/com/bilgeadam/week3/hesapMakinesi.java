package com.bilgeadam.week3;

import java.util.Scanner;

public class hesapMakinesi {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		uygulama();

	}

	public static void uygulama() {

		menu();

	}

	public static void menu() {
		boolean status = true;
		do {
			System.out.println("*******************************");
			System.out.println("********HESAP MAKİNESİ*********");
			System.out.println("*******************************");

			System.out.println("1-Toplama");
			System.out.println("2-Çıkarma");
			System.out.println("3-Çarpma");
			System.out.println("4-Bölme");
			System.out.println("5-Mod");
//				int secim=secimYap();

			switch (secimYap()) {

			case 1:

//					
				System.out.println(toplam(ikiSayiAl()));
				break;
			case 2:

//					
				System.out.println(cikarma(ikiSayiAl()));
				break;

			case 3:
				System.out.println(carpma(ikiSayiAl()));
				break;

			case 4:
				System.out.println(bolme(ikiSayiAl()));
				break;

			case 5:
				System.out.println(mod(ikiSayiAl()));
				break;
			case 0:
				System.err.println("Program Kapatıldı");
				status = false;
				break;
			default:
				System.err.println("Geçersiz İşlem 0 - 5 Arası Sayı Giriniz");
			}

		} while (status);

	}

	public static int secimYap() {

		System.out.print("Seciminiz: ");
		int secim = sc.nextInt();
		return secim;

	}

	public static int[] ikiSayiAl() {

		int[] numbers = new int[2];

		System.out.print("Lütfen Birinci Sayıyı Giriniz..: ");
		numbers[0] = sc.nextInt();
		System.out.print("Lütfen İkinci Sayıyı Giriniz..: ");
		numbers[1] = sc.nextInt();
		return numbers;

	}

	public static String toplam(int[] numbers) {

		int sonuc = numbers[0] + numbers[1];
		return "Sonuc = " + sonuc;
	}

	public static String cikarma(int[] numbers) {
		int sonuc = numbers[0] - numbers[1];
		return "Sonuc = " + sonuc;
	}

	public static String carpma(int[] numbers) {
		int sonuc = numbers[0] * numbers[1];
		return "Sonuc = " + sonuc;
	}

	public static String bolme(int[] numbers) {
		if (numbers[1] == 0) {
			System.out.println("Bölen Sayı 0 Olamaz");
			return "Sonuc Tanımsız";
		}
		double sonuc = (double) numbers[0] / numbers[1];
		return "Sonuc = " + sonuc;
	}

	public static String mod(int[] numbers) {
		int sonuc = numbers[0] % numbers[1];
		return "Kalan = " + sonuc;
	}
}
