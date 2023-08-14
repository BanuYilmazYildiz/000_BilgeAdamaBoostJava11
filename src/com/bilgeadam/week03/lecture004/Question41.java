package com.bilgeadam.week03.lecture004;

public class Question41 {

	public static void main(String[] args) {
		/*
		 * çarpım tablosunu yazdıralım 1x1=1 1x2=2 ..... (10'a kadar olan 10 da dahil)
		 */

//		int carpimTablosu[][] = new int[10][10];
//		int sonuc = 0;
//		for (int i = 0; i < carpimTablosu.length; i++) {
//			for (int j = 0; j < carpimTablosu.length; j++) {
//				carpimTablosu[i][j] = (i + 1) * (j + 1);
//
//				System.out.println((i + 1) + " x " + (j + 1) + " = " + carpimTablosu[i][j]);
//			}
//		}
		String carpimTablosu[][] = new String[10][10];
		for (int i = 0; i < carpimTablosu.length; i++) {
			for (int j = 0; j < carpimTablosu.length; j++) {
				carpimTablosu[i][j] = (i + 1) + " x " + (j + 1) + " = " + ((i + 1) * (j + 1));
			}
		}

		for (int i = 0; i < carpimTablosu.length; i++) {
			for (int j = 0; j < carpimTablosu.length; j++) {
				System.err.println(carpimTablosu[i][j]);
			}
			System.out.println();
		}

	}
}
