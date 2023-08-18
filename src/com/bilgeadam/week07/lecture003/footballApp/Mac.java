package com.bilgeadam.week07.lecture003.footballApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mac {

	List<Takim> takimlar;
	int[] macSkoru;
	long sure = 90000; // maç 90.000 milisaniye surese bu 90saniye yapar

	public Mac() {
		this.takimlar = new ArrayList<Takim>();
		this.macSkoru = new int[2];
		this.takimlar.add(new Takim("Ev Sahibi"));
		this.takimlar.add(new Takim("Deplasman"));
	}

	public Mac(List<Takim> takimlar) {
		this.takimlar = takimlar;
		this.macSkoru = new int[2];
		this.sure = setSure(90000);
	}

	public List<Takim> getTakimlar() {
		return takimlar;
	}

	public void setTakimlar(List<Takim> takimlar) {
		this.takimlar = takimlar;
	}

	public int[] getMacSkoru() {
		return macSkoru;
	}

	public void setMacSkoru(int[] macSkoru) {
		this.macSkoru = macSkoru;
	}

	public long getSure() {
		return sure;
	}

	public long setSure(long sure) {
		return this.sure + System.currentTimeMillis();
	}

	public void mac() throws InterruptedException {
		System.out.println("Yazı tura atılıyor ve maça....");
		Thread.sleep(1500);
		Takim takim = yaziTura();
		System.out.println(takim.getAd() + " maça başlıyor");

		while (sure > System.currentTimeMillis()) {
			oyna(takim);
			System.out.println();
			takim = takimDegistir(takim);
			System.out.println((sure - System.currentTimeMillis()) / 1000 + " saniye kaldı");
			System.out.println();

		}
		System.out.println("-----------------");
		System.out.println("Maç Bitti");
		skorGoster();
	}

	public void oyna(Takim takim) throws InterruptedException {
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
				Thread.sleep(1500);
			} else {
				System.out.println(takim.getAd() + " adli takımın "
						+ futbolcular.get(pasVerecekOyuncuIndex).getFormaNo() + " nolu oyuncunun pası başarısız oldu");
				takim = takimDegistir(takim);
				System.out.println("Top diğer takıma geçti");
				System.out.println();
				pasVerecekOyuncuIndex = pasKontol(12);
				i = -1;
				Thread.sleep(1500);
			}
		}
		golVurus(takim.getFutbolcular().get(pasVerecekOyuncuIndex), takim);

	}

	public Takim takimDegistir(Takim takim) throws InterruptedException {
		if (takimlar.get(0).equals(takim)) {

//			System.out.println("Topa sahip olması gereken takım : " + takimlar.get(1).getAd());
			return takimlar.get(1);
		} else {

//			System.out.println("Topa sahip olması gereken takım : " + takimlar.get(0).getAd());
			return takimlar.get(0);
		}
	}

//	public Takim takimDegistir2(Takim takim) {
//		int takim
//	}

	public int pasKontol(int index) {
		Random random = new Random();
		int oyuncuIndex = random.nextInt(10);

		while (index == oyuncuIndex) {
			oyuncuIndex = random.nextInt(10);
		}

		return oyuncuIndex;
	}

	public void golVurus(AktifFutbolcu futbolcu, Takim takim) throws InterruptedException {
		Kaleci kaleci = takimDegistir(takim).getKaleci();
		System.out.println("ŞUUUUUUUUUT");
		System.out.println("Kaleci topa uzanıyor...");
		Thread.sleep(1500);
		if (futbolcu.sutCek(kaleci.kurtarisSkoru())) {
			System.out.println("VE GOOOOOOOOOOOOOLLLL!!!");
			System.out.println(
					takim.getAd() + " adlı takımdan " + futbolcu.getFormaNo() + " nolu futbolcu golu attı......");
			int takimIndex = takimlar.indexOf(takim);
			macSkoru[takimIndex] += 1;
			System.out.println();
			skorGoster();
		} else {
			System.out.println(
					takim.getAd() + " adlı takımdan " + futbolcu.getFormaNo() + " nolu futbolcu golu kaçırdı......");

		}

	}

	public void skorGoster() {
		System.out.println("** Maç Skoru **");
		System.out.println("==========================");
		System.out.println(
				takimlar.get(0).getAd() + " : " + macSkoru[0] + " - " + macSkoru[1] + " : " + takimlar.get(1).getAd());
		System.out.println("==========================");
	}

	public Takim yaziTura() {
		Random random = new Random();
		int yaziTura = random.nextInt(2);
		return takimlar.get(yaziTura);

	}

}
