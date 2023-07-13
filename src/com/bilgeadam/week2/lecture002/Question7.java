package com.bilgeadam.week2.lecture002;

import java.util.Scanner;

public class Question7 {

	/**
	 * Dışarıdan 2 tane tam sayısal değer alacağım. İki sayımın toplamı çift ise
	 * true, tek ise false yazdırıcam. değerlerin ortalamasını da alalım
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Lutfen sayi1'i giriniz: ");
		int sayi1 = sc.nextInt();
		System.out.print("Lutfen sayi2'yi giriniz: ");
		int sayi2 = sc.nextInt();

		int toplam = sayi1 + sayi2;

		boolean ciftMi = toplam % 2 == 0;
		System.out.println(ciftMi);
		double ortalama = toplam / 2d;
		System.out.println("Girdiginiz sayilarin ortalamasi= " + ortalama);
		sc.close();

	}

}
