package com.bilgeadam.week5.lecture003;

import java.util.Scanner;

public class TestSehirDatabase {

	/**
	 * 1- Dışarıdan girilen harfle başlayan illeri yazdır. 2- "01-Adana" formatında
	 * illeri plaka kodları ile yazdıran method 3- Girdiğimiz şehrin ismine göre
	 * plakasını dönen method
	 * 
	 */

	public static void main(String[] args) {
		SehirDatabase sehir_database = new SehirDatabase();
		String[] sehirler = sehir_database.iller;
//		harfleBaslayanIller(sehirler);
//		plakaKodlariIleYaz(sehirler);
//		sehreGorePlaka(sehirler);
//		System.out.print(sehreGorePlaka2(sehirler));

	}

	public static void harfleBaslayanIller(String[] iller) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lütfen bir harf giriniz : ");
		String harf = sc.nextLine();
		if (harf.length() > 1) {
			System.err.println("Lütfen sadece harf giriniz ");
		} else {
			for (int i = 0; i < iller.length; i++) {
				if (iller[i].startsWith(harf.toUpperCase())) {
					System.out.println(iller[i]);
				}
			}
		}
	}

	public static void plakaKodlariIleYaz(String[] iller) {
		for (int i = 0; i < iller.length; i++) {
			if (i < 9) {
				System.out.println("0" + (i + 1) + "-" + iller[i]);
			} else {
				System.out.println((i + 1) + "-" + iller[i]);
			}
		}
	}

	public static void sehreGorePlaka(String[] iller) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lütfen bir şehir giriniz : ");
		String sehir = sc.nextLine();
		for (int i = 0; i < iller.length; i++) {
			if (iller[i].equalsIgnoreCase(sehir)) {
				if (i < 9) {
					System.out.println(iller[i] + " plaka kodu = " + "0" + (i + 1));
				} else {
					System.out.println(iller[i] + " plaka kodu = " + (i + 1));
				}

			}
		}

	}

	public static String sehreGorePlaka2(String[] iller) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lütfen bir şehir giriniz : ");
		String sehir = sc.nextLine();
		for (int i = 0; i < iller.length; i++) {
			if (iller[i].equalsIgnoreCase(sehir)) {
				if (i < 9) {
					return "0" + (i + 1);
				} else {
					return String.valueOf(i + 1);
				}

			}
		}
		return "Böyle bir şehir bulunmamaktadır";

	}

}
