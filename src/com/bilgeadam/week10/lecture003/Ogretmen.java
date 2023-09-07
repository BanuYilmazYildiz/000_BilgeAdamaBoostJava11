package com.bilgeadam.week10.lecture003;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Ogretmen sinifini thread yapalim. 
 * 
 * run(); methodu ezeelim. 10 kere calissin. Çıktı olarak -> Ogretmen ismi ->> 1. ogrencinin notlarını okudu;
 * Ogretmen ismi ->> 2. ogrencinin notlarını okudu;
 * 
 * 
 * Ogretmen test sinifinda 2 adet ogretmen olusturalim ve thredleri calistiralim
 * 
 * Ogretmenler ayni dosya uzerinde okuma yapip okuduklari veriyi kendi siniflari icindeki ogrenci listesine 
 * verecekler. Bunu da bir thread yapisi ile gerçekleştirelim
 * 
 * OgretmenTest'de 2 adet ogretmenimiz olacak. Bunlari thread olarak calistiracagiz.
 * 
 */

public class Ogretmen extends Thread {

	String name;
	List<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
	BufferedReader bufferedReader;

	File file = new File("C:\\Users\\pc\\Desktop\\Java-11\\Eclipse Workspace\\000__BilgeAdamBoostJava11\\ogrenci.txt");

	public Ogretmen(String name, BufferedReader bufferedReader) {
		super();
		this.name = name;
		this.bufferedReader = bufferedReader;
	}

	@Override
	public void run() { // threadler için run(); main method gibi.
		try {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] array = line.split(",");
				double ortalama = ortHesapla(Arrays.asList(array));
				Ogrenci ogrenci = new Ogrenci(array[0], ortalama);
				ogrenciler.add(ogrenci);
				System.out.println(name + " --> " + ogrenci.getIsim() + " adli ogrenciyi ekledi....");
//				try {
//					sleep(1000);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private double ortHesapla(List<String> asList) {
		return asList.subList(1, asList.size()).stream()
				.collect(Collectors.averagingDouble(x -> Double.parseDouble(x)));
	}

}
