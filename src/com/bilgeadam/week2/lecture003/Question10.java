package com.bilgeadam.week2.lecture003;

import java.util.Scanner;

public class Question10 {
	/*
	 * 1'den baslayarak kullanıncının dışarıdan girdiği sayıya kadar olan (sayı
	 * dahil) sayıların 1 fazlıasının toplamını ekrana yazdırsın
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz: ");
		int sayi = sc.nextInt();
		int toplam = 0;
		// for ile çözüm;
//		for (int i = 1; i <= sayi; i++) {
//			toplam += (i + 1);
//
//		}
//		System.out.println(toplam);
//		sc.close();

		// While ile çözüm;
		int i = 1;
		while (i <= sayi) {
			toplam += (i + 1);
			i++;
		}
		System.out.println(toplam);
		sc.close();

	}

}
