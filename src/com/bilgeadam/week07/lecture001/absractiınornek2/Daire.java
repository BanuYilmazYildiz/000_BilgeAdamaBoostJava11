package com.bilgeadam.week07.lecture001.absractiınornek2;

public class Daire extends Sekil {

	public Daire(String renk, double uzunluk) {
		super(renk, uzunluk);

	}

	@Override
	public double alanHesapla() {
		return getPI() * getUzunluk() * getUzunluk();
	}

	@Override
	public double cevreHesapla() {
		return 2 * getPI() * getUzunluk();

	}

}
