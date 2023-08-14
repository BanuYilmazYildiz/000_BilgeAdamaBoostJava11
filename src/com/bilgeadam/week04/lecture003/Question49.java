package com.bilgeadam.week04.lecture003;

import java.util.Scanner;

public class Question49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lütfen bir tek sayı giriniz : ");
		int tekSayi = sc.nextInt();
		System.out.print("Lütfen sütun sayısını giriniz : ");
		int sutunSayisi = sc.nextInt();
		System.out.print("Lütfen satır sayısını giriniz : ");
		int satirSayisi = sc.nextInt();

		printArray(tekSayi, sutunSayisi, satirSayisi);

	}

	public static void printArray(int tekSayi, int sutunSayisi, int satirSayisi) {
		int min = 1;
		int[][] array = new int[satirSayisi][sutunSayisi];
		for (int i = 0; i < satirSayisi; i++) {
			for (int j = 0; j < sutunSayisi; j++) {
				if (i == j) {
					array[i][j] = (min + tekSayi) / 2;
				} else if (j > i) {
					array[i][j] = tekSayi;
				} else {
					array[i][j] = min;
				}
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
