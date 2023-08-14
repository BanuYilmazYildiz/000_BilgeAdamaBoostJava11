package com.bilgeadam.week07.lecture001.enumornek;

public class Pizza {

	private EBoyut Boyut;
	private EHamurTipi hanurTipi;
	private ETur pizzaTuru;
	private double fiyat;

	public Pizza() {
		super();

	}

	public Pizza(EBoyut boyut, EHamurTipi hanurTipi, ETur pizzaTuru, double fiyat) {
		super();
		Boyut = boyut;
		this.hanurTipi = hanurTipi;
		this.pizzaTuru = pizzaTuru;
		this.fiyat = fiyat;
	}

	public EBoyut getBoyut() {
		return Boyut;
	}

	public void setBoyut(EBoyut boyut) {
		Boyut = boyut;
	}

	public EHamurTipi getHanurTipi() {
		return hanurTipi;
	}

	public void setHanurTipi(EHamurTipi hanurTipi) {
		this.hanurTipi = hanurTipi;
	}

	public ETur getPizzaTuru() {
		return pizzaTuru;
	}

	public void setPizzaTuru(ETur pizzaTuru) {
		this.pizzaTuru = pizzaTuru;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	@Override
	public String toString() {
		return "Pizza [Boyut=" + Boyut + ", hanurTipi=" + hanurTipi + ", pizzaTuru=" + pizzaTuru + ", fiyat=" + fiyat
				+ "]";
	}

}
