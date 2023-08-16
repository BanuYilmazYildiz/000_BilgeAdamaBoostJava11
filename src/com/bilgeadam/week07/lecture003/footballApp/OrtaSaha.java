package com.bilgeadam.week07.lecture003.footballApp;

import java.util.Random;

/**
 * • UzunTop • ilkDokunus • TopSurme • Uretkenlik • ÖzelYetenek
 * 
 * OrtaSaha Sınıfı için oluşturulacak yetenekler 60-100 Arasında
 */

public class OrtaSaha extends Futbolcu {

	private int uzunTop;
	private int ilkDokunus;
	private int topSurme;
	private int uretkenlik;
	private int ozelYetenek;

	public OrtaSaha(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
		this.uzunTop = randomSayi();
		this.ilkDokunus = randomSayi();
		this.topSurme = randomSayi();
		this.uretkenlik = randomSayi();
		this.ozelYetenek = randomSayi();
	}

	public int getUzunTop() {
		return uzunTop;
	}

	public void setUzunTop(int uzunTop) {
		this.uzunTop = uzunTop;
	}

	public int getIlkDokunus() {
		return ilkDokunus;
	}

	public void setIlkDokunus(int ilkDokunus) {
		this.ilkDokunus = ilkDokunus;
	}

	public int getTopSurme() {
		return topSurme;
	}

	public void setTopSurme(int topSurme) {
		this.topSurme = topSurme;
	}

	public int getUretkenlik() {
		return uretkenlik;
	}

	public void setUretkenlik(int uretkenlik) {
		this.uretkenlik = uretkenlik;
	}

	public int getZelYetenek() {
		return ozelYetenek;
	}

	public void setZelYetenek(int zelYetenek) {
		this.ozelYetenek = zelYetenek;
	}

	@Override
	public String toString() {
		return "OrtaSaha [uzunTop=" + uzunTop + ", ilkDokunus=" + ilkDokunus + ", topSurme=" + topSurme
				+ ", uretkenlik=" + uretkenlik + ", zelYetenek=" + ozelYetenek + ", getAdSoyad()=" + getAdSoyad()
				+ ", getFormaNo()=" + getFormaNo() + ", getDayaniklilik()=" + getDayaniklilik() + ", getHiz()="
				+ getHiz() + ", getPas()=" + getPas() + ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek()
				+ ", getKararlilik()=" + getKararlilik() + ", getDogalForm()=" + getDogalForm() + ", getSans()="
				+ getSans() + "]";
	}

	@Override
	public int randomSayi() {
		Random random = new Random();
		return random.nextInt(60, 101);
	}

}
