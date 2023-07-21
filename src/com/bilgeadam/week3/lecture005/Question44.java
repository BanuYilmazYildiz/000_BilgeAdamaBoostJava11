package com.bilgeadam.week3.lecture005;

import java.util.Scanner;

public class Question44 {
	// Bir metot yazalım. Bu metot içerisine 2 tane sayı alsın. Çarpımlarını bize
	// geri dönsün.

	// main metodumda bir sayı değeri olacak sayi=15, bir de sonuc değeri olacak
	// sonuc=0; aşağıda oluşturduğum metotlardan dönen değerleri sonuc =
	// sayi/"metot" işleminde kullanmak istiyorum.

	// yeni bir carpim metodu oluşturalım, iki adet sayıyı dışarıdan alan bir metot
	// oluşturalım. Bu metot 2 sayıyı geri dönsün.
	// Sonra yeni oluşturduğumuz çarpım metodunda iki adet sayı alan metodumuzu
	// kullanarak aynı işlemleri gerçekleştirelim.
//	double sonuc = 0;
//	int total = carpim();
//	if (total == 0) {
//		System.out.println(sayi + " / " + total + " işleminin sonucu tanımsızdır. ");
//	} else {
//		sonuc = (double) sayi / total;
//		System.out.println(sayi + " / " + total + " = " + sonuc);
//	}

//	if (carpim(1, 15) == 0) {
//		System.out.println(sayi + " / " + carpim(1, 15) + " işleminin sonucu tanımsızdır. ");
//	} else {
//		sonuc = (double) sayi / carpim(1, 15);
//		System.out.println(sayi + " / " + carpim(1, 15) + " = " + sonuc);
//	}
//
//	int total = carpim(ikiSayiAl());
//	if (total == 0) {
//		System.out.println(sayi + " / " + total + " işleminin sonucu tanımsızdır. ");
//	} else {
//		sonuc = (double) sayi / total;
//		System.out.println(sayi + " / " + total + " = " + sonuc);
//	}
	public static void main(String[] args) {

		int sayi = 15;

		bolmeKontrol(carpim(), sayi);
		System.err.println("*********");
		bolmeKontrol(carpim(5, 2), sayi);
		System.err.println("*********");
		bolmeKontrol(carpim(ikiSayiAl()), sayi);
	}

	/**
	 * @return -> Kullanıcıdan istenen iki sayının çarpımını geri döndüren method.
	 */
	public static int carpim() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Sayi1: ");
		int sayi1 = sc.nextInt();
		System.out.print("Sayi2: ");
		int sayi2 = sc.nextInt();

		return sayi1 * sayi2;
	}

	/**
	 * Kullanıcıdan 2 int parametre alarak çarpımlarını döndüren method.
	 * 
	 * @param sayi1 -> çarpmak istediğmiz ilk sayi
	 * @param sayi2 -> çarpmak istediğimiz ikinci sayı
	 * @return -> çarpım
	 */
	public static int carpim(int sayi1, int sayi2) {

		return sayi1 * sayi2;
	}

	/**
	 * Kullanıcıdan 2 sayı alıyor ve bu iki sayıyı bize integer olarak döndürüyor
	 * 
	 * @return
	 */
	public static int[] ikiSayiAl() {
		Scanner sc = new Scanner(System.in);
		int[] sayilar = new int[2];
		System.out.print("Sayi1: ");
		sayilar[0] = sc.nextInt();
		System.out.print("Sayi2: ");
		sayilar[1] = sc.nextInt();

		return sayilar;
	}

	/**
	 * 2 elemanlı dizinin iki sayısını çarpma
	 * 
	 * @param sayilar
	 * @return
	 */
	public static int carpim(int[] sayilar) {
		int sayi1 = sayilar[0];
		int sayi2 = sayilar[1];
		int carpim = sayi1 * sayi2;
		return carpim;
	}

	public static void bolmeKontrol(int method, int sayi) {
		if (method == 0) {
			System.out.println(sayi + " / " + method + " işleminin sonucu tanımsızdır. ");
		} else {
			double sonuc = (double) sayi / method;
			System.out.println(sayi + " / " + method + " = " + sonuc);
		}
	}

}
