package com.bilgeadam.week2.lecture002;

import java.util.Scanner;

public class Question8 {

	/*
	 * Dışarıdan girilen sayının faktoriyeli
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz: ");
		int sayi = sc.nextInt();

		int faktoriyel = 1;

		for (int i = 1; i <= sayi; i++) {
			faktoriyel *= i;
		}
		System.out.println(sayi + " Faktoriyel= " + faktoriyel);
		sc.nextLine();
		System.out.print("Lutfen bir isim giriniz: ");
		String isim = sc.nextLine();
		System.out.println("Merhaba " + isim);

		sc.close();
	}

}
