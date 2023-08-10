package com.bilgeadam.week6.lecture003.kalitim;

public class Muhendis extends Calisan {

	public Muhendis(String isim, String soyisim) {
		super(isim, soyisim);
		setIsUnvani("Muhendis");

	}

	public Muhendis(String isim, String soyisim, double maas) {
		super(isim, soyisim, maas);
		setIsUnvani(maas);
	}

	@Override
	public void setIsUnvani(double maas) {
		if (maas >= 17_000) {
			setIsUnvani("Uzman Mühendis");
		} else if (maas >= 12_000) {
			setIsUnvani("Kıdemli Mühendis");
		} else if (maas >= 10_000) {
			setIsUnvani("Mühendis");
		} else {
			setIsUnvani("Stajyer");
		}

	}

	@Override
	public double maasZammi(double zamOrani) {
		setMaas(super.maasZammi(zamOrani) + 250);
		setIsUnvani(getMaas());
		return getMaas();
	}

}
