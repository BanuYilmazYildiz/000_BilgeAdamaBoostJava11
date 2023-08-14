package com.bilgeadam.week07.lecture001.absractiınornek2;

public class Test {
	/**
	 * Bir daire ve kare sinifi oluşturulaım
	 * 
	 * Bu sınıfların miras alabileceği super class
	 * oluşturtalım.(Encapsullation,Abstarction ve Polymorphisim konseptlerinden
	 * faydalanalım)
	 * 
	 * Butun geometrik şekillerin birer rengi ve geometrik şeklin alanını ve
	 * çevresini hesaplamak için gerekli yapıları (fieldları) olacak.
	 * 
	 * Butun geometrik sekilleri ciz() isimli bir metod ile çizebilmek istiyorum
	 * 
	 * Sekillerin alanlarını ve çevrelerini hesaplayabilmek istiyorum
	 * 
	 * İpucu: Daire için yaricap, kare için ek bir kenar ölçüsü yeterli olacaktır
	 * 
	 * Pi yi 3.14 alalım (final)
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Daire daire1 = new Daire("Kırmızı", 5);
		System.out.println(daire1.getRenk());
		daire1.ciz();
		System.out.println(daire1.cevreHesapla());
		System.out.println(daire1.alanHesapla());

		Dikdortgen kare1 = new Dikdortgen("pembe", 4, 3);
		System.out.println(kare1.getRenk());
		kare1.ciz();
		System.out.println(kare1.cevreHesapla());
		System.out.println(kare1.alanHesapla());

	}

}
