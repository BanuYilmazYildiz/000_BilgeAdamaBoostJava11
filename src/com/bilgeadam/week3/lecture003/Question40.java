package com.bilgeadam.week3.lecture003;

import java.util.Arrays;

public class Question40 {

	public static void main(String[] args) {
		/*
		 * Bir başlangıç ve bitiş değeri arasında ki sıralı sayılardan eğer sayı 3'ün
		 * katı ise ise bilge, 5 in katı ise adam hem 3'ün ve hem de 5'in katı ise
		 * bilgeadam yazdıralım. int start=2; int end=22;
		 * 
		 * 
		 */

//		int start = 2;
//		int end = 22;
//
//		int sayilar[] = new int[(end - start) + 1];
//
//		for (int i = 0; i < sayilar.length; i++) {
//
//			sayilar[i] = start + i;
//
//			if (sayilar[i] % 3 == 0 && sayilar[i] % 5 == 0)
//				System.out.println(i + ". index " + sayilar[i] + " --> bilgeadam");
//			else if (sayilar[i] % 3 == 0) {
//				System.out.println(i + ". index " + sayilar[i] + " --> bilge");
//			} else if (sayilar[i] % 5 == 0) {
//				System.out.println(i + ". index " + sayilar[i] + " --> adam");
//
//			}

		int start = 2;
		int end = 22;
		String sayilar[] = new String[(end - start) + 1];

		for (int i = 0; i < sayilar.length; i++) {
			if ((i + start) % 15 == 0) { // ben hem 3e hem 5 e bölüm diye bakmıştım bu daha ksıa
				sayilar[i] = "Bileadam";

			} else if ((i + start) % 3 == 0) {
				sayilar[i] = "Bilge";

			} else if ((i + start) % 5 == 0) {
				sayilar[i] = "Adam";

			} else

				sayilar[i] = "" + (i + start);
		}

//		for (int i = 0; i < sayilar.length; i++) {
//			if (i == sayilar.length - 1) {
//				System.out.println(sayilar[i]);
//			} else {
//				System.out.print(sayilar[i] + " ,");
//			}
//		}
		System.out.println(Arrays.toString(sayilar)); // -> array yazdırma methodu

	}

}
