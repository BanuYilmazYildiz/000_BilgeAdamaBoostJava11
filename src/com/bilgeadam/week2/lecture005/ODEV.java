package com.bilgeadam.week2.lecture005;

import java.util.Scanner;

public class ODEV {

	public static void main(String[] args) {
		/*
		 * Dışarıdan bir değer alacağız, bu aldığımız değerin içerisinde kaç tane "a"
		 * harfi olduğunu bize döndürecek bir program.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Lütfen bir string giriniz: ");
		String kelime = sc.nextLine();

		int sayac = 0;
		char harf = 'a';
		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i) == 'a') {
				sayac++;
			}
		}
		System.out.println("Girilen kelimede " + sayac + " tane " + harf + " harfi vardır");
		sc.close();
	}

}
