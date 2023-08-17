package com.bilgeadam.week07.lecture003.footballAppBenim;

import java.util.Random;

public class Defans extends Futbolcu {

	private int pozisyonAlma;
	private int kafa;
	private int sicrama;

	public Defans(String adSoayd, int formaNo) {
		super(adSoayd, formaNo);
		this.pozisyonAlma = rastgeleYetenekPuani();
		this.kafa = rastgeleYetenekPuani();
		this.sicrama = rastgeleYetenekPuani();
	}

	@Override
	public int rastgeleYetenekPuani() {
		Random random = new Random();
		return random.nextInt(60, 91);
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
		return "Defans [pozisyonAlma=" + pozisyonAlma + ", kafa=" + kafa + ", sicrama=" + sicrama + ", getAdSoayd()="
				+ getAdSoayd() + ", getFormaNo()=" + getFormaNo() + ", getDayaniklilik()=" + getDayaniklilik()
				+ ", getHiz()=" + getHiz() + ", getPas()=" + getPas() + ", getSut()=" + getSut() + ", getYetenek()="
				+ getYetenek() + ", getKararlilik()=" + getKararlilik() + ", getDogalForm()=" + getDogalForm()
				+ ", getSans()=" + getSans() + "]";
	}

	@Override
	public boolean pasver() {
		Random random = new Random();
		int bonus = random.nextInt(0, 5);
		double pasSkoru = getPas() * 0.2 + getYetenek() * 0.2 + getDayaniklilik() * 0.1 + getDogalForm() * 0.1
				+ getSans() * 0.1 + bonus;
		if (pasSkoru > 65) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean golVurusu() {
		Random random = new Random();
		int bonus = random.nextInt(2, 6);
		double kurtaris = 0;
		double golSkoru = getYetenek() * 0.3 + getSut() * 0.2 + getKararlilik() * 0.1 + getSans() * 0.1
				+ getSicrama() * 0.1 + getDogalForm() * 0.1 + bonus - kurtaris;
		if (golSkoru > 68) {
			return true;
		} else {
			return false;
		}
	}

}
