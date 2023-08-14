package com.bilgeadam.week04.lecture002;

public class Question48 {

	public static void main(String[] args) {
		// Dizideki elemanlar arasındaki farkın en küçük olduğu değer nedir?

		int[] dizi = { 1, 5, -4, 3 };
//		int enKucukFark = Integer.MAX_VALUE;
//
//		for (int i = 0; i < array.length; i++) {
//			for (int j = i + 1; j < array.length; j++) {
//				int fark = Math.abs(array[i] - array[j]);
//				if (fark < enKucukFark) {
//					enKucukFark = fark;
//				}
//			}
//		}
//		System.out.println("En küçük fark değeri = " + enKucukFark);
		System.out.println(enKucukFarkDegeri(dizi));

	}

	private static int enKucukFarkDegeri(int[] array) {

		int enKucukFark = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int fark = Math.abs(array[i] - array[j]);
				if (fark < enKucukFark) {
					enKucukFark = fark;
				}
			}
		}
		return enKucukFark;
	}

}
