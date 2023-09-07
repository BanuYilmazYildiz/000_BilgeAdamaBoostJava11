package com.bilgeadam.week10.lecture003;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Menager {
	/*
	 * 1- Ogrenci sinifinde 2 adet field var; isim ve notlar, getters/setters.... 2
	 * tane constructor olusturalım, biri sadece isim, digeri isim ve notlar alsin
	 * 
	 * 1.1 - Dosyamızı okuyalim dosyadan okudugumuz verilere gore once sadece isim
	 * olan constructoru kullanarak ogrencilerListesi olusturalim. Bu listeyi
	 * yazdiralim
	 * 
	 * 2- ogrenci listesinden bir serileştirme işlemi yaparak, ogrencileri bir
	 * dosyaya yazalım.
	 * 
	 * 3- serileştirip yazdığımız dosyadan gelen ogrenci verilerini okuyup konsola
	 * yazdıralım
	 */

	File file = new File("C:\\Users\\pc\\Desktop\\Java-11\\Eclipse Workspace\\000__BilgeAdamBoostJava11\\ogrenci.txt");
	List<Ogrenci> ogrencilerList = new ArrayList<Ogrenci>();

	public static void main(String[] args) {
		Menager menager = new Menager();
		menager.dosyadanVeriOkuma2();
		menager.dosyayaOgrenciYaz();
//		menager.serialization();
//		System.out.println();
//		menager.deSerilization();
		menager.dosyadanOgrenciOku();
	}

	public void dosyadanVeriOkuma() {
		String metin = "";
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String deger = "";
			while ((deger = bufferedReader.readLine()) != null) {
				metin += deger + "\n";
				Ogrenci ogrenci = new Ogrenci(deger.substring(0, deger.indexOf(",")));
				ogrencilerList.add(ogrenci);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		ogrencilerList.stream().forEach(ogrenci -> System.out.println(ogrenci));
	}

	public void dosyadanVeriOkuma2() {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String deger = "";
			while ((deger = bufferedReader.readLine()) != null) {
				String[] array = deger.split(",");
				double ortalama = ortHesapla2(Arrays.asList(array));
				Ogrenci ogreci = new Ogrenci(array[0], ortalama);
				ogrencilerList.add(ogreci);
//				for (String string : array) {
//					System.out.print(string + ",");
//				}
//				System.out.println();

			}

		} catch (Exception e) {
		}
		ogrencilerList.stream().forEach(ogrenci -> System.out.println(ogrenci));

	}

	private double ortHesapla(List<String> asList) {
		double toplam = 0;
		for (int i = 1; i < asList.size(); i++) {
			toplam = toplam + Double.parseDouble(asList.get(i));
		}
		return toplam / (asList.size() - 1);
	}

	private double ortHesapla2(List<String> asList) {
		return asList.subList(1, asList.size()).stream()
				.collect(Collectors.averagingDouble(x -> Double.parseDouble(x)));
	}

	// Benim yaptığım
	public void serialization() {
		ObjectOutputStream objectOutputStream = null;
		try {
			FileOutputStream fos = new FileOutputStream(
					"C:\\Users\\pc\\Desktop\\Java-11\\Eclipse Workspace\\000__BilgeAdamBoostJava11\\ogrenci_yeni.txt");
			objectOutputStream = new ObjectOutputStream(fos);
			for (Ogrenci ogrenci : ogrencilerList) {
				objectOutputStream.writeObject(ogrenci);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Derste yaptığımız -> Object olarak yazıyoruz
	private void dosyayaOgrenciYaz() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
					"C:\\Users\\pc\\Desktop\\Java-11\\Eclipse Workspace\\000__BilgeAdamBoostJava11\\ogrenciseri.txt"));
			ogrencilerList.forEach((ogrenci) -> {
				try {
					oos.writeObject(ogrenci);
					System.out.println(ogrenci.getIsim() + " isimli ogrenci  ogrenciseri.txt ye kaydedildi");
				} catch (IOException e) {
					e.printStackTrace();
				}

			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Derste yaptığımız 2 -> liste olarak serileştirdik
	private void dosyayaOgrenciYaz2() {
		File file = new File(
				"C:\\Users\\pc\\Desktop\\Java-11\\Eclipse Workspace\\000__BilgeAdamBoostJava11\\ogrenciseri.txt");
//		file.createNewFile();
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			try {
				oos.writeObject(ogrencilerList);
				System.out
						.println("Öğrenciler " + file.getName() + " dosyasına kaydedildi...." + file.getAbsolutePath());

			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (

		Exception e) {
			e.printStackTrace();
		}
	}

	// Benim yaptığım
	public void deSerilization() {
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\pc\\Desktop\\Java-11\\Eclipse Workspace\\000__BilgeAdamBoostJava11\\ogrenci_yeni.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fis);

			while (true) {
				try {
					Ogrenci ogrenci = (Ogrenci) objectInputStream.readObject();
					System.out.println(ogrenci);
				} catch (EOFException e) {

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// Derste yaptığımız -> Object olarak okuyoruz
	private void dosyadanOgrenciOku() {
		File file = new File(
				"C:\\Users\\pc\\Desktop\\Java-11\\Eclipse Workspace\\000__BilgeAdamBoostJava11\\ogrenciseri.txt");
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			Ogrenci ogrenci;
			while ((ogrenci = (Ogrenci) ois.readObject()) != null) {
				System.out.println(ogrenci);
			}

		} catch (Exception e) {
			System.out.println("Dosya sonuna ulaşıldı....");
		}
	}

	// Derste yaptığımız 2 -> liste olarak okuyoruz
	private void dosyadanOgrenciOku2() {
		File file = new File(
				"C:\\Users\\pc\\Desktop\\Java-11\\Eclipse Workspace\\000__BilgeAdamBoostJava11\\ogrenciseri.txt");
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			List<Ogrenci> ogrencilerOis = (List<Ogrenci>) ois.readObject();
			ogrencilerOis.forEach(ogrenci -> System.out.println(ogrenci));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
