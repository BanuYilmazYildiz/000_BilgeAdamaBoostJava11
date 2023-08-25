package com.bilgeadam.week08.lecture003;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapOrnek2 {
	/**
	 * ogrenci ve notlardan oluşan bir map oluşturalım.
	 * 
	 * Ogrenciyi cagırdıgımda bana notlari dondursun
	 * 
	 * mapi yazdıralım
	 * 
	 * @param args
	 */

	String[] ogrenci = { "Ayşe", "Ece", "Mahmut" };
	int[] notlar = { 60, 70, 80 };
	int[][] notlar2 = { { 50, 60, 60 }, { 60, 40, 80 }, { 80, 90, 100 } }; // map olustur2 methodu
	Map<String, Integer> sinif = new HashMap<String, Integer>();
	Map<String, List<Integer>> ciftBoyutluNotlar = new HashMap<String, List<Integer>>();

	public static void main(String[] args) {

		MapOrnek2 map2 = new MapOrnek2();
//		map2.mapOlustur();
//		map2.mapYazdir();

		map2.mapOlustur2();
		map2.mapYazdir2();

	}

	public void mapOlustur() {
		for (int i = 0; i < ogrenci.length; i++) {
			sinif.put(ogrenci[i], notlar[i]);
		}
	}

	public void mapYazdir() {
		for (Entry<String, Integer> ogrenciler : sinif.entrySet()) {
			System.out.println(ogrenciler.getKey() + " = " + ogrenciler.getValue());
		}
	}

	public void mapOlustur2() {

		for (int i = 0; i < ogrenci.length; i++) {
			List<Integer> liste = new ArrayList<Integer>();
			for (int j = 0; j < notlar2[i].length; j++) {
				liste.add(notlar2[i][j]);
			}
			ciftBoyutluNotlar.put(ogrenci[i], liste);
		}
	}

	public void mapYazdir2() {
		for (Entry<String, List<Integer>> ogrenciler : ciftBoyutluNotlar.entrySet()) {
			System.out.println(ogrenciler.getKey() + " = " + ogrenciler.getValue());
		}
	}
	// TODO parametreli çözümünü yapın

}
