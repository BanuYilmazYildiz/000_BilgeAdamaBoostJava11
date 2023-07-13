package com.bilgeadam.week2.lecture004;

import java.util.Scanner;

public class Question18 {
	/*
	 * Telefon kodu ve e-mail kodu tanımlanacak. Kullanıcıdan e-mail ve telefon kodu
	 * girmesini isteyeceğiz. hem sms hem e mail kodu hatalıysa bir çıktı. sms
	 * doğru, email kodu yanlış ise farklı bir çıktı. sms yanlış, e mail kodu doğru
	 * ise farklı bir çıktı. hepsi doğruysa "Giriş yaptınız".
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

		if (telefon != telefon_kodu && email == email_kodu)
			System.out.println("SMS kodu hatalı, e-mail kodu doğrudur.");
		else if (telefon == telefon_kodu && email != email_kodu)
			System.out.println("SMS kodu doğru, e-mail kodu hatalıdır");
		else if (telefon != telefon_kodu && email != email_kodu)
			System.out.println("telefon kodu ve e-mail kodu hatalıdır");
		else
			System.out.println("Sisteme başarı ile giriş yaptınız");
		sc.close();

	}

}
