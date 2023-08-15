package com.bilgeadam.week07.lecture002.ArrayListOrnekler;

import java.util.ArrayList;
import java.util.List;

public class ArrayOrnek1 {
	/*
	 * String bir arraylist
	 * 
	 * Ankara Antalya Bolu Artvin Ankara Antalya Erzurum Karaman Ankara
	 * 
	 * "an" ile baslayan sehirleri listeden cikaralim.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		List<String> sehirler = new ArrayList<String>();
		sehirler.add("Ankara");
		sehirler.add("Antalya");
		sehirler.add("Bolu");
		sehirler.add("Artvin");
		sehirler.add("Ankara");
		sehirler.add("Antalya");
		sehirler.add("Erzurum");
		sehirler.add("Karaman");
		sehirler.add("Ankara");

//		for (int i = 0; i < sehirler.size(); i++) {
//			System.out.println(i + " " + sehirler.get(i));
//		}

//		for (int i = sehirler.size() - 1; i >= 0; i--) {
//			String sehir = sehirler.get(i);
//			if (sehir.startsWith("An")) {
//				sehirler.remove(i);
//
//			} else
//				System.out.println(sehir);
//		}

//		for (int i = 0; i < sehirler.size(); i++) {
//
//			if (sehirler.get(i).startsWith("An")) {
//				sehirler.remove(i);
//				i--;
//
//			} else
//				System.out.println(sehirler.get(i));
//		}

//		for (int i = 0; i < sehirler.size(); i++) {
//			if (sehirler.get(i).startsWith("An")) {
//				sehirler.remove(i);
//				sehirler.add(i, "xxx");
//			}
//		}
//		for (int i = 0; i < sehirler.size(); i++) {
//			if (sehirler.get(i).startsWith("An")) {
//				sehirler.set(i, "xxx");
//
//			}
//		}

		for (String sehir : sehirler) {
			if (sehir.startsWith("An")) {
				sehirler.set(sehirler.indexOf(sehir), "xxx");
			}
		}

		for (String sehir : sehirler) {
			System.out.println(sehir);
		}

	}

}
