package com.bilgeadam.week07.lecture002.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMetotlari {

	public static void main(String[] args) {
		List<String> sehirler = new ArrayList<String>();
		sehirler.add("Ankara"); // eleman ekleme
		sehirler.add("Adana");
		sehirler.add("Antalya");
		sehirler.add("İzmir");
		sehirler.add("Canakkale");
		sehirler.add("Balikesir");
		sehirler.add("Hatay");
		sehirler.add("Eskisehir");

		// listeyi gezme
		for (String sehir : sehirler) {
			System.out.println(sehir);
		}

		// listeden eleman çıkarma
//		sehirler.remove(0);  //indexe göre eleman çıkar
		sehirler.remove("Adana"); // index değerine göre eleman çıkarma
		System.out.println();

		for (String sehir : sehirler) {
			System.out.println(sehir);
		}

		// listenin belli bir indexine eleman ekleme
		System.out.println();
		sehirler.add(5, "Adana");
		for (String sehir : sehirler) {
			System.out.println(sehir);
		}

		System.out.println();
//		sehirler.clear(); // Butun listeyi temizleme
//		for (String sehir : sehirler) {
//			System.out.println(sehir);
//		}

		// Listenin elemanlarına erişim

		System.out.println("Seçilen sehir: " + sehirler.get(7));

		sehirler.set(sehirler.indexOf("Hatay"), "İskenderun");
		for (String sehir : sehirler) {
			System.out.println(sehir);
		}

		// Llistenin boyutuna erişme
		System.out.println();
		System.out.println(sehirler.size());

		// Liste içinde arama ve kontrol yapma
		sehirler.contains("Ankara");
		System.out.println(sehirler.contains("Ankara"));
		sehirler.indexOf("Adana");
		System.out.println(sehirler.indexOf("Adana")); // eğer girilen eleman listede yok ise -1 döner

		System.out.println();
		sehirler.add("Ankara"); // Ankara nın bulunduğu son indexi geri döner
		System.out.println(sehirler.lastIndexOf("Ankara"));

		// Sublist
		sehirler.subList(3, 7);
		System.out.println(sehirler.subList(3, 7));

		// Donusturmeler
		String[] arraySehirlre = sehirler.toArray(new String[sehirler.size()]); // array list to array
		List<String> sehirler2 = new ArrayList<String>();
		sehirler2.add("Trabzon");
		sehirler2.add("Rize");
		sehirler2.add("Artvin");
		sehirler.addAll(sehirler2);
		System.out.println();
		for (String sehir : sehirler) {
			System.out.println(sehir);
		}

	}

}
