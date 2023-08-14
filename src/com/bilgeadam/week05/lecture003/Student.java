package com.bilgeadam.week05.lecture003;

public class Student {
	/**
	 * ogrenci isimleri ve numaraları olacak.
	 * 
	 * her yeni öğrenci kaydedildiğinde öğrenci numarası bir artacak.
	 * 
	 * 
	 */
	String ad;
	static int ogrenciNumarasi;

	public void ogrenciKaydet() {
		ogrenciNumarasi++;

		System.out.println(ad + " isimli öğrenci kaydedilmiştir - öğrenci numarası = " + ogrenciNumarasi);
	}

}
