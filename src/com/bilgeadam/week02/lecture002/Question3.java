package com.bilgeadam.week02.lecture002;

public class Question3 {

	/**
	 * Türk lirasını "amount" olarak alalım. Dolara çevirelim
	 * 
	 * 
	 */

	public static void main(String[] args) {

		double amount = 100;
		double dolarKuru = 26.11;
		double exchange;
		exchange = amount / dolarKuru;
		System.out.println(amount + "TL: " + exchange + "dolara eşittir.");

	}

}
