package com.bilgeadam.week07.lecture003.footballAppBenim;

import java.util.ArrayList;
import java.util.List;

public class Takim implements ITakim {

	private String ad;
	List<Futbolcu> futbolcular;
	Kaleci kaleci;

	public Takim(String ad) {

		super();
		this.ad = ad;
		this.futbolcular = new ArrayList<Futbolcu>();
		this.kaleci = new Kaleci("kaleci", 1);
		defansOlustur();
		ortaSahaOlustur();
		forvetOlustur();
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public List<Futbolcu> getFutbolcular() {
		return futbolcular;
	}

	public void setFutbolcular(List<Futbolcu> futbolcular) {
		this.futbolcular = futbolcular;
	}

	public Kaleci getKaleci() {
		return kaleci;
	}

	public void setKaleci(Kaleci kaleci) {
		this.kaleci = kaleci;
	}

	@Override
	public String toString() {
		return "Takim [ad=" + ad + ", futbolcular=" + futbolcular + ", kaleci=" + kaleci + "]";
	}

	@Override
	public void defansOlustur() {
		for (int i = 1; i <= 4; i++) {
			Defans defans = new Defans("defans" + i, (i + 1));
			futbolcular.add(defans);
		}

	}

	@Override
	public void ortaSahaOlustur() {
		for (int i = 1; i <= 4; i++) {
			OrtaSaha ortasaha = new OrtaSaha("ortasaha" + i, (i + 5));
			futbolcular.add(ortasaha);
		}

	}

	@Override
	public void forvetOlustur() {
		for (int i = 1; i <= 2; i++) {
			Forvet forvet = new Forvet("ortasaha" + i, (i + 9));
			futbolcular.add(forvet);
		}

	}

}
