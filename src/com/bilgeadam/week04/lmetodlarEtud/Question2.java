package com.bilgeadam.week04.lmetodlarEtud;

public class Question2 {

	public static void main(String[] args) {
		/**
		 * int [] alperen = {5,10,25,10,500,1000} int [] muhammet ={10,15,1000,300,1200}
		 * int [] uğurcan = {2000}
		 * 
		 * 2000 tl ve üzeri sepet tutarına uulaşanlara %10 inmdirim. 2500 tl ve üzeri
		 * sepet tutarına ulaşanlara &12.5 indirim.
		 * 
		 * sepetinde 1000tl ve üzeri ve 5 üründen fazla ürün olan kullanıcılara ekstra
		 * %5 indirim. sepet fiyatı üzerinden uygulanacak.
		 */

		int[] alperen = { 5, 10, 25, 10, 500, 1000 };
		int[] muhammet = { 10, 15, 1000, 300, 1200 };
		int[] uğurcan = { 2000 };

		System.out.println("Sepet tutarı = " + calculatePriceAndQuantity(muhammet)[0]);
		System.out.println(
				"Sepet fiyaı üzerinden indirim = " + discountOverCartPrice(calculatePriceAndQuantity(muhammet)));
		System.out.println("Sepetteki ürün adedi ve sepet tutarı üzerinden indirim = "
				+ discountOverQuantities(calculatePriceAndQuantity(muhammet)));

		System.out.println("Ödemeniz gereken tutar = " + discountedCartPrices(calculatePriceAndQuantity(muhammet)[0],
				discountOverCartPrice(calculatePriceAndQuantity(muhammet)),
				discountOverQuantities(calculatePriceAndQuantity(muhammet))));
	}

	public static int[] calculatePriceAndQuantity(int[] cart) {
		int[] priceAndQuantity = new int[2];
		int quantity = cart.length;
		int price = 0;
		for (int i = 0; i < cart.length; i++) {
			price += cart[i];
		}
		priceAndQuantity[0] = price;
		priceAndQuantity[1] = quantity;
		return priceAndQuantity;

	}

	public static double discountOverCartPrice(int[] priceAndQuantity) {
		double discountRatio = 0;
		if (priceAndQuantity[0] >= 2500) {
			discountRatio = 0.125;
		} else if (priceAndQuantity[0] >= 2000) {
			discountRatio = 0.10;
		} else {
			discountRatio = 0;
		}
		return priceAndQuantity[0] * discountRatio;
	}

	public static double discountOverQuantities(int[] priceAndQuantity) {
		double discountRatio;
		if (priceAndQuantity[0] >= 1000 && priceAndQuantity[1] >= 5) {
			discountRatio = 0.05;
		} else {
			discountRatio = 0;
		}

		return priceAndQuantity[0] * discountRatio;
	}

	public static double discountedCartPrices(int cartPrice, double discountOverCartPrice,
			double discountOverQuantities) {

		return cartPrice - discountOverCartPrice - discountOverQuantities;
	}

}
