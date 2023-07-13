package com.bilgeadam.week2.lecture003;

public class Question14 {
	/*
	 * a dan z ye alfabeyi yazdır.
	 */

	public static void main(String[] args) {

		// while çözümü
//		char i = 0;
//		int sayac = 0;
//		while (i <= 127) {
//			i++;
//			sayac++;
//			System.out.println(sayac + "----" + i);
//		}

		// for çözümü
//		for (char i = 97; i <= 122; i++) {
//			System.out.print(i);
//			
//		}

		// for '' tırnak çözümü
//		for (char i = 'a'; i <= 'z'; i++) {
//			System.out.print(i + " ");
//		}

		// do...while çözümü
		char i = 97;
		do {
			System.out.print(i + " ");
			i++;

		} while (i <= 122);
	}

}
