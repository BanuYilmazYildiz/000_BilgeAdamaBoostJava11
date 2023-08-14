package com.bilgeadam.week06.lecture003.kalitim;

public class Test {

	public static void main(String[] args) {
		/**
		 * 
		 * 
		 * 
		 * -- Mühendislerimiz olacak
		 * 
		 * isim soyiisim iş unvani maaşı enz az iki constructr istiyorum (isim soy isim)
		 * (isim soyisim maaş)
		 * 
		 * maaşş zammı metodu olacak
		 * 
		 * maaş default en az 10000 1000 12000 arası unvan muhendis eger maaşı
		 * 1200-17000 arasında ise kıdemlı muhendis 1700den yuksek ise uzman muhendis
		 * eğer maaaşı 1000 kucuk ise stajyer ve
		 * 
		 * zam oranına ek olarak 250tl bonus alacaklar
		 * 
		 * 
		 *
		 * -- ofis çalışanları olacak
		 * 
		 * isim soyiisim iş unvani maaşı
		 * 
		 * en düşük çalışan maaşı 8000 8000 1200 arası çalışan 12000 den sonraı kidemli
		 * calıasan 8000den az ise stajyer
		 * 
		 * 
		 *
		 */

		OfisCalisani ofisCalisani = new OfisCalisani("Alperen", "Ikınci");
		System.out.println(ofisCalisani.getIsim() + " " + ofisCalisani.getSoyisim());
		System.out.println(ofisCalisani.getMaas());
//		ofisCalisani.setIsUnvani(ofisCalisani.getMaas());
		ofisCalisani.maasZammi(0);
		System.out.println(ofisCalisani.getIsUnvani());
		ofisCalisani.maasZammi(50);
		System.out.println(ofisCalisani.getIsUnvani());

		System.out.println("**************");
		Calisan ofisCalisani2 = new OfisCalisani("Sedat", "Akdoğan", 12000);
		System.out.println(ofisCalisani2.getIsUnvani());

		System.out.println("**************");
		Muhendis muhendis = new Muhendis("Banu", "Yılmaz");
		System.out.println(muhendis.getIsim() + " " + muhendis.getSoyisim());
		muhendis.setMaas(10_000);
		muhendis.setIsUnvani(muhendis.getMaas());
		System.out.println(muhendis.getMaas());
		System.out.println(muhendis.getIsUnvani());
		muhendis.maasZammi(100);
		System.out.println(muhendis.getMaas());
		System.out.println(muhendis.getIsUnvani());

		System.out.println("**************");
		Calisan muhendis2 = new Muhendis("Batu", "Yıldız", 15_000);
		System.out.println(muhendis2.getIsUnvani());
		muhendis2.maasZammi(60);
		System.out.println(muhendis2.getMaas());
		System.out.println(muhendis2.getIsUnvani());
	}

}
