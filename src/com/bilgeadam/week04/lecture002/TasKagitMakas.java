package com.bilgeadam.week04.lecture002;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {
	static Scanner sc = new Scanner(System.in);

	String[] tasKagitMakas = { "taş", "kağıt", "makas" };

	static void uygulama() {
		String kontrol = "";
		int kullanici = 0;
		int bilgisayar = 0;
		do {
			String kullanici_secimi = kullaniciSecimi();
			String bilgisayar_secimi = rastgeleSecim();

			if (kullanici_secimi.equalsIgnoreCase(bilgisayar_secimi)) {
				System.out.println("Bilgisayarın hamlesi = " + bilgisayar_secimi);
				System.out.println("Berabere" + "\nKullanıcı = " + kullanici + "\nBilgisayar = " + bilgisayar);
			} else {

				switch (kullanici_secimi) {

				case "taş": {

					if (bilgisayar_secimi.equalsIgnoreCase("kağıt")) {
						System.out.println("Bilgisayarın hamlesi = " + bilgisayar_secimi);
						bilgisayar++;
						System.out.println("Kullanıcı = " + kullanici + "\nBilgisayar = " + bilgisayar);
					} else if (bilgisayar_secimi.equalsIgnoreCase("makas")) {
						System.out.println("Bilgisayarın hamlesi = " + bilgisayar_secimi);
						kullanici++;
						System.out.println("Kullanıcı = " + kullanici + "\nBilgisayar = " + bilgisayar);
					}
				}
					break;
				case "kağıt": {
					if (bilgisayar_secimi.equalsIgnoreCase("taş")) {
						System.out.println("Bilgisayarın hamlesi = " + bilgisayar_secimi);
						kullanici++;
						System.out.println("Kullanıcı = " + kullanici + "\nBilgisayar = " + bilgisayar);
					} else if (bilgisayar_secimi.equalsIgnoreCase("makas")) {
						System.out.println("Bilgisayarın hamlesi = " + bilgisayar_secimi);
						bilgisayar++;
						System.out.println("Kullanıcı = " + kullanici + "\nBilgisayar = " + bilgisayar);

					}
				}
					break;
				case "makas": {
					if (bilgisayar_secimi.equalsIgnoreCase("taş")) {
						System.out.println("Bilgisayarın hamlesi = " + bilgisayar_secimi);
						bilgisayar++;
						System.out.println("Kullanıcı = " + kullanici + "\nBilgisayar = " + bilgisayar);
					} else if (bilgisayar_secimi.equalsIgnoreCase("kağıt")) {
						System.out.println("Bilgisayarın hamlesi = " + bilgisayar_secimi);
						kullanici++;
						System.out.println("Kullanıcı = " + kullanici + "\nBilgisayar = " + bilgisayar);

					}
				}
					break;
				default:
					System.out.println("Lütfen geçerli bir seçim yapınız ");

				}
				System.out.print("Devam etmek istemiyorsanız E ye basın :");
				kontrol = sc.nextLine();
			}
		} while (kontrol.equalsIgnoreCase("E"));
		System.out.println("\n*******************************************");
		if (bilgisayar == kullanici) {
			System.out.print("BERABERE \nSkor;\nKullanıcı = " + kullanici + "\nBilgisayar = " + bilgisayar);
		}

		else if (bilgisayar > kullanici) {
			System.out.print("Kazanan = Bilgisayar \nSkor;\nKullanıcı = " + kullanici + "\nBilgisayar = " + bilgisayar);
		} else
			System.out.print("Kazanan = Kullanıcı \nSkor;\nKullanıcı = " + kullanici + "\nBilgisayar = " + bilgisayar);

	}

	static String rastgeleSecim() {
		Random random = new Random();
		String secim;
		int sayi = random.nextInt(1, 4);

		if (sayi == 1) {
			secim = "taş";
		} else if (sayi == 2) {
			secim = "kağıt";
		} else {
			secim = "makas";
		}
		return secim;

	}

	static String kullaniciSecimi() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Hamle : ");
		String hamle = sc.next();

		return hamle;
	}

}
