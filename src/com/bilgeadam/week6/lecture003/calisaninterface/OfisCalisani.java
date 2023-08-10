package com.bilgeadam.week6.lecture003.calisaninterface;

public class OfisCalisani extends Calisan {

	public OfisCalisani(String isim, String soyisim) {
		super(isim, soyisim);
		setMaas(8_000);

	}

	public OfisCalisani(String isim, String soyisim, int maas) {
		super(isim, soyisim, maas);
		setIsUnvani(maas);

	}

	@Override
	public void setIsUnvani(double maas) {
		if (maas >= 12_000) {
			setIsUnvani("Kıdemli Çalışan");
		} else if (maas >= 8_000) {
			setIsUnvani("Çalışan");
		} else {
			setIsUnvani("Stajyer");
		}
	}

	@Override
	public double maasZammi(double zamOrani) {
		setMaas(super.maasZammi(zamOrani));
		setIsUnvani(getMaas());
		return getMaas();
	}

}
