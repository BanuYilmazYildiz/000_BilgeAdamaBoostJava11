package com.bilgeadam.week03.lecture002;

import java.util.Scanner;

public class Question30_Iban {

	public static void main(String[] args) {
		/*
		 * Dışarıdan bir ıban değeri girelim TR 1001005001 ,TR 1001005002 veya OTH
		 * 2002002000 gibi daha sonra bu değerleri kontrol edelim eğer Tr ile başlıyorsa
		 * yurt içi işlemler yazsın ve Eğer 5001 ile Bitiyorsa Ziraat 5002 ile bitiyorsa
		 * Garanti 5003 ile bitiyorsa İş bankası yazdırsın eğer OTH ise Yurt dışı
		 * işlemler yazdıralım 2000 ile bitiyorsa kıta içi işelmeler ve OTH yerine Ki
		 * 200200… değilse kıta dışı işlemler yazsın ve OTH yerine Kd 200201…
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen iban giriniz: ");
		String iban = sc.nextLine();

		if (iban.toUpperCase().startsWith("TR")) {
			System.out.println("YURT İÇİ İŞLEMLER");
			if (iban.substring(iban.length() - 4).equals("5001")) {
				System.out.println("ZİRAAT");
			} else if (iban.substring(iban.length() - 4).equals("5002")) {
				System.out.println("GARANTİ");
			} else if (iban.substring(iban.length() - 4).equals("5003")) {
				System.out.println("İŞ BANKASI");
			}
		} else if (iban.toUpperCase().startsWith("OTH")) {
			System.out.println("YURT DIŞI İŞLEMLER");
			if (iban.substring(iban.length() - 4).equals("2000")) {
				System.out.println("KITA İÇİ İŞLEMLER");
				System.out.println(iban.toUpperCase().replace("OTH", "Ki"));
			} else {
				System.out.println("KITA DIŞI İŞLEMLER");
				System.out.println(iban.toUpperCase().replace("OTH", "Kd"));
			}

		} else {
			System.out.println("Yanlış iban girdiniz");
		}
		sc.close();

	}
}
