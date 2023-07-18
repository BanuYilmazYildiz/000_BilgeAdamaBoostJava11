package com.bilgeadam.week3.lecture001;

import java.util.Scanner;

public class Question29_Menulu_String {

	public static void main(String[] args) {
		/*
		 * Menu 1-Dışarıdan bir kelime ve bir harf girilsin eğer kelimemizin için de o
		 * harf varsa kaç tane olduğunu ve index numaralarını yazdırın. eğer harfi
		 * içermiyorsa bir çıktı aradağınız harf yok gibi
		 * 
		 * 
		 * 2-Dışarıdan bir kelime giriniz daha sonra değiştirmek istediğiniz harfi
		 * giriniz daha sonra hangi harfle değiştireceğinizi giriniz Eğer kelimemiz
		 * içerisinde o harf varsa değiştirsin hata da atsın
		 * 
		 *
		 * 3-Dışarıdan Girilen bir kelimeyi ters çevirip yazdıralım.Polindrom olup
		 * olmadığını bulunuz(kek,iki,kabak,saippuakivikauppias)
		 * 
		 * 
		 * 4- Dışarıdan 5 adet kelime girelim her kelimede a, b veya c ile başlayıp
		 * başlamadığımızı kontrol etsin (a, b,c ile başlayanlar için ayrı ayrı sayfa
		 * açıldığını düşünün elimizde) a lar için bir sayfaya b ler bir sayfaya cler
		 * bir sayfaya yazılacak gibi düşünelim diğer harfle başlayanlar için ise ayrı
		 * bir sayfa düşünelim girilen 5 adet kelimeyi kontrol ettikten sonra elimizde
		 * kaç sayfa oluğunu ekrana yazdıralım
		 */

		boolean control = true;
		Scanner sc = new Scanner(System.in);

		while (control) {

			System.out.println("***************Menü****************");
			System.out.println("1--> Dışarıdan bir kelime ve bir harf girilsin eğer kelimemizin için de o\r\n"
					+ "		 * harf varsa kaç tane olduğunu ve index numaralarını yazdırın. eğer harfi\r\n"
					+ "		 * içermiyorsa bir çıktı aradağınız harf yok gibi");
			System.out.println("2-->Dışarıdan bir kelime giriniz daha sonra değiştirmek istediğiniz harfi\r\n"
					+ "		 * giriniz daha sonra hangi harfle değiştireceğinizi giriniz Eğer kelimemiz\r\n"
					+ "		 * içerisinde o harf varsa değiştirsin hata da atsın");
			System.out.println("3-->Dışarıdan Girilen bir kelimeyi ters çevirip yazdıralım.Polindrom olup\r\n"
					+ "		 * olmadığını bulunuz(kek,iki,kabak,saippuakivikauppias)");
			System.out.println("4-->Dışarıdan 5 adet kelime girelim her kelimede a, b veya c ile başlayıp\r\n"
					+ "		 * başlamadığımızı kontrol etsin (a, b,c ile başlayanlar için ayrı ayrı sayfa\r\n"
					+ "		 * açıldığını düşünün elimizde) a lar için bir sayfaya b ler bir sayfaya cler\r\n"
					+ "		 * bir sayfaya yazılacak gibi düşünelim diğer harfle başlayanlar için ise ayrı\r\n"
					+ "		 * bir sayfa düşünelim girilen 5 adet kelimeyi kontrol ettikten sonra elimizde\r\n"
					+ "		 * kaç sayfa oluğunu ekrana yazdıralım");

			System.out.print("\nLütfen menüden seçim yapınız = ");
			int secim = sc.nextInt();
			sc.nextLine();

			switch (secim) {

			case 1: {
				System.out.print("\nLütfen bir kelime giriniz= ");
				String kelime = sc.nextLine();
				System.out.print("Lütfen bir harf giriniz= ");
				String harf = sc.nextLine();

				if (kelime.contains(harf)) {
					int i = 0;
					int sayac = 0;
					for (i = 0; i < kelime.length(); i++) {
						if (kelime.charAt(i) == harf.charAt(0)) {
							sayac++;
							System.out.println("index-> " + i);
						}
					}
					System.out.println(kelime + " kelimesinde " + sayac + " tane " + harf + " harfi vardır.");

				} else
					System.out.println("Girdiğiniz kelime " + harf + " harfini içermiyor");

			}
				;
				sc.close();
				break;
			case 2: {
				System.out.print("\nLütfen bir kelime giriniz = ");
				String kelime = sc.nextLine();

				System.out.print("Lütfen değiştirmek istediğiniz harfi giriniz = ");
				String harf = sc.nextLine();

				System.out.print("Lütfen hangi harfle değiştireceğinizi giriniz = ");
				String harf_degisen = sc.nextLine();

				if (kelime.contains(harf)) {
					System.out.println(kelime.replace(harf, harf_degisen));
				} else {
					System.err.println("Girdiğiniz kelime " + harf + " harfini içermiyor");
				}

			}
				;
				sc.close();
				break;
			case 3: {
				System.out.print("Lütfen bir kelime giriniz = ");
				String kelime = sc.nextLine();
				int right = kelime.length() - 1;
				int left = 0;
				boolean isPalindrome = true;
				while (left < right) {
					if (kelime.charAt(left) != kelime.charAt(right)) {
						System.out.println("Palindrom değildir.");
					}
					left++;
					right--;
				}
				if (isPalindrome)
					System.out.println("Palindromdur");
				else
					System.out.println("Palindrom değildir");

//				String tersKelime = "";
//				for (int i = kelime.length() - 1; i > -1; i--) {
//					tersKelime += kelime.toLowerCase().charAt(i);
//				}
//				System.out.println(kelime + " kelimesinin tersi -> " + tersKelime);
//				if (kelime.toLowerCase().equals(tersKelime)) {
//					System.out.println(kelime + " kelimesi bir Palindrom kelimedir.");
//
//				}

			}
				;
				sc.close();
				break;
			case 4: {

				String kelime;
				int a = 0, b = 0, c = 0, d = 0;
				for (int i = 1; i <= 5; i++) {
					System.out.print(i + ". kelimeyi giriniz = ");
					kelime = sc.nextLine();
					if (kelime.charAt(0) == 'a') {
						System.out.println("a ile başlayanlar;");
						System.out.println(kelime);
						a = 1;
					} else if (kelime.charAt(0) == 'b') {
						System.out.println("b ile başlayanlar;");
						System.out.println(kelime);
						b = 1;
					} else if (kelime.charAt(0) == 'c') {
						System.out.println("c ile başlayanlar;");
						System.out.println(kelime);
						c = 1;
					} else {
						System.out.println("diğer;");
						System.out.println(kelime);
						d = 1;
					}
				}
				System.out.println((a + b + c + d) + " tane sayfa var.");

			}
				;
				sc.close();
				break;
			case 0:
				System.out.println("ÇIKIŞ YAPILDI");
				control = false;
				;
				break;
			default:
				System.out.println("\nLütfen geçerli bir seçim yapınız\n");
			}
		}

	}// main sonu
}// clas sonu
