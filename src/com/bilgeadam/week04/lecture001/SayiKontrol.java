package com.bilgeadam.week04.lecture001;

import java.util.Scanner;

public class SayiKontrol {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

	}

	/**
	 * Dışarıdan parametre olarak bir String değer alacağız. Sonra bu aldığımız
	 * String değerin bütün "char"larında gezmemiz gerekiyor. Her gezdiğimiz
	 * "char"da : Negatif sayıları kontrol edebilmek için string'in 0. indexinde "-"
	 * var mı diye kontrol edebiliriz. Sonrasında Character.isDigit(); metodunu
	 * kullanabiliriz. Bu metot bize true ya da false bir değer dönecektir.
	 * 
	 * @return
	 * 
	 *         Buradan dönen değere göre kullanıcıya; "Lütfen geçerli bir değer
	 *         giriniz" yönlendirmesi yapabilir,
	 */
	public static boolean isNumeric(String deger) {

		int length = deger.length();
		if (length == 0) {
			return true;
		} else if (deger.charAt(0) == '-') {
			deger = deger.substring(1);
			for (int i = 0; i < deger.length(); i++) {
				if (!Character.isDigit(deger.charAt(i))) {
					return false;
				}
			}

			return true;
		} else {
			for (int i = 0; i < deger.length(); i++) {
				if (!Character.isDigit(deger.charAt(i))) {
					return false;
				}
			}

			return true;

		}

	}

}
