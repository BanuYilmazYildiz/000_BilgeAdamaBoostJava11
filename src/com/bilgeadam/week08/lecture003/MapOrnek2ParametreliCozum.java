package com.bilgeadam.week08.lecture003;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapOrnek2ParametreliCozum {
	/**
	 * ogrenci ve notlardan oluşan bir map oluşturalım.
	 * 
	 * Ogrenciyi cagırdıgımda bana notlari dondursun
	 * 
	 * mapi yazdıralım
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		String[] ogrenci = { "Ayşe", "Ece", "Mahmut" };
		int[] notlar = { 60, 70, 80 };

		mapYazdir(mapOlustur(ogrenci, notlar));

	}

	public static Map<String, Integer> mapOlustur(String[] key, int[] value) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < key.length; i++) {
			map.put(key[i], value[i]);
		}
		return map;
	}

	public static void mapYazdir(Map<String, Integer> map) {
		for (Entry<String, Integer> ogrenciler : map.entrySet()) {
			System.out.println(ogrenciler.getKey() + " = " + ogrenciler.getValue());
		}
	}

}
