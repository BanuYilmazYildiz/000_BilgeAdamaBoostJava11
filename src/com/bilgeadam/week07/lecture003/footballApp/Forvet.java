package com.bilgeadam.week07.lecture003.footballApp;

import java.util.Random;

/**
 * Bitiricilik • İlkDokunus • Kafa • Özel Yetenek
 */

public class Forvet extends AktifFutbolcu {

	private int bitiricilik;
	private int ilkDokunus;
	private int kafa;
	private int ozelYetenek;

	public Forvet(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
		this.bitiricilik = randomSayi();
		this.ilkDokunus = randomSayi();
		this.kafa = randomSayi();
		this.ozelYetenek = randomSayi();
	}

	public int getBitiricilik() {
		return bitiricilik;
	}

	public void setBitiricilik(int bitiricilik) {
		this.bitiricilik = bitiricilik;
	}

	public int getIlkDokunus() {
		return ilkDokunus;
	}

	public void setIlkDokunus(int ilkDokunus) {
		this.ilkDokunus = ilkDokunus;
	}

	public int getKafa() {
		return kafa;
	}

	public void setKafa(int kafa) {
		this.kafa = kafa;
	}

	public int getOzelYetenek() {
		return ozelYetenek;
	}

	public void setOzelYetenek(int ozelYetenek) {
		this.ozelYetenek = ozelYetenek;
	}

	@Override
	public String toString() {
		return "Forvet [bitiricilik=" + bitiricilik + ", ilkDokunus=" + ilkDokunus + ", kafa=" + kafa + ", ozelYetenek="
				+ ozelYetenek + ", getAdSoyad()=" + getAdSoyad() + ", getFormaNo()=" + getFormaNo()
				+ ", getDayaniklilik()=" + getDayaniklilik() + ", getHiz()=" + getHiz() + ", getPas()=" + getPas()
				+ ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek() + ", getKararlilik()=" + getKararlilik()
				+ ", getDogalForm()=" + getDogalForm() + ", getSans()=" + getSans() + "]";
	}

	@Override
	public int randomSayi() {
		Random random = new Random();
		return random.nextInt(70, 101);
	}

	@Override
	public int pasSkor() {
		Random random = new Random();
		int bonus = random.nextInt(1, 7);
		return (int) (getPas() * 0.2 + getYetenek() * 0.2 + getOzelYetenek() * 0.2 + getDayaniklilik() * 0.1
				+ getDogalForm() * 0.1 + getSans() * 0.1 + bonus);
	}

	@Override
	public int golSkor(int kurtaris) {
		Random random = new Random();
		int bonus = (int) (random.nextInt(1, 6) * getDogalForm() * 0.075);
		return (int) (getYetenek() * 0.2 + getOzelYetenek() * 0.2 + getSut() * 0.1 + getIlkDokunus() * 0.1
				+ getKararlilik() * 0.1 + getSans() * 0.1 + getKafa() * 0.1 + getBitiricilik() * 0.2
				+ getDogalForm() * 0.1 + bonus - kurtaris);
	}

}
