package com.bilgeadam.week2.lecture004;

import java.util.Scanner;

public class Question17 {
	/*
	 * Telefon kodu ve e-mail kodu tanımlanacak. Kullanıcıdan e-mail ve telefon kodu
	 * girmesini isteyeceğiz. Girilen e mail kodu hatalı ise e mail hatalı
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int telefon = 444;
		int email = 555;

		System.out.print("Lutfen telefonunuza gelen 3 haneli kodu giriniz : ");
		int telefon_kodu = sc.nextInt();
		System.out.print("Lutfen e-mailinize gelen 3 haneli kodu giriniz : ");
		int email_kodu = sc.nextInt();

		if (telefon != telefon_kodu)
			System.out.println("Telefon kodu hatalıdır");
		if (email != email_kodu)
			System.out.println("e-mail kodu hatalıdır");
		else
			System.out.println("Sisteme başarı ile giriş yaptınız");
		sc.close();

	}

}
