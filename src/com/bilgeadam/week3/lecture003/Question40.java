package com.bilgeadam.week3.lecture003;

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
		String sayilar[] = new String[(end - start) + 2];

		for (int i = 0; i < sayilar.length; i++) {
			if ((i + 2) % 3 == 0 && (i + 2) % 5 == 0) {
				sayilar[i] = "bileadam";
				System.out.println(i + ". index =" + (i + 2) + " -> " + sayilar[i]);
			} else if ((i + 2) % 3 == 0) {
				sayilar[i] = "bilge";
				System.out.println(i + ". index =" + (i + 2) + " -> " + sayilar[i]);
			} else if ((i + 2) % 5 == 0) {
				sayilar[i] = "adam";
				System.out.println(i + ". index =" + (i + 2) + " -> " + sayilar[i]);
			}
		}

	}

}
