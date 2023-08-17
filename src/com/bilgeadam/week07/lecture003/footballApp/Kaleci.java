package com.bilgeadam.week07.lecture003.footballApp;

import java.util.Random;

public class Kaleci extends Futbolcu {

	private int kurtarma;

	public Kaleci(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
		this.kurtarma = randomSayi();
	}

	public int getKurtarma() {
		return kurtarma;
	}

	public void setKurtarma(int kurtarma) {
		this.kurtarma = kurtarma;
	}

	@Override
	public String toString() {
		return "Kaleci [kurtarma=" + kurtarma + ", getAdSoyad()=" + getAdSoyad() + ", getFormaNo()=" + getFormaNo()
				+ ", getDayaniklilik()=" + getDayaniklilik() + ", getHiz()=" + getHiz() + ", getPas()=" + getPas()
				+ ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek() + ", getKararlilik()=" + getKararlilik()
				+ ", getDogalForm()=" + getDogalForm() + ", getSans()=" + getSans() + "]";
	}

	@Override
	public int randomSayi() {
		Random random = new Random();
		return random.nextInt(65, 101);
	}

	public int kurtarisSkoru() {
		Random random = new Random();
		int bonus = (int) (random.nextInt(1, 6) * (getDogalForm() * 0.025));
		return (int) (getKurtarma() * 0.2 + getKararlilik() * 0.1 + bonus);
	}

}
