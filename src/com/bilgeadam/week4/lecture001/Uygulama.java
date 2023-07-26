package com.bilgeadam.week4.lecture001;

import java.util.Scanner;

public class Uygulama {

	static Scanner sc = new Scanner(System.in);
	static SayiKontrol sayikontrol = new SayiKontrol();

	public static void uygulama() {
		boolean control = true;
		while (control) {
			menu();
			switch (islemSec()) {
			case 1:
				System.out.println("Sonuç = " + toplama());
				break;
			case 2:
				cikarma();
				break;
			case 3:
				System.out.println("Sonuç = " + carpma());
				break;
			case 4:
				bolme();
				break;
			case 5:
				ebobEkok();
				break;
			case 0: {

				System.err.println("Çıkış Yapıldı");
				control = false;
			}
				break;
			default:
				System.err.println("1-5 arasında bir seçim yapınız.");
			}

		}
	}

	public static void menu() {
		System.out.println("*******************************");
		System.out.println("********HESAP MAKİNESİ*********");
		System.out.println("*******************************");

		System.out.println("1-Toplama");
		System.out.println("2-Çıkarma");
		System.out.println("3-Çarpma");
		System.out.println("4-Bölme");
		System.out.println("5-EBOB-EKOK");
		System.out.println("0- Ç I K I Ş");

	}

	public static int islemSec() {
		System.out.print("Lütfen işlem seçiniz : ");
		int secim = sc.nextInt();
		sc.nextLine();
		return secim;

	}

	public static int toplama() {
		System.out.println("\n*****Toplama İşlemi******");
		String sayi1 = "";
		int islemSonucu = 0;
		boolean control = true;
		while (!sayi1.equals("=")) {
			System.out.print("sayı : ");
			sayi1 = sc.nextLine();
			if (SayiKontrol.isNumeric(sayi1)) {
				int tamsayi = Integer.parseInt(sayi1);
				islemSonucu += tamsayi;
			} else if (sayi1.equals("=")) {
				return islemSonucu;

			} else {
				System.out.println("Lütfen geçerli bir sayı giriniz");

			}

		}

		return islemSonucu;

	}

	public static void cikarma() {
		System.out.println("\n*****Çıkarma İşlemi******");
		String sayi1 = "";
		System.out.print("sayı : ");
		sayi1 = sc.nextLine();
		if (!sayi1.equals("=")) {
			int islemSonucu = Integer.parseInt(sayi1);
			boolean control = true;
			while (control) {
				System.out.print("sayı : ");
				sayi1 = sc.nextLine();
				if (!sayi1.equals("=")) {
					int tamsayi = Integer.parseInt(sayi1);
					islemSonucu -= tamsayi;
				} else
					control = false;
			}
			System.out.println("Sonuç = " + islemSonucu);
		} else
			System.err.println("Hatalı seçim yaptınız.");
	}

	public static int carpma() {
		System.out.println("\n*****Çarpma İşlemi******");
		String sayi1 = "";
		int islemSonucu = 1;
		boolean control = true;
		while (control) {
			System.out.print("sayı : ");
			sayi1 = sc.nextLine();
			if (!sayi1.equals("=")) {
				int tamsayi = Integer.parseInt(sayi1);
				islemSonucu += tamsayi;
			} else {
				control = false;
				return islemSonucu;
			}
		}

		return islemSonucu;

	}

	public static void bolme() {
		System.out.println("\n*****Bölme İşlemi******");
		String sayi1 = "";
		System.out.print("sayı : ");
		sayi1 = sc.nextLine();
		if (!sayi1.equals("=")) {
			double islemSonucu = Integer.parseInt(sayi1);
			boolean control = true;
			while (control) {
				System.out.print("sayı : ");
				sayi1 = sc.nextLine();
				if (!sayi1.equals("=")) {
					double sayi = Double.parseDouble(sayi1);
					islemSonucu /= sayi;
				} else
					control = false;
			}
			System.out.println("Sonuç = " + islemSonucu);
		} else
			System.err.println("Hatalı seçim yaptınız.");
	}

	public static void ebobEkok() {

	}

}
