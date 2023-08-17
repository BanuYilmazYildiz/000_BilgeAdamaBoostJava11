package com.bilgeadam.week07.lecture003.footballApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mac {

	List<Takim> takimlar;
	int[] macSkoru;

	public Mac() {
		this.takimlar = new ArrayList<Takim>();
		this.macSkoru = new int[2];
		this.takimlar.add(new Takim("Ev Sahibi"));
		this.takimlar.add(new Takim("Deplasman"));
	}

	public void oyna(Takim takim) {
		int pasVerecekOyuncuIndex = pasKontol(12);

		for (int i = 0; i < 3; i++) {
			List<AktifFutbolcu> futbolcular = takim.getFutbolcular();
			if (futbolcular.get(pasVerecekOyuncuIndex).pasVer()) {
				int pasAlacakOyuncuIndex = pasKontol(pasVerecekOyuncuIndex);

				System.out.println(takim.getAd() + " adlı takımdan "
						+ futbolcular.get(pasVerecekOyuncuIndex).getFormaNo() + " nolu oyuncu "
						+ futbolcular.get(pasAlacakOyuncuIndex).getFormaNo() + " nolu oyuncuya pas attı.");
				System.out.println();
				pasVerecekOyuncuIndex = pasAlacakOyuncuIndex;
			} else {
				System.out.println(takim.getAd() + " adli takımın "
						+ futbolcular.get(pasVerecekOyuncuIndex).getFormaNo() + " nolu oyuncunun pası başarısız oldu");
				takim = takimDegistir(takim);
				System.out.println("Top diğer takıma geçti");
				System.out.println();
				pasVerecekOyuncuIndex = pasKontol(12);
				i = -1;
			}
		}
		System.out.println("Gol vuruşu yapılıyor");

	}

	public Takim takimDegistir(Takim takim) {
		if (takimlar.get(0).equals(takim)) {
			return takimlar.get(1);
		} else {
			return takimlar.get(0);
		}
	}

	public int pasKontol(int index) {
		Random random = new Random();
		int oyuncuIndex = random.nextInt(10);

		while (index == oyuncuIndex) {
			oyuncuIndex = random.nextInt(10);
		}

		return oyuncuIndex;
	}

}
