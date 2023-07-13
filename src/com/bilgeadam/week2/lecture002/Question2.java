package com.bilgeadam.week2.lecture002;

public class Question2 {

	/**
	 * Bir ürünün fiyatında %18 KDV var ve %15 kar olduğunu biliyoruz. bir ürün
	 * fiyatım olsun. ürün fiyatımdan ham fiyatı bulmak istiyoruz.
	 * 
	 */

	public static void main(String[] args) {
		float rawPrice = 0, priceWithoutVat, price = 100;
		priceWithoutVat = price / 1.18f;
		rawPrice = priceWithoutVat / 1.15f;
		System.out.println("KDV'siz fiyat: " + priceWithoutVat);
		System.out.println("Ham fiyat: " + rawPrice);

	}

}
