package com.bilgeadam.week08.lecture003;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 * 
 * -bu arrayden bir map olusturan metodu yazalim key degerleri plaka degerleri
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
 * Random bir plaka uretecegiz (utility sinifinda yapalim) ve kullaniciya soru soracagiz bu plaka hangi ile
 * aittir? kullanicidan gelen degere gore islem yapacagiz dogruysa bildiniz,
 * yanlissa tekrar deneyin ciktisini verip basa donecegiz (toplamda 3 tahmin
 * hakkimiz bulunmaktadir.) basarili tahminde bulundugumuz zaman ve tahmin
 * hakkimiz kalmadigi zaman ana menuye donsun
 * 
 * 
 * 2-Eski Tahminlerim=> 1den fazla oyun oynayabilirim her oyunun tahminlerini
 * bir yerde tutacagım sonra burayı cagirdigim zaman her oyunun tahminleri ayri
 * ayri yazilsin
 * 
 * 3- cikis
 * 
 * 
 * 
 */

public class PlakaTahmin {
	String[] iller = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
			"Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
			"Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
			"Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
			"Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
			"Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
			"Kilis", "Osmaniye", "Düzce" };

	Map<Integer, String> plakalar = new LinkedHashMap<Integer, String>();
	Map<Integer, List<String>> eskiTahminler = new LinkedHashMap<Integer, List<String>>();

	int oyunSayisi = 1;

	public void plakaTahminOyun() {
		mapOlustur();

		int secim = 0;

		do {
			System.out.println();
			menu();

			secim = Utility.intDegerAlma("Lütfen seçim yapınız : ");
			switch (secim) {

			case 1: {
				System.out.println();
				System.out.println(oyunSayisi + ". Oyun;");
				oyun();

			}
				break;
			case 2: {
				System.out.println();
				tahminleriYazdir();
			}
				break;
			case 3: {
				System.out.println("Çıkış Yapıldı");

			}
				break;
			default:
				System.out.println("Yanlış seçim yaptınız.");
				System.out.println();

			}

		} while (secim != 3);
	}

	private void oyun() {
		int tahmin = 3;
		List<String> tahminListesi = new LinkedList<String>();
		int plaka = Utility.randomSayi();
		for (int i = 0; i < 3; i++) {
			String tahminEt = Utility.stringDegerAlma(plaka + " numaralı plaka hangi ilimize aittir? ");
			tahminListesi.add(tahminEt);
			if (tahminEt.equalsIgnoreCase(plakalar.get(plaka))) {
				System.out.println("Bildiniz");
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

		eskiTahminler.put(oyunSayisi, tahminListesi);

		oyunSayisi += 1;

	}

	private void tahminleriYazdir() {
		eskiTahminler.forEach((x, y) -> System.out.println(x + ". oyun tahminleri -> " + y));
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

	public void mapOlustur() {
		int p = 1;
		for (int i = 0; i < iller.length; i++) {
			plakalar.put(p, iller[i]);
			p++;
		}
	}

}
