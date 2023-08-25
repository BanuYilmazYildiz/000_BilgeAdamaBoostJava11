package com.bilgeadam.week08.lecture002.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOrnek {
	/**
	 * Bir string set olsun daha sonra dışarıdan bir kategori istediğimiz method
	 * olsun ve bu kategorileri setimize ekleyelim
	 * 
	 * Eğer daha önce eklemişsek bize bu kategori daha önce eklenmiş çıktısı versin
	 * 
	 * Eklenmediyse kategori başarı ile eklendi desin.
	 * 
	 */

	public static void main(String[] args) {

		SetOrnek setOrnek = new SetOrnek();

//		Set<Integer> integerSet = new HashSet<Integer>();
//		integerSet.add(10);
//		integerSet.add(20);
//		integerSet.add(10);
//
//		integerSet.forEach(System.out::println);

//		Set<String> metotlar = new HashSet<String>();
//		for (int i = 0; i < 6; i++) {
//			String kategori = setOrnek.kategoriIste();
//			if (metotlar.contains(kategori)) {
//				System.out.println("Bu kategori daha önce eklenmiş.");
//			} else {
//				metotlar.add(kategori);
//				System.out.println("Kategori başarı ile eklendi.");
//			}
//		}
//		metotlar.forEach(System.out::println);
		Set<String> set = new HashSet<String>();
		kategoriEkle("Aksiyon", set);
		kategoriEkle("Romantik", set);
		kategoriEkle("Dram", set);
		kategoriEkle("Aksiyon", set);
		for (String kategori : set) {
			System.out.println(kategori);
		}
		System.out.println("--------------------------");

		kategoriEkle2("Aksiyon", set);
		kategoriEkle2("Romantik", set);
		kategoriEkle2("Dram", set);
		kategoriEkle2("Aksiyon", set);
		for (String kategori : set) {
			System.out.println(kategori);
		}
	}

	public static String kategoriIste() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lütfen bir kategori giriniz : ");
		String kategori = sc.nextLine();
		return kategori;
	}

	public static void kategoriEkle(String kategori, Set<String> set) {
		if (set.contains(kategori)) {
			System.out.println(kategori + " kategorisi daha önce eklenmiş.");
		} else {
			System.out.println(kategori + " başarı ile eklendi.");
			set.add(kategori);

		}
	}

	public static void kategoriEkle2(String kategori, Set<String> set) {
		if (set.add(kategori)) {
			System.out.println(kategori + " kategorisi daha önce eklenmiş.");
		} else {
			System.out.println(kategori + " başarı ile eklendi.");
			set.add(kategori);

		}
	}

}
