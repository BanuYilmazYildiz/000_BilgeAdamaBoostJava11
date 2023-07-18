package com.bilgeadam.week3.lecture002;

import java.util.Scanner;

public class Question33_DizilerGrupOrnegi {

	public static void main(String[] args) {

		/*
		 * SORU 1; dizide en büyük ve en küçük öğeyi bulma 0, 120, 5, 85, -256, 16,
		 * 1258, 81, 14 dizi elemanlarım.
		 * 
		 * 
		 * SORU 2 dizide en büyük 2.sayıyı bulalım. 1300, 120, 130, 125, -256, 16, 1258,
		 * 81, 14
		 * 
		 * 
		 * SORU 3 bir dizide ard arda gelen 2 indexdeki sayı değeri 2 ise true yazdırıp
		 * döngü sonlansın yoksa false yazdıralım 2, -256, 2, 1258, 2, 2
		 * 
		 */

		int secim;
		boolean kontrol = true;
		Scanner scanner = new Scanner(System.in);

		while (kontrol) {

			System.out.println("\n---Soru Cözümleri------");
			System.out.println("1 - En büyük ve en kücük sayi");
			System.out.println("2 - En büyük 2. sayiyi bulma");
			System.out.println("3 - SORU 3");
			System.out.println("0 - CIKIS");
			System.out.print("Lutfen bir secenek giriniz: ");

			secim = scanner.nextInt();
			scanner.nextLine();

			switch (secim) {
			case 1: {
				int[] sayilar = { 0, 120, 5, 85, -256, 16, 1258, 81, 14 };
				int ebys = sayilar[0];

				int ekcs = sayilar[0];
				for (int i = 1; i < sayilar.length; i++) {
					if (ebys < sayilar[i]) {
						ebys = sayilar[i];

					}
					if (sayilar[i] < ekcs) {
						ekcs = sayilar[i];

					}
				}
				System.out.println(
						"Girdiginiz sayilardan en büyüğü :" + ebys + "\nGirdiginiz sayilarin en kücügü : " + ekcs);
				break;
			}
			case 2: {
				int[] sayılar = { 120, 130, 125, -256, 16, 1258, 81, 14, 1300 };

				int ebys = Integer.MIN_VALUE;
				int ebys2 = Integer.MIN_VALUE;

				for (int i = 0; i < sayılar.length; i++) {
					if (sayılar[i] > ebys) {
						ebys2 = ebys;
						ebys = sayılar[i];
					} else if (sayılar[i] > ebys2 && sayılar[i] < ebys) {
						ebys2 = sayılar[i];
					}
				}
				System.out.println("En büyük ikinci sayı: " + ebys2);
				break;
			}

			case 3: {
				int[] dizi = { 2, -256, 2, 1258, 2, 2 };
				boolean kontrol1 = false;

				for (int i = 0; i < dizi.length - 1; i++) {
					if (dizi[i] == 2 && dizi[i + 1] == 2) {
						kontrol1 = true;
						break;
					}
				}

				if (kontrol1) {
					System.out.println("true");
				} else {
					System.out.println("false");
				}

				break;
			}

			case 0:
				System.err.println("CIKIS YAPILDI");
				kontrol = false;

				break;
			default:
				System.err.println("Lutfen gecerli bir secim yapınız");
				break;

			}

		}
	}
}
