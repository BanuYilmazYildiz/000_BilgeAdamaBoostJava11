package com.bilgeadam.week6.lecture003.calisaninterface;

public class Calisan implements ICalisan {
	private String isim;
	private String soyisim;
	private String isUnvani;
	private double maas;

	public Calisan(String isim, String soyisim) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
	}

	public Calisan(String isim, String soyisim, double maas) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.maas = maas;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public void setIsUnvani(String isUnvani) {

		this.isUnvani = isUnvani;

	}

	public void setIsUnvani(double maas) {

		this.isUnvani = isUnvani;
	}

	public String getIsUnvani() {
		return this.isUnvani = isUnvani;
	}

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}

	public double maasZammi(double zamOrani) {
		this.maas += (this.maas * zamOrani / 100);
		return this.maas;
	}

	@Override
	public void maasAl() {
		// TODO Auto-generated method stub

	}

	@Override
	public void izinAl() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fazlaMesaiYap() {
		// TODO Auto-generated method stub

	}

}
