package com.bilgeadam.week07.lecture003.footballApp;

import java.util.Random;

/**
 * • UzunTop • ilkDokunus • TopSurme • Uretkenlik • ÖzelYetenek
 * 
 * OrtaSaha Sınıfı için oluşturulacak yetenekler 60-100 Arasında
 */

public class OrtaSaha extends AktifFutbolcu {

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

	public int getOzelYetenek() {
		return ozelYetenek;
	}

	public void setOzelYetenek(int zelYetenek) {
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

	@Override
	public int pasSkor() {
		Random random = new Random();
		int bonus = random.nextInt(1, 9);
		return (int) (getPas() * 0.2 + getYetenek() * 0.2 + getOzelYetenek() * 0.2 + getDayaniklilik() * 0.1
				+ getDogalForm() * 0.1 + getSans() * 0.1 + bonus);
	}

	@Override
	public int golSkor(int kurtaris) {
		Random random = new Random();
		int bonus = (int) (random.nextInt(1, 7) * getDogalForm() * 0.075);
		return (int) (getYetenek() * 0.2 + getOzelYetenek() * 0.2 + getSut() * 0.2 + getIlkDokunus() * 0.1
				+ getKararlilik() * 0.1 + getSans() * 0.1 + getDogalForm() * 0.1 + bonus - kurtaris);
	}

}
