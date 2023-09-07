package com.bilgeadam.week10.lecture003;

import java.io.Serializable;

public class Ogrenci implements Serializable {

	private String isim;
	private double ort;

	public Ogrenci(String isim) {
		super();
		this.isim = isim;
	}

	public Ogrenci(String isim, double ort) {
		super();
		this.isim = isim;
		this.ort = ort;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public double getOrt() {
		return ort;
	}

	public void setOrt(double ort) {
		this.ort = ort;
	}

	@Override
	public String toString() {
		return "Ogrenci [isim=" + isim + ", ort=" + ort + "]";
	}

}
