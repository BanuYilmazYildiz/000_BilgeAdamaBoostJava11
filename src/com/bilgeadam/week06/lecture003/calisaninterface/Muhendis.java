package com.bilgeadam.week06.lecture003.calisaninterface;

public class Muhendis extends Calisan implements ISahaCalismasiYapabilir {

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
			setIsUnvani("Stajyer Mühendis");
		}

	}

	@Override
	public double maasZammi(double zamOrani) {
		setMaas(super.maasZammi(zamOrani) + 250);
		setIsUnvani(getMaas());
		return getMaas();
	}

	@Override
	public void sahaCalismasiYap() {
		System.out.println("Saha çalışması yapılıyor");

	}

}
