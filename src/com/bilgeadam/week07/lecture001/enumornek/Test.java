package com.bilgeadam.week07.lecture001.enumornek;

public class Test {

	public static void main(String[] args) {

//		Pizza pizza = new Pizza();

//		pizza.setBoyut(EBoyut.KUCUK);
//		pizza.setHanurTipi(EHamurTipi.KALIN);
//		pizza.setPizzaTuru(ETur.TAVUKLU);
//		pizza.setFiyat(50);
//		Pizza pizza = new Pizza(EBoyut.KUCUK, EHamurTipi.KALIN, ETur.TAVUKLU, 50);
//
//		System.out.println(pizza.toString());

//		String isim = Utility.stringDegerAlma("Lutfen bir kelime giriniz : ");
//		int sayi = Utility.intDegerAlma("Lutfen bir sayi giriniz : ");

//		System.out.println(isim);
		Pizza pizza2 = new Pizza();

//		ETur.values(); // enum ın değerlerinin hepsine erişir.
		PizzaSiparis siparis = new PizzaSiparis();

		siparis.menu();

	}

}
