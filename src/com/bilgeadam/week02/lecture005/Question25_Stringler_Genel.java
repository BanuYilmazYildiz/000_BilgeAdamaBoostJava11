package com.bilgeadam.week02.lecture005;

public class Question25_Stringler_Genel {

	public static void main(String[] args) {
		String value = " Merhaba Dünya ";
		String value2 = "Merhaba Dünya";
		String value3 = "Merhaba Dünya";

		System.out.println(value.charAt(2));
		System.out.println(value.trim());
		System.out.println(value.length());
		System.out.println(value.indexOf("a"));
		System.out.println(value.lastIndexOf("a"));
		System.out.println(value.substring(5));
		System.out.println(value.substring(0, 5));
		System.out.println(value.equals(value2));
		System.out.println(value == " Merhaba Dünya ");
		System.out.println(value.trim() == value2); // RAM üzerinde aynı yerde mi kayıt olmuşlar buna bakıyoruz.
		System.out.println("****************************");
		System.out.println(value.trim().equals(value2));
		System.out.println(value2 == value3);

	}

}
