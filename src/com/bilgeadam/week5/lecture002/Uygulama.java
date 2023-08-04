package com.bilgeadam.week5.lecture002;

import java.util.Scanner;

public class Uygulama {
	Scanner sc = new Scanner(System.in);
	OgrenciOzelListe ogrenciOzelListe = new OgrenciOzelListe();
	MaasOzelListe maasOzelListe = new MaasOzelListe();
	boolean[][] hobiListesi;
	String[][] hobiler;

	public void uygulama() {
		int secim;
		do {
			menu();
			secim = secimYap();
			switch (secim) {
			case 1:
				ogrenciTanimla();
				break;
			case 2:
				hobileriGir();
				break;
			case 3:
				maasBeklentileriniGir();
				break;
			case 4:
				sinifListesi();
				break;
			case 0:
				System.err.println("Cikis yapildi");
				break;
			default:
			}
		} while (secim != 0);
	}

	private void sinifListesi() {
		System.out.println("No\tAd\t\tHobiler\t\t\t\t\t\tMaaş Beklentisi");
		for (int i = 0; i < ogrenciOzelListe.boyut; i++) {
			System.out.print((i + 1) + "\t" + ogrenciOzelListe.ogrenciListesi[i] + "\t\t");
			hobileriYazdır(i);
			System.out.println("\t\t\t\t" + maasOzelListe.maasListesi[i]);
		}

	}

	private void hobileriTanımla() {
		hobiler = new String[hobiListesi.length][4];
		for (int i = 0; i < hobiler.length; i++) {
			for (int j = 0; j < hobiler[i].length; j++) {
				hobiler[i][j] = "";
			}
		}

		for (int i = 0; i < hobiListesi.length; i++) {
			for (int j = 0; j < hobiListesi[i].length; j++) {
				if (hobiListesi[i][j] == true) {
					if (j == 0) {
						hobiler[i][j] = "Yurumek";
					}
					if (j == 1) {
						hobiler[i][j] = "Kitap okumak";
					}
					if (j == 2) {
						hobiler[i][j] = "Spor yapmak";
					}
					if (j == 3) {
						hobiler[i][j] = "Kod yazmak";
					}
				}
			}
		}
	}

	private void hobileriYazdır(int index) {
		hobileriTanımla();
		for (int j = 0; j < hobiler[index].length; j++) {
			System.out.print(hobiler[index][j]);
			if (j != hobiler[index].length - 1 && !hobiler[index][j].equals(""))
				System.out.print(", ");
		}
	}

	private void maasBeklentileriniGir() {
		double maas;
		for (int i = 0; i < ogrenciOzelListe.boyut; i++) {
			System.out.print((i + 1) + ". Ogrenci " + ogrenciOzelListe.ogrenciListesi[i] + " maas beklentisi :");
			maas = sc.nextDouble();
			maasOzelListe.add(maas);
		}
		sc.nextLine();
	}

	private void hobileriGir() {
		int ogrenciIndex = ogrenciBul();
		if (ogrenciIndex != -1) {
			String secim;
			System.out.print("Yürümekten hoşlanır mısın[E/H]? ");
			secim = sc.nextLine();
			if (secim.equalsIgnoreCase("E")) {
				hobiListesi[ogrenciIndex][0] = true;
			}
			System.out.print("Kitap Okumaktan hoşlanır mısın[E/H]? ");
			secim = sc.nextLine();
			if (secim.equalsIgnoreCase("E")) {
				hobiListesi[ogrenciIndex][1] = true;
			}
			System.out.print("Spor rutinlerin var mı[E/H]? ");
			secim = sc.nextLine();
			if (secim.equalsIgnoreCase("E")) {
				hobiListesi[ogrenciIndex][2] = true;
			}
			System.out.print("Kod yazmaktan hoşlanır mısın[E/H]? ");
			secim = sc.nextLine();
			if (secim.equalsIgnoreCase("E")) {
				hobiListesi[ogrenciIndex][3] = true;
			}
		} else {
			System.err.println("Böyle bir öğrenci bulunmamaktadır..");
		}

	}

	private int ogrenciBul() {
		ogrenciOzelListe.list();
		System.out.print("Ogrenci Seciniz....: ");
		String ogrenci = sc.nextLine();
		String[] ogrenciler = ogrenciOzelListe.ogrenciListesi;
		for (int i = 0; i < ogrenciler.length; i++) {
			if (ogrenciler[i].equalsIgnoreCase(ogrenci)) {
				return i;
			}
		}
		return -1;
	}

	private void ogrenciTanimla() {
		System.out.print("Kaç öğrenci tanımlayacaksınız....: ");
		int ogrenciSayisi = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < ogrenciSayisi; i++) {
			System.out.print((i + 1) + ". Ogrencinin adi.....: ");
			String ogrenci = sc.nextLine();
			ogrenciOzelListe.add(ogrenci);
		}
		hobiListesi = new boolean[ogrenciSayisi][4];
	}

	public void menu() {
		System.out.println("\n****************************");
		System.out.println("** OGRENCİ BİLGİ SİSTEMİ ***");
		System.out.println("****************************");
		System.out.println();
		System.out.println("1- Sinif arkadasi tanimla");
		System.out.println("2- Hobilerini gir");
		System.out.println("3- Maas beklentilerini gir");
		System.out.println("4- Sinif Listesi");
		System.out.println("0- C I K I S");
		System.out.println();
	}

	public int secimYap() {
		System.out.print("Seciminiz....: ");
		int secim = sc.nextInt();
		sc.nextLine();
		System.out.println();
		return secim;
	}

}
