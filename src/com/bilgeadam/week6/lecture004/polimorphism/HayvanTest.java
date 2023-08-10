package com.bilgeadam.week6.lecture004.polimorphism;

public class HayvanTest {

	public static void main(String[] args) {
		Kedi kedi = new Kedi();
		System.out.println(kedi.getClass().getSimpleName());
		Kopek kopek = new Kopek();

		kedi.setName("Serafettin");
		System.out.println(kedi.getName());
		kedi.sesCikar();

		kopek.setName("Oddie");
		System.out.println(kopek.getName());
		kopek.sesCikar();
		kedi.temizle();

	}

}
