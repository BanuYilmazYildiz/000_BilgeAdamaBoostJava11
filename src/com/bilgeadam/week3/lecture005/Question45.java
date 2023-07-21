package com.bilgeadam.week3.lecture005;

import java.util.Scanner;

public class Question45 {

	public static void main(String[] args) {
		// Türkçe karakterleri İngilizce karakterlere çevirme

		/**
		 * String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u",
		 * "U", "o", "O" }; String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç",
		 * "ğ", "Ğ", "ü", "Ü", "ö", "Ö" }; Bir metot yazalım. metot arraylerimizin
		 * ikisini de alsın.
		 * 
		 * daha sonra metodun içinde bir string değer alalım.
		 * 
		 * sonra Türkçe karakterleri İngilizce karakterlere dönüştürüp, dönüştürülmüş
		 * hali geri dönelim.
		 * 
		 * döndüğümüz String değerini main metotta yazdıralım.
		 * 
		 */
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };

//		System.out.println(turkceKarakterCevirme(turkceKarakter, ingilizceKarakter, "şanslı kişö"));
		System.out.println(turkceKarakterCevirme(ingilizceKarakter, turkceKarakter));

	}

//	public static String turkceKarakterCevirme(String[] diziIngilizce, String[] diziTurkce, String kelime) {
//
//		for (int i = 0; i < kelime.length(); i++) {
//			for (int j = 0; j < diziTurkce.length; j++) {
//				if (kelime.charAt(i) == diziIngilizce[j].charAt(0)) {
//					kelime = kelime.replace(diziTurkce[j], diziIngilizce[j]);
//				}
//			}
//
//		}
//		return kelime;
//
//	}
	public static String turkceKarakterCevirme(String[] diziIngilizce, String[] diziTurkce) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen string yazınız : ");
		String kelime = sc.nextLine();

		for (int i = 0; i < diziTurkce.length; i++) {

			kelime = kelime.replace(diziTurkce[i], diziIngilizce[i]);

		}
		return kelime;
	}

}
