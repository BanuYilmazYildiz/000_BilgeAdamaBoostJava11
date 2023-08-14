package com.bilgeadam.week05.lecture005.inheritance;

public class Araba extends Tasit {
	private int kapiSayisi;

	public Araba() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Araba(String marka, String color, int km) {
		super(marka, color, km);
		// TODO Auto-generated constructor stub
	}

	public void vitesDegistir() {
		System.out.println("Arabanın vitesi değiştirldi");
	}

	public Araba(String marka, String color, int km, int kapiSayisi) {
		super(marka, color, km);
		this.kapiSayisi = kapiSayisi;
	}

	@Override
	public String toString() {
		return "Araba [kapiSayisi=" + kapiSayisi + super.toString() + "]";
	}

	@Override
	public void calistir() {
		System.out.println("Araç Çalıştırıldı");
	}

	@Override
	public void durdur() {
		System.out.println("Araç Durduruldu");

	}

	@Override
	public void hizlan() {
		System.out.println("Araç Hızlanıyor");

	}

	public Araba(int kapiSayisi) {
		super();
		this.kapiSayisi = kapiSayisi;
	}

	public int getKapiSayisi() {
		return kapiSayisi;
	}

	public void setKapiSayisi(int kapiSayisi) {
		this.kapiSayisi = kapiSayisi;
	}

	public void farlariAc() {
		System.out.println("Farlar acildi");
	}

}
