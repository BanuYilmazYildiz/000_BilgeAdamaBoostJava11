package com.bilgeadam.week10.lecture003;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class OgretmenTest {

	public static void main(String[] args) {

		File file = new File(
				"C:\\Users\\pc\\Desktop\\Java-11\\Eclipse Workspace\\000__BilgeAdamBoostJava11\\ogrenci.txt");
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			Ogretmen ogretmen = new Ogretmen("Banu", bufferedReader);
			Ogretmen ogretmen2 = new Ogretmen("Batuhan", bufferedReader);
			ogretmen.start();
			ogretmen2.start();

			try { // -> join kullanarak yukarıdakilere işlem önceliği veriyoruz. onlar bitmeden
					// asağı gecmiyor
				ogretmen.join();
				ogretmen2.join();
			} catch (Exception e) {
				// TODO: handle exception
			}
//			try {
//				Thread.sleep(1000);
//				;
//
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
			System.out.println(ogretmen.name + " " + ogretmen.ogrenciler.size() + " tane ogrenci ekledi");
			System.out.println(ogretmen2.name + " " + ogretmen2.ogrenciler.size() + " tane ogrenci ekledi");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
