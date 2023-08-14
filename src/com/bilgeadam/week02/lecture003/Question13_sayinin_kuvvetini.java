package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Question13_sayinin_kuvvetini {
	/*
	 * Dışarıdan taban değeri ve üs isimli 2 tane değişken alınacak. 2^5 gibi
	 * hesaplama yapılacak
	 * 
	 * 
	 * Kullanıcıya ismi sorulacak. Aldığım isim değişkeni ile sonucu yazdıracağız.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Lütfen bir taban değeri giriniz: ");
		int taban = sc.nextInt();
		System.out.print("Lütfen bir üs değeri giriniz: ");
		int us = sc.nextInt();

		int sonuc = 1;
		for (int i = 1; i <= us; i++) {
			sonuc *= taban;

		}
		sc.nextLine();
		System.out.print("Lutfen adınızı giriniz: ");
		String isim = sc.next();
		System.out.println("Merhaba " + isim + ", Sonuç= " + sonuc);
		sc.close();
	}

}
