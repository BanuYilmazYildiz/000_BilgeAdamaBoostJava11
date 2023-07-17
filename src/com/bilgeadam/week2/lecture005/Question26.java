package com.bilgeadam.week2.lecture005;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		/*
		 * Dışarıdan bir string girdisi olsun Bu stringin her bir char ını bulunduğu
		 * index ile birlikte yazdır
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Lütfen bir string giriniz: ");
		String string = sc.nextLine();

		for (int i = 0; i < string.length(); i++) {
			System.out.println(i + " -> " + string.charAt(i));
		}
		sc.close();

	}

}
