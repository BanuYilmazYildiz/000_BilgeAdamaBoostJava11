package com.bilgeadam.week08.lecture002.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetOrnek {
	/**
	 * 
	 * klavyeden rastgele 10 tane sayı alıp bunların çıktısını ver
	 * 
	 * @param args
	 */
	static Scanner sc;
	static Set<Integer> sayilar = new HashSet<Integer>(); // karışık bir şekilde ilk bulduğu değerden son değere kadar
															// getirir
	static Set<Integer> ekledigimSira = new LinkedHashSet<Integer>(); // verileri hangi sıra ile girdiysem o sıra ile
																		// geliyor
	static Set<Integer> kucuktenBuyuge = new TreeSet<Integer>();
	static Set<Ogrenci> ogrenciSet = new TreeSet<Ogrenci>();

	public static void main(String[] args) {
//		sayiEkle();
//		yazidr(sayilar);
//		System.out.println("--------");
//		yazidr(ekledigimSira);
//		System.out.println("--------");
//		yazidr(kucuktenBuyuge);

		ogrenciSet.add(new Ogrenci(100, "Cafer"));
		ogrenciSet.add(new Ogrenci(70, "Alperen"));
		ogrenciSet.add(new Ogrenci(3, "Sedat"));
		ogrenciSet.add(new Ogrenci(150, "Furkan"));
		ogrenciSet.add(new Ogrenci(13, "Zeynep"));
		ogrenciSet.add(new Ogrenci(53, "Banu"));
		ogrenciSet.add(new Ogrenci(40, "Nilsel"));
		ogrenciSet.forEach(System.out::println);

	}

	public static void sayiEkle() {

		sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("Sayı = ");
			int sayi = sc.nextInt();
			sayilar.add(sayi);
			ekledigimSira.add(sayi);
			kucuktenBuyuge.add(sayi);
		}

	}

	public static void yazidr(Set<Integer> set) {
		set.forEach(System.out::println);
	}

}
