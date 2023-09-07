package com.bilgeadam.week10.kosuApp;

import java.util.Random;

/**
 * Koşucu'nun isim, mesafe, sure, baslangicZamani fieldları olacak.
 * 
 * 10 adet koşucu aynı anda yarışa başlayacaklar. Yarış başlangıç zamanı olacak.
 * Her bir koşucunun mesafesi 100 olduğunda yarışı bitirmiş olacak. Yarışı kaç
 * saniyede koştuğu çıktısı verilecek.
 * 
 * Bütün koşucular yarışı bitirdiğinde sıralama ve süreler yazdırılacak.
 */
public class Kosucu implements Runnable {

	private String isim;
	private int mesafe;
	private double sure;
	private long baslangicZamani;

	public Kosucu(String isim) {
		super();
		this.isim = isim;
		this.mesafe = 0;
		this.sure = 0;

	}

	@Override
	public void run() {
		yarisBaslat(System.currentTimeMillis());
		Random random = new Random();
		while (mesafe < 100) {
			mesafe += 10;
			try {
				Thread.sleep(random.nextLong(100, 401));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		long bitisZamani = System.currentTimeMillis();
		sure = (bitisZamani - baslangicZamani) / 1000.0;

	}

	public void yarisBaslat(Long baslangicZamani) {
		this.baslangicZamani = baslangicZamani;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getMesafe() {
		return mesafe;
	}

	public void setMesafe(int mesafe) {
		this.mesafe = mesafe;
	}

	public double getSure() {
		return sure;
	}

	public void setSure(double sure) {
		this.sure = sure;
	}

	public long getBaslangicZamani() {
		return baslangicZamani;
	}

	public void setBaslangicZamani(long baslangicZamani) {
		this.baslangicZamani = baslangicZamani;
	}

}
