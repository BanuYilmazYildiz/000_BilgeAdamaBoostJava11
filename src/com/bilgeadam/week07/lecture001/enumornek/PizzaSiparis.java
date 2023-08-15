package com.bilgeadam.week07.lecture001.enumornek;

/**
 * 
 * boyutSec() hamurTipiSec() turSec()
 * 
 * 
 */

public class PizzaSiparis {

	public void menu() {
		System.out.println("Pizza Siparis Menüsü");
		Pizza pizza = pizzaSec();
		siparisHazirla(pizza);
	}

	private void siparisHazirla(Pizza pizza) {

		System.out.println(pizza.toString());
		System.out.println("Siparişiniz hazırlanıyor...");

	}

	public Pizza pizzaSec() {
		EBoyut boyut = boyutSec();
		EHamurTipi hamurTipi = hamurTipiSec();
		ETur tur = turSec();

		Pizza pizza = new Pizza(boyut, hamurTipi, tur, 0);
		return pizza;
	}

	public EBoyut boyutSec() {
		for (EBoyut boyut : EBoyut.values()) {
			System.out.println(boyut.ordinal() + 1 + " - " + boyut);
		}

		int secim = Utility.intDegerAlma("Pizza Boyutunu Seçiniz : ");
		switch (secim) {
		case 1:
			return EBoyut.KUCUK;

		case 2:
			return EBoyut.ORTA;

		case 3:
			return EBoyut.BUYUK;
		default:
			return null;

		}

	}

	public EHamurTipi hamurTipiSec() {
		for (EHamurTipi hamurTipi : EHamurTipi.values()) {
			System.out.println(hamurTipi.ordinal() + 1 + " - " + hamurTipi);
		}

		int secim = Utility.intDegerAlma("Pizza Hamur Tipini Seçiniz : ");
		switch (secim) {
		case 1:
			return EHamurTipi.INCE;

		case 2:
			return EHamurTipi.NORMAL;

		case 3:
			return EHamurTipi.KALIN;

		}
		return null;

	}

	public ETur turSec() {
		for (ETur tur : ETur.values()) {
			System.out.println(tur.ordinal() + 1 + " - " + tur);
		}

		int secim = Utility.intDegerAlma("Pizza Türünü Seçiniz : ");
		return ETur.values()[secim - 1];
	}

}
