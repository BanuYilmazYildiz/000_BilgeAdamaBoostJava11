package com.bilgeadam.week07.lecture001.absractiınornek2;

public class Dikdortgen extends Sekil {
	private double yukseklik;

	public Dikdortgen(String renk, double uzunluk, double yukseklik) {
		super(renk, uzunluk);
		this.yukseklik = yukseklik;
	}

	@Override
	public double alanHesapla() {
		return getUzunluk() * getYukseklik();

	}

	@Override
	public double cevreHesapla() {

		return 2 * (getUzunluk() + getYukseklik());

	}

	public double getYukseklik() {
		return yukseklik;
	}

	public void setYukseklik(double yukseklik) {
		this.yukseklik = yukseklik;
	}

}
