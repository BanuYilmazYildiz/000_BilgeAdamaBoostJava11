package com.bilgeadam.week3.lecture002;

import java.util.Scanner;

public class Question32_Ulke_Diziler {

	public static void main(String[] args) {
		/*
		 * Dışarıdan girilen ülke ismi bizim array'imizde bulunuyor mu kontrol edelim
		 * Türkiye, Yaponya,Moğolistan, Amerika,Rusya,Çin
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Lütfen ülke giriniz: ");
		String ulke = sc.nextLine();
		String[] countries = { "Türkiye", "Japonya", "Moğolistan", "Amerika", "Rusya", "Çin" };

		for (int i = 0; i < countries.length; i++) {
			if (countries[i].equalsIgnoreCase(ulke)) {
				System.out.println("Girilen ülke array içinde bulunuyor");
				break;
			} else if (i == countries.length - 1) {
				System.err.println("Girilen ülke array içinde bulunmuyor");

			}

		}
		sc.close();

	}

}
