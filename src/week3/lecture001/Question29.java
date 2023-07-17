package week3.lecture001;

import java.util.Scanner;

public class Question29 {

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

		Scanner sc = new Scanner(System.in);
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

		boolean control = true;

		while (control) {

			System.out.print("Lütfen menüden seçim yapınız = ");
			int secim = sc.nextInt();
			sc.nextLine();
			if (secim == 0) {
				System.out.println("Sistemden çıkış yapıldı.");
				control = false;
			} else {

				switch (secim) {

				case 1: {
					System.out.print("Lütfen bir kelime giriniz= ");
					String kelime = sc.nextLine();

					System.out.print("Lütfen bir harf giriniz= ");
					String harf = sc.nextLine();

					if (kelime.contains(harf)) {
						for (int i = 0; i < kelime.length(); i++) {

						}
//							if (kelime.charAt(i) == '' ) { 

					}
//					} else {
					System.out.println("Girdiğiniz kelime " + harf + " harfini içermiyor");

				}

					;
					break;
				case 2: {
					System.out.print("Lütfen bir kelime giriniz = ");
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
					break;
				case 3: {
					System.out.print("Lütfen bir kelime giriniz = ");
					String kelime = sc.nextLine();

					for (int i = 1; i < kelime.length() - 1; i--) {
						System.out.print(kelime.charAt(i));
					}

				}
					;
					break;
				case 4: {
					System.out.print("Lütfen bir kelime giriniz = ");
					String kelime = sc.nextLine();

					if (kelime.charAt(0) == 'a') {
						System.out.println(kelime);
					}
					if (kelime.charAt(0) == 'b') {
						System.out.println(kelime);
					}
					if (kelime.charAt(0) == 'c') {
						System.out.println(kelime);
					} else {
						System.out.println(kelime);
					}

				}
					;
					break;
				}
			}
		}

	}

}
