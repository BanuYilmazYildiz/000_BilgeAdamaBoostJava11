package com.bilgeadam.week07.lecture001.absractiınornek;

public class Motorsiklet extends Tasit {

	@Override
	public void akrobatikHareketYap() {
		System.out.println("Motor ön kaldırıyor.");

	}

	public Motorsiklet() {
		super();

	}

	public Motorsiklet(String marka, String model, int hiz, String vites) {
		super(marka, model, hiz, vites);

	}

}
