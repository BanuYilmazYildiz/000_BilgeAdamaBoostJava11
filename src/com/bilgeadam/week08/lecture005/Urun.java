package com.bilgeadam.week08.lecture005;

public class Urun {
	/**
	 * Urun sinifi-> isim,fiyat ve int son kullnama tarihi(yıl)
	 * 
	 * UrunManager isimli sınıf oluşturalım. Bu sınıfta urun yarat isimli bir metot
	 * olsun, bu metot üzerinden test sınıfında bir urun olusturtalım
	 */

	private String isim;
	private double fiyat;
	private int sonKullanmaTarihi;

	public Urun(String isim, double fiyat, int sonKullanmaTarihi) {
		super();
		this.isim = isim;
		this.fiyat = fiyat;
		this.sonKullanmaTarihi = sonKullanmaTarihi;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public int getSonKullanmaTarihi() {
		return sonKullanmaTarihi;
	}

	public void setSonKullanmaTarihi(int sonKullanmaTarihi) {
		this.sonKullanmaTarihi = sonKullanmaTarihi;
	}

	@Override
	public String toString() {
		return "Urun [isim=" + isim + ", fiyat=" + fiyat + ", sonKullanmaTarihi=" + sonKullanmaTarihi + "]";
	}

}
