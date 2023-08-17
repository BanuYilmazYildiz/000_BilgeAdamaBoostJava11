package com.bilgeadam.week07.lecture003.footballAppBenim;

import java.util.Random;

public abstract class Futbolcu {

	private String adSoayd;
	private int formaNo;
	private int dayaniklilik;
	private int hiz;
	private int pas;
	private int sut;
	private int yetenek;
	private int kararlilik;
	private int dogalForm;
	private int sans;

	public Futbolcu(String adSoayd, int formaNo) {
		super();
		this.adSoayd = adSoayd;
		this.formaNo = formaNo;
		this.dayaniklilik = rastgeleYetenekPuani();
		this.hiz = rastgeleYetenekPuani();
		this.pas = rastgeleYetenekPuani();
		this.sut = rastgeleYetenekPuani();
		this.yetenek = rastgeleYetenekPuani();
		this.kararlilik = rastgeleYetenekPuani();
		this.dogalForm = rastgeleYetenekPuani();
		this.sans = rastgeleYetenekPuani();
	}

	public int rastgeleYetenekPuani() {
		Random random = new Random();
		return random.nextInt(50, 101);
	}

	public String getAdSoayd() {
		return adSoayd;
	}

	public void setAdSoayd(String adSoayd) {
		this.adSoayd = adSoayd;
	}

	public int getFormaNo() {
		return formaNo;
	}

	public void setFormaNo(int formaNo) {
		this.formaNo = formaNo;
	}

	public int getDayaniklilik() {
		return dayaniklilik;
	}

	public void setDayaniklilik(int dayaniklilik) {
		this.dayaniklilik = dayaniklilik;
	}

	public int getHiz() {
		return hiz;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}

	public int getPas() {
		return pas;
	}

	public void setPas(int pas) {
		this.pas = pas;
	}

	public int getSut() {
		return sut;
	}

	public void setSut(int sut) {
		this.sut = sut;
	}

	public int getYetenek() {
		return yetenek;
	}

	public void setYetenek(int yetenek) {
		this.yetenek = yetenek;
	}

	public int getKararlilik() {
		return kararlilik;
	}

	public void setKararlilik(int kararlilik) {
		this.kararlilik = kararlilik;
	}

	public int getDogalForm() {
		return dogalForm;
	}

	public void setDogalForm(int dogalForm) {
		this.dogalForm = dogalForm;
	}

	public int getSans() {
		return sans;
	}

	public void setSans(int sans) {
		this.sans = sans;
	}

	@Override
	public String toString() {
		return "Futbolcu [adSoayd=" + adSoayd + ", formaNo=" + formaNo + ", dayaniklilik=" + dayaniklilik + ", hiz="
				+ hiz + ", pas=" + pas + ", sut=" + sut + ", yetenek=" + yetenek + ", kararlilik=" + kararlilik
				+ ", dogalForm=" + dogalForm + ", sans=" + sans + "]";
	}

	public boolean pasver() {
		return false;

	}

	public boolean golVurusu() {
		return false;
	}

}
