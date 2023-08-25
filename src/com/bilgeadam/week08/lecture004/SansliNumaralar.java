package com.bilgeadam.week08.lecture004;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SansliNumaralar {
	/**
	 * 1 ile 100 arasdında rast gele 10.000 adet sayı üreteceğiz
	 * 
	 * 1-sayiOlustur methodu ile rastgele oluşturduğumuz sayiları bir map'a atacağız
	 * sayının kaç kere tekrar ettiğiniz tutacağz
	 * 
	 * key= sayi, tekrar sayisi=value
	 * 
	 * 2- mapte gezinirken Her eleman tekrar ediyorsa listeye o kadar eklenecek
	 * 
	 * 
	 * 3- en son oluşturduğumuz listeden rastgele 10 adet değer alacağız ve bu
	 * aldığımız değeleri bir set e ekleyeceğiz bu işleme geçmeden önce listemizi
	 * karıştıralım. Collections.shuffle(); liste elemanlarını karıştırır
	 */
	Random random = new Random();
	Map<Integer, Integer> sayilarMap = new HashMap<Integer, Integer>();
	List<Integer> sayilarListe = new ArrayList<Integer>();
	Set<Integer> sayilarSet = new TreeSet<Integer>();
	static int maxSayi = 100;

	static int uretilenSayiMiktari = 10_000;

	public void mapOlustur() {

		for (int i = 0; i < uretilenSayiMiktari; i++) {
			int rastgeleSayi = sayiOlustur();
			if (sayilarMap.containsKey(rastgeleSayi)) {
				sayilarMap.put(rastgeleSayi, sayilarMap.get(rastgeleSayi) + 1);
			} else {
				sayilarMap.put(rastgeleSayi, 1);
			}
		}

	}

	public void sansliNumaralariBul() {
		Random random = new Random();
		Collections.shuffle(sayilarListe);
		while (sayilarSet.size() < 10) {
			int index = random.nextInt(0, sayilarListe.size());
			sayilarSet.add(sayilarListe.get(index));
			sayilarSet.remove(index);
		}

	}

//	public void listeyeEkle() {
//		for (int i = 1; i <= maxSayi; i++) {
//			for (int j = 0; j < sayilarMap.get(i); j++) {
//				sayilarListe.add(i);
//			}
//		}
//	}

	public void listeyeEkle() {
//		for (Entry<Integer, Integer> sayi : sayilarMap.entrySet()) {
//			for (int i = 0; i < sayi.getValue(); i++) {
//				sayilarListe.add(sayi.getKey());
//			}
//		}
		sayilarMap.forEach((k, v) -> {
			for (int i = 0; i < v; i++) {
				sayilarListe.add(k);
			}
		});
	}

	private int sayiOlustur() {
		return random.nextInt(1, maxSayi + 1);
	}

}
