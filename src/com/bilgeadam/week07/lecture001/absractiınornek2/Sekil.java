package com.bilgeadam.week07.lecture001.absractiınornek2;

public abstract class Sekil {

	private String renk;
	private double uzunluk;
	private final double PI = 3.14;

	public abstract double alanHesapla();

	public abstract double cevreHesapla();

	public void ciz() {
		System.out.println("çizilen şekil : " + renk + " renkli " + getClass().getSimpleName());

	}

	public Sekil(String renk, double uzunluk) {
		super();

		this.renk = renk;
		this.uzunluk = uzunluk;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public double getUzunluk() {
		return uzunluk;
	}

	public void setUzunluk(double uzunluk) {
		this.uzunluk = uzunluk;
	}

	public double getPI() {
		return PI;
	}

	@Override
	public String toString() {
		return "Sekil [renk=" + renk + ", uzunluk=" + uzunluk + "]";
	}

}
