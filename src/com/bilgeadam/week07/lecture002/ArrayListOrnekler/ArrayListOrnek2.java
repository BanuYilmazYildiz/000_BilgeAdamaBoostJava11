package com.bilgeadam.week07.lecture002.ArrayListOrnekler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListOrnek2 {

	public static void main(String[] args) {
		/*
		 * 
		 * 1 tane tek sayilar 1 tane çift sayılar için bir liste olusturalim
		 * 
		 * sonra 35 tane random sayiyi çift ise çiftlere tek ise teklere atalim
		 * 
		 * en sonunda tekler ve çiftler listesini yazdiralim
		 * 
		 * 
		 * 
		 * 
		 */

		List<Integer> tekler = new ArrayList<Integer>();
		List<Integer> ciftler = new ArrayList<Integer>();
		Random random = new Random();

		for (int i = 0; i < 35; i++) {
			int sayi = randomSayi();
			if (sayi % 2 == 0) {
				ciftler.add(sayi);
			} else {
				tekler.add(sayi);
			}
		}

		System.out.println("---- Tekler ----");
		System.out.println(tekler);
//		tekler.forEach(System.out::println);
		System.out.println("---- Çiftler ----");
		System.out.println(ciftler);
//		ciftler.forEach(System.out::println);
		System.out.println(tekler.size() + ciftler.size());

	}

	public static int randomSayi() {
		Random random = new Random();
		return random.nextInt(500);

	}

}
