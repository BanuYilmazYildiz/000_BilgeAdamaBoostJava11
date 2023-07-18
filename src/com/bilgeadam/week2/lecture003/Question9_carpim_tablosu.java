package com.bilgeadam.week2.lecture003;

import java.util.Scanner;

public class Question9_carpim_tablosu {
	/*
	 * Kullanıcıdan girilen 1-10 arasındaki sayının çarpım tablosunu yazdıran
	 * program.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lutfen 1-10 arasında bir sayi giriniz: ");
		int sayi = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			int carpim = sayi * i;
			System.out.println(sayi + "x" + i + "=" + carpim);
		}
		sc.close();
	}

}
