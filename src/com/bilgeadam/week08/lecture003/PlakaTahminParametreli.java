package com.bilgeadam.week08.lecture003;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PlakaTahminParametreli {
	/*
	 * bu arrayden bir map olusturan metodu yazalim key degerleri plaka degerleri
	 * olsun value sehir olsun. 1,2,3
	 * 
	 * oyun sayisi hakkımız olsun () --> bir oyunda 3 kere tahminde bulunabiliriz
	 * 
	 * menumuz olacak
	 * 
	 * Sehir tahmin oyununa hosgeldiniz Her oyun icin 3 tahmin hakkiniz
	 * bulunmaktadir.
	 * 
	 * 1-oyuna basla
	 * 
	 * 1) oyun (kacıncı oyundaysak3 tahmin hakkimiz var(herdefasinda azalacak)
	 * 
	 * Random bir plaka uretecegiz (utility sinifinda yapalim) ve kullaniciya soru
	 * soracagiz bu plaka hangi ile aittir? kullanicidan gelen degere gore islem
	 * yapacagiz dogruysa bildiniz, yanlissa tekrar deneyin ciktisini verip basa
	 * donecegiz (toplamda 3 tahmin hakkimiz bulunmaktadir.) basarili tahminde
	 * bulundugumuz zaman ve tahmin hakkimiz kalmadigi zaman ana menuye donsun
	 * 
	 * 
	 * 2-Eski Tahminlerim=> 1den fazla oyun oynayabilirim her oyunun tahminlerini
	 * bir yerde tutacagım sonra burayı cagirdigim zaman her oyunun tahminleri ayri
	 * ayri yazilsin
	 * 
	 * 3- cikis
	 * 
	 */
	String[] iller = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
			"Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
			"Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
			"Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
			"Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
			"Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
			"Kilis", "Osmaniye", "Düzce" };

	int oyunSayisi = 1;
	Map<Integer, List<String>> eskiTahminMap = new TreeMap<Integer, List<String>>();
	Map<Integer, String> sehirler = mapOlustur(iller);

	public void tahminOyunu() {

		int secim = 0;
		do {

			menu();
			secim = Utility.intDegerAlma("Lütfen bir seçim yapınız = ");
			switch (secim) {
			case 1: {
				oyun();
			}
				break;
			case 2: {
				mapYazdir();
			}
				break;
			case 3: {
				System.out.println("Çıkış yapıldı.");
			}
				break;
			default:
				System.out.println("Lütfen geçerli bir seçim yapınız");
			}
			break;
		} while (secim != 3);

	}

	private void mapYazdir() {
		eskiTahminMap.forEach((x, y) -> System.out.println(x + ". oyun tahminleri --> " + y));
	}

	private void oyun() {
		System.out.println(oyunSayisi + ". Oyun;");
		int plaka = Utility.randomSayi();
		int tahmin = 3;
		List<String> eskiTahminListe = new LinkedList<String>();
		for (int i = 0; i < 3; i++) {
			String tahminEt = Utility.stringDegerAlma(plaka + " plaka hangi ilimize aittir -> ");
			eskiTahminListe.add(tahminEt);
			if (sehirler.get(plaka).equalsIgnoreCase(tahminEt)) {
				System.out.println("Tebrikler doğru bildiniz");
				break;
			} else {
				System.out.println("Yanlis bildiniz.");
				tahmin--;
				if (tahmin > 0)
					System.out.println((tahmin) + " tahmin hakkınız kaldı;");
				else {
					System.out.println("Tahmin hakkınız kalmadı");
					System.out.println();
				}
			}
		}
		eskiTahminMap.put(oyunSayisi, eskiTahminListe);
		oyunSayisi++;
	}

	public void menu() {
		System.out.println("********************************");
		System.out.println("***** Plaka Tahmin Oyunu *******");
		System.out.println("********************************");
		System.out.println();
		System.out.println("Her oyun için 3 hakkınız bulunmaktadır.");
		System.out.println();
		System.out.println("1 -> Oyuna Başla");
		System.out.println("2 -> Eski Tahminlerim");
		System.out.println("3 -> Ç I K I Ş");
	}

	public Map<Integer, String> mapOlustur(String[] iller) {
		Map<Integer, String> sehirler = new TreeMap<Integer, String>();
		int plaka = 1;
		for (int i = 0; i < iller.length; i++) {
			sehirler.put(plaka, iller[i]);
			plaka++;
		}
		return sehirler;
	}

}
