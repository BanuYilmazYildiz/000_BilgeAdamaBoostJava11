package com.bilgeadam.week6.lecture003.interfaceornek;

public class Araba extends Tasit {

	@Override
	public void ilerle() {
		System.out.println("Araba ilerliyor.");
		super.ilerle();
	}

	@Override
	public void dur() {
		System.out.println("Araba durdu");
		super.dur();
	}

}
