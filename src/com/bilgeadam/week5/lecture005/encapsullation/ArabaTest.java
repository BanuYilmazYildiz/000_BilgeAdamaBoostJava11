package com.bilgeadam.week5.lecture005.encapsullation;

public class ArabaTest {

	public static void main(String[] args) {
		Araba araba = new Araba();
		System.out.println("***araba***");
//		araba.marka = "bmw";
//		araba.model = "x5";
//		araba.km = 100; // minimum 0 km olabilir. -150 diye çevirelebilir eğer field açıksa
//		araba.bijonSayisi = 5;
//		araba.camSil = "a";
		araba.setMarka("bmw");
		araba.setModel("x5");
//		araba.setBijonSayisi(5);
		araba.setCamSil("a");

		araba.ozellikleriYazdir();
		araba.arabaSur();
		System.out.println();
		araba.ozellikleriYazdir();
		System.out.println();

		// ###########################
		System.out.println("***araba2***");
		Araba araba2 = new Araba("bmw", "x5", -150, 5, "a");
		araba2.ozellikleriYazdir();
		araba2.arabaSur();
		System.out.println();

		System.out.println("***araba3***");
		Araba araba3 = new Araba(150, "a");
		araba3.ozellikleriYazdir();
		araba3.arabaSur();
		System.out.println();

		System.out.println(araba3.getMarka());

		System.out.println();
		Araba araba4 = new Araba("cam sil");
		araba4.arabaSur();
		araba4.ozellikleriYazdir();
	}

}
