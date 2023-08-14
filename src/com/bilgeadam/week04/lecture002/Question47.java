package com.bilgeadam.week04.lecture002;

public class Question47 {
	/**
	 * Dışarıdan 10 sayısı girilecek. İlk metoda parametre olarak 10 sayısını
	 * vererek;
	 * 
	 * 1- 10+50
	 * 
	 * 2- (10+50) *30
	 * 
	 * 3- ((10+50)*30)-40
	 * 
	 * 4- (((10+50)*30)-40)/20 işlemlerini yaptıracağız.
	 * 
	 * 
	 * Bunu tek bir satırda metotların içerisine metotlar geçirerek yapacağız.
	 * 
	 * 
	 * 
	 **/

	public static void main(String[] args) {

		double sonuc = yirmiyeBol(kirkCikar(otuzIleCarp(elliEkle(125))));
		System.out.println(sonuc);
	}

	private static int elliEkle(int sayi) {
		return sayi + 50;
	}

	private static int otuzIleCarp(int sayi) {

		return sayi * 30;
	}

	private static int kirkCikar(int sayi) {

		return sayi - 40;
	}

	private static double yirmiyeBol(int sayi) {

		return sayi / 20.0;
	}

}
