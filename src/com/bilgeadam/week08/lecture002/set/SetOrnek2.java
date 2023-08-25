package com.bilgeadam.week08.lecture002.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOrnek2 {
	/**
	 * Dışarıdan bir string değer alacağız
	 * 
	 * Bu string değerdeki her bir harfi kontrol edeceğiz
	 * 
	 * Tekarar edenleri bir sete tekrar etmeyenleri ise başka bir sete atacağız
	 * 
	 * araba
	 * 
	 * tekrar edenler a
	 * 
	 * tekrar etmeyenler r,b
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Lütfen string bir değer giriniz : ");
		String deger = sc.nextLine();

		Set<Character> tekrarEdenler = new HashSet<Character>();

		Set<Character> tekrarEtmeyenler = new HashSet<Character>();

		for (int i = 0; i < deger.length(); i++) {
			char harf = deger.charAt(i);
			if (!tekrarEdenler.contains(harf) && !tekrarEtmeyenler.add(harf)) {
				tekrarEtmeyenler.remove(harf);
				tekrarEdenler.add(harf);
			}

		}

		System.out.println("Tekrar edenler");
		System.out.println(tekrarEdenler);
		System.out.println();
		System.out.println("Tekrar etmeyenler");
		System.out.println(tekrarEtmeyenler);
	}

}
