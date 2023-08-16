package com.bilgeadam.week07.lecture003.footballApp;

import java.util.Random;

/**
 * • -PozisyonAlma • -Kafa • -Sıcrama
 * 
 * Defans Sınıfı için oluşturulacak yetenekler 60-90 Arasında
 */
public class Defans extends Futbolcu {

	private int pozisyonAlma;
	private int kafa;
	private int sicrama;

	public Defans(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
		this.pozisyonAlma = randomSayi();
		this.kafa = randomSayi();
		this.sicrama = randomSayi();
	}

	public int getPozisyonAlma() {
		return pozisyonAlma;
	}

	public void setPozisyonAlma(int pozisyonAlma) {
		this.pozisyonAlma = pozisyonAlma;
	}

	public int getKafa() {
		return kafa;
	}

	public void setKafa(int kafa) {
		this.kafa = kafa;
	}

	public int getSicrama() {
		return sicrama;
	}

	public void setSicrama(int sicrama) {
		this.sicrama = sicrama;
	}

	@Override
	public String toString() {
		return "Defans [pozisyonAlma=" + pozisyonAlma + ", kafa=" + kafa + ", sicrama=" + sicrama + ", getAdSoyad()="
				+ getAdSoyad() + ", getFormaNo()=" + getFormaNo() + ", getDayaniklilik()=" + getDayaniklilik()
				+ ", getHiz()=" + getHiz() + ", getPas()=" + getPas() + ", getSut()=" + getSut() + ", getYetenek()="
				+ getYetenek() + ", getKararlilik()=" + getKararlilik() + ", getDogalForm()=" + getDogalForm()
				+ ", getSans()=" + getSans() + "]";
	}

	@Override
	public int randomSayi() {
		Random random = new Random();
		return random.nextInt(60, 91);
	}

}
