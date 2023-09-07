package com.bilgeadam.week09.lecture005;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchOrnek {

	public static void main(String[] args) {
		/*
		 * Bir tane bölme metodu olsun. Dışarıdan iki paremetre alsın. Sonra bölme
		 * işlemini yapıp sonucu dönsün
		 * 
		 * Bu metodun icerisinde de try-catch yapısını kullanalım
		 */

		System.out.println(bolme());
	}

	public static double bolme() {

		double bolme = 0;
		boolean kontrol = false;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("1. sayiyi giriniz : ");
				int sayi1 = sc.nextInt();
				System.out.print("2. sayiyi giriniz : ");
				int sayi2 = sc.nextInt();
				bolme = sayi1 / sayi2;
				kontrol = false;
			} catch (InputMismatchException e) {
				System.out.println(e.toString() + " Lütfen sadece sayı giriniz");
				kontrol = true;
			} catch (ArithmeticException e) {
				System.out.println(e.toString()+ " 2. sayı 0 olamaz");
			}
		} while (kontrol);
		return bolme;

	}

}
