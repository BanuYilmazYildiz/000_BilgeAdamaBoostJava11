package com.bilgeadam.week6.lecture003.calisaninterface;

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

		OfisCalisani ofisCalisani = new OfisCalisani("Banu", "Yılmaz");
		System.out.println(ofisCalisani.getMaas());
		System.out.println(ofisCalisani.getIsUnvani());
		// 2 paremetreli constructor set unvan methodunu çalıştırmadığı için null
		// donuyor.

		OfisCalisani ofisCalisani2 = new OfisCalisani("Batu", "Yıldız", 10_000);
		System.out.println(ofisCalisani2.getMaas());
		System.out.println(ofisCalisani2.getIsUnvani());
		// 3 parametreli constructor maas yazıldığı ve setUnvan çalıştığı için unvan
		// dönüyor

		Muhendis muhendis = new Muhendis("Banu", "Yılmaz");
		System.out.println(muhendis.getIsUnvani());
		System.out.println(muhendis.getMaas());

		Muhendis muhendis2 = new Muhendis("Batu", "Yıldız", 15_000);
		System.out.println(muhendis2.getIsUnvani());
		System.out.println(muhendis2.getMaas());
		System.out.println(muhendis2.getClass().getSimpleName());
		System.out.println(ofisCalisani.getClass().getSimpleName());

		InsanKaynaklari insanKaynaklari = new InsanKaynaklari("Serli", "Cakir");
		insanKaynaklari.zamYap(muhendis2, 20);
		System.out.println(muhendis2.getMaas());
		insanKaynaklari.zamYap(ofisCalisani2, 10);
		System.out.println(ofisCalisani2.getMaas());
	}

}
