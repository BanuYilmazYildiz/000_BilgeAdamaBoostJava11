package com.bilgeadam.week06.lecture003.calisaninterface;

public class InsanKaynaklari extends Calisan implements IInsanKaynaklari {

	public InsanKaynaklari(String isim, String soyisim) {
		super(isim, soyisim);

	}

	public InsanKaynaklari(String isim, String soyisim, double maas) {
		super(isim, soyisim, maas);

	}

	@Override
	public void zamYap(Calisan calisan, double zamOrani) {
		double zamliUcret = calisan.getMaas() + (calisan.getMaas() * zamOrani / 100);

		if (calisan.getClass().getSimpleName().equals("Muhendis")) { // bu kullanım daha doğru
			zamliUcret += 250;
		}
//		if (calisan.getIsUnvani().contains("Mühendis")) {
//			zamliUcret += 250;
//		}
		calisan.setMaas(zamliUcret);
		calisan.setIsUnvani(getMaas());

	}

	@Override
	public void unvanBelirle() {
		System.out.println("Ünvan belirlendi");

	}

}
