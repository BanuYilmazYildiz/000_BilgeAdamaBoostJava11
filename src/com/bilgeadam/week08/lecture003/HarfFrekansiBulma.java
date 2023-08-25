package com.bilgeadam.week08.lecture003;

import java.util.LinkedHashMap;
import java.util.Map;

public class HarfFrekansiBulma {

	/**
	 * Utility sinif kullanarak dışarıdan bir string kelime alalım.
	 * 
	 * Kelimeyi bir map içinde işleyeceğiz(Sıralı bir şekilde)
	 * 
	 * Key -> Kelime ="merhaba";
	 * 
	 * m=1 e=1; r=1; h=1; a=2; b=1;
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		String kelime = Utility.stringDegerAlma("Lütfen bir kelime giriniz : ");

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char c : kelime.toCharArray()) {
			if (map.containsKey(c)) {
				map.replace(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

//
//		for (int i = 0; i < kelime.length(); i++) {
//			char harf = kelime.charAt(i);
//			if (map.containsKey(harf)) {
//				int sayi = map.get(harf);
//				map.put(harf, sayi + 1);
//			} else {
//				map.put(harf, 1);
//			}
//		}

		// Entry -> Girdi, <Character, Integer> -> key value pair'i
		// Map in içinde de entri var bu nedenle mapi de entry olarak kullanacağımızı
		// belirtiyoruz -> map.entrSet()

//		for (Entry<Character, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + "=" + entry.getValue());
//		}

		map.forEach((x, y) -> System.out.println(x + " = " + y));

	}

}
