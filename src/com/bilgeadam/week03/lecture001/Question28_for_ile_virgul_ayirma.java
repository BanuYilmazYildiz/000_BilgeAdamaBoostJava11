package com.bilgeadam.week03.lecture001;

public class Question28_for_ile_virgul_ayirma {

	public static void main(String[] args) {
		/*
		 * =Java,React,Spring
		 * 
		 * split kullanmadan , ile bölüp
		 * 
		 * for döngüsü ile
		 */

		String deger = "Java,React,Spring";
		System.out.println("\n************** 1.ÇÖZÜM **********************");

		System.out.println(deger.replace(",", "\n"));

		System.out.println("\n************** 2.ÇÖZÜM **********************");
		// blok blok yazdırıyor Java React Spring gibi

		int index = 0;

		for (int i = 0; i < deger.length(); i++) {

			if (deger.charAt(i) == ',') {
				System.out.println(deger.substring(index, i));
				index = i + 1;
			}
		}
		System.out.println(deger.substring(index));

		System.out.println("\n************** 3.ÇÖZÜM **********************\n");
		// karakter karakter her şeyin üzerinden geçiyor J a v a gibi...

		for (int i = 0; i < deger.length(); i++) {
			if (deger.charAt(i) == ',') {
				System.out.println();
			} else {
				System.out.print(deger.charAt(i));
			}
		}

	}

}
