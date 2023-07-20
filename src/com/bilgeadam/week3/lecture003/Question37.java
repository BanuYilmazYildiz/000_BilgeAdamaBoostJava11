package com.bilgeadam.week3.lecture003;

public class Question37 {

	public static void main(String[] args) {
		/*
		 * 
		 * int [] sayilar={1,4,5,6,1,1,4,8};
		 * 
		 * dizi içerisinde 1 ve 4 kaç kere geçtiğini ve 1 sayısının adeti 4 sayısının
		 * adetinden büyükse true değilse false
		 * 
		 */

		int[] sayilar = { 1, 4, 5, 6, 1, 1, 4, 8 };
		int sayac1 = 0;
		int sayac4 = 0;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == 1) {
				sayac1++;

			} else if (sayilar[i] == 4) {
				sayac4++;
			}
		}
		System.out.println("1 sayısı:\t" + sayac1 + " adet" + "\n4 sayısı:\t" + sayac4 + " adet\n" + (sayac1 > sayac4));

	}

}
