package com.bilgeadam.week2.lecture002;

public class Question4 {
	/**
	 * İki tane string değişken oluşturularım. isim ve soyisim olsun. Sonra bu
	 * değişkenleri ekrana yazdıralım.
	 * 
	 * a ve b karakterlerinin değerini yazdırın. sonra da değer toplamını yazdırın
	 * 
	 */

	public static void main(String[] args) {
		String isim, soyisim;
		isim = "Banu";
		soyisim = "Yılmaz Yıldız";
		// String isimSoyisim = "isim: " + isim + ", Soyisim: " + soyisim;
		// System.out.println(isimSoyisim);
		System.out.println("*****Alt Satır Kırılımı*****");
		System.out.println("isim: " + isim + "\nSoyisim: " + soyisim);

		System.out.println("*********Tab Girdisi*********");
		System.out.println("isim:\t" + isim + "\nsoyisim:\t" + soyisim);

		System.out.println("********************************************");

		// ctrl + shift + 7
		char a = 'a';
		char b = 'b';
		System.out.println("ASCII a: " + (int) a + "\nASCII b: " + (int) b);
		System.out.println(a + b);
		System.out.println('a' + 'b');

	}

}
