package com.bilgeadam.week03.lecture004;

public class Question43 {

	public static void main(String[] args) {
		// Bir metot yazalım ve bu metot dizi içindeki tek elemanları alıp,
		// başka bir diziye atsın ve o diziyi yazdırsın.
		// int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654,
		// 33, 32, 67, 2 }, { 189, 35, 56, 89, 8 } };

		int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 },
				{ 189, 35, 56, 89, 8 } };

		tekSayiAta(matris);
		System.out.println();
		yazdir(tekSayiAta2(matris));

	}

	public static void tekSayiAta(int[][] ikiBoyutluArray) {

		int[] tekSayilarDizisi = new int[ikiBoyutluArray.length * ikiBoyutluArray[0].length];
		int sayac = 0;
		for (int i = 0; i < ikiBoyutluArray.length; i++) {
			for (int j = 0; j < ikiBoyutluArray[i].length; j++) {
				if (ikiBoyutluArray[i][j] % 2 != 0) {
					tekSayilarDizisi[sayac] = ikiBoyutluArray[i][j];
					sayac++;

				}
			}
		}
		for (int i = 0; i < sayac; i++) {
			if (i == sayac - 1)
				System.out.print(tekSayilarDizisi[i]);
			else
				System.out.print(tekSayilarDizisi[i] + " - ");
		}
	} // tekSayiAta metot sonu

	public static int[] tekSayiAta2(int[][] ikiBoyutluArray) {

		int[] tekSayilarDizisi = new int[ikiBoyutluArray.length * ikiBoyutluArray[0].length];
		int sayac = 0;
		for (int i = 0; i < ikiBoyutluArray.length; i++) {
			for (int j = 0; j < ikiBoyutluArray[i].length; j++) {
				if (ikiBoyutluArray[i][j] % 2 != 0) {
					tekSayilarDizisi[sayac] = ikiBoyutluArray[i][j];
					sayac++;

				}
			}
		}
		return tekSayilarDizisi;
	}

	public static void yazdir(int[] patates) {
		for (int i = 0; i < patates.length; i++) {
			System.out.print(patates[i] + " - ");
		}

	}

}
