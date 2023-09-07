package com.bilgeadam.week09.lecture005;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchOrnek2 {
	/**
	 * 1- Bir metod ile dışarıdan bir index değeri alalım. sonra o indexteki değeri
	 * yazdırlarım. Hata var ise bu hatayi da try-catch ile yakalayalim.
	 * 
	 * 
	 * 2- Array içinde degezim sayılsal değerleri int e cevirip bir toplama işlemi
	 * yapalım. Toplam değerim array içindeki bütün int değerlerin toplamı olsun.
	 * Bir de alacağım hataların sayısını yazdırmak istiyorum
	 * 
	 * @throws NullKontrolException
	 * 
	 * @throws Exception
	 * 
	 */

	public static void main(String[] args) throws NullKontrolException {
		String[] array = { "a", "10", "bc", null, "20" };
//		indexAl(array);
//		intToplam(array);
//		LocalDate date = Utility.stringTarihAlma();
//		System.out.println(date);

		String deger = null;
//		nullCheck(deger);
//		nullCheck2(deger);
//		nullCheck3(deger);
		nullCheck4(deger);

	}

	public static void indexAl(String[] array) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Lütfen index sayısı giriniz = ");
			int index = sc.nextInt();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("girdiğiniz sayı, 0-" + (array.length - 1) + " arasında olmalı");
		} catch (InputMismatchException e) {
			System.out.println("Tam sayı giriniz");
		}

	}

	public static void intToplam(String[] array) {
		int sayac = 0;
		int toplam = 0;
		for (String deger : array) {
			try {
				int sayi = Integer.parseInt(deger);
				toplam += sayi;
			} catch (NumberFormatException e) {
				System.out.println(e.toString());
				sayac++;
			} finally {
				System.out.println("Finally : " + deger);
			}
		}
		System.out.println("Toplam : " + toplam);
		System.out.println("Alınan hata sayısı : " + sayac);
	}

	/**
	 * unchecked
	 * 
	 * @param deger
	 * @return
	 */
	public static String nullCheck(String deger) {
		if (deger == null) {
			throw new NullPointerException("Null değer olamaz");
		}
		return deger;
	}

	/**
	 * checked -> throws deklerasyonunu her zaman ister
	 * 
	 * @param deger
	 * @return
	 * @throws Exception
	 */
	public static String nullCheck2(String deger) throws Exception {
		if (deger == null) {
			throw new Exception("Null değer olamaz");
		}
		return deger;
	}

	/**
	 * unchecked exception
	 * 
	 * @param deger
	 * @return
	 * @throws NullPointerException
	 */
	public static String nullCheck3(String deger) throws NullPointerException {
		if (deger == null) {
			throw new NullPointerException("Null değer olamaz");
		}
		return deger;
	}

	/**
	 * checked exception
	 * 
	 * @param deger
	 * @return
	 * @throws NullKontrolException
	 */
	public static String nullCheck4(String deger) throws NullKontrolException {
		if (deger == null) {
			throw new NullKontrolException("Null değer olamaz");
		}
		return deger;
	}

}
