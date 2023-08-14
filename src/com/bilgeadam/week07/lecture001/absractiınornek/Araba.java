package com.bilgeadam.week07.lecture001.absractiınornek;

public class Araba extends Tasit {

	@Override
	public void akrobatikHareketYap() {
		System.out.println("Araba drift attı.");

	}

	public Araba() {
		super();

	}

	public Araba(String marka, String model, int hiz, String vites) {
		super(marka, model, hiz, vites);

	}

}
