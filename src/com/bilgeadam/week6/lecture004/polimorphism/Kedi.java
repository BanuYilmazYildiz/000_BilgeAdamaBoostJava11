package com.bilgeadam.week6.lecture004.polimorphism;

public class Kedi extends Hayvan implements IMiyavlayabilir {

	@Override
	public void sesCikar() {
		System.out.println("Miyav");
	}

	@Override
	public void miyavle() {
		System.out.println("Miyav");

	}

	@Override
	public void temizle() {
		System.out.println("Kedi temizlendi");

	}

}
