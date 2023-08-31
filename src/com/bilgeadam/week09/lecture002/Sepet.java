package com.bilgeadam.week09.lecture002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sepet {
	/**
	 * 1- Urun sinifinda encapsulated bir şekilde olusturalım
	 * 
	 * 2- Sepette EUrun'lerden olusan bir Array'imiz olsun.
	 * 
	 * Urun Listemiz olsun
	 * 
	 * urunOlustur() isimli bir metodumuz olsun -> EUrun arrayiizdeki enumlarn
	 * değerleri ile urun olusturup lisemizi dolduralım
	 * 
	 * 3- Urunler ile fiyatlarını mapleyekimi urunler listesi üzerinde çalışalım
	 * 
	 * 4- urunEkle() metodumuz olsun. Sepetime bir ürün ekleyecek. ürün hali hazırda
	 * septte var ise adetini arttıracak
	 * 
	 * 5- 2 tane map,m var; urunlerMap ve sepet. Sepetimin toplam fiyatını
	 * hesaplamak istiyorum; Sepetimden ürün adını almam, bu ürün adına denk gelen
	 * fiyat değerini urunlerMap inde aramak gerekiyor. bu fiyat değerini alıp,
	 * sepetteki ürün adedi sayısı ile çarpıp toplama eklemek gerekiyor. Bunu her
	 * bir sepetteki urun için yaparsam ve toplamı her zaman güncelleyerek ilerler
	 * isem sepetimin toplam fiyatını bulabilirim
	 * 
	 * List<Double> fiyatlar -> bulunan her fiyatı fiyatlar listesine atalım
	 * 
	 */

	EUrun[] enumUrunler = EUrun.values();
	List<Urun> urunler = new ArrayList<Urun>();
	Map<String, Double> urunlerMap = new HashMap<>();
	Map<String, Integer> sepet = new HashMap<>(); // kola -> 2 tane

	Double toplam = 0.0;

	public Sepet() {
		urunOlustur2();
		mapOlustur();
	}

	public void sepetFiyati() {
		List<Double> fiyatlar = new ArrayList<Double>();
		sepet.forEach((isim, adet) -> {
			double fiyat = urunlerMap.get(isim) * adet;
			fiyatlar.add(fiyat);
		});
		toplam = 0.0;
		for (Double f : fiyatlar) {
			toplam += f;
		}
		System.out.println("Sepet toplam fiyatı : " + toplam);

	}

	public void sepetToplami2() {
		List<Double> fiyatlar = new ArrayList<Double>();
		DoubleSummaryStatistics toplam;

		for (Entry<String, Integer> urun : sepet.entrySet()) {
			fiyatlar.add(urun.getValue() * urunlerMap.get(urun.getKey()));
		}
		toplam = fiyatlar.stream().collect(Collectors.summarizingDouble(Double::doubleValue));
		System.out.println("Sepet toplam tutarı : " + toplam.getSum());
	}

	public void sepetToplami3() {
		toplam = 0.0;
		sepet.forEach((isim, adet) -> toplam += (urunlerMap.get(isim) * adet));
		System.out.println("Sepet toplam tutarı : " + toplam);
	}

	public void sepetToplami4() {
//		sepet.entrySet().stream().map(urun -> urunlerMap.get(urun.getKey()) * urun.getValue())
//				.collect(Collectors.toList()).forEach(System.out::println); // Direkt sepet fiyatını döner

//		List<Double> fiyatlar = sepet.entrySet().stream().map(urun -> urunlerMap.get(urun.getKey()) * urun.getValue())
//				.collect(Collectors.toList());
//		toplam = 0.0;

//		for (Double fiyat : fiyatlar) {
//			toplam += fiyat;
//		}
		// fiyatlari teker teker gezip, streamde toplar, collect yaptığıumda liste
		// haline döner

		List<Double> fiyatlar = sepet.entrySet().stream().map(urun -> urunlerMap.get(urun.getKey()) * urun.getValue())
				.collect(Collectors.toList());

		Double toplam2 = fiyatlar.stream().reduce((f1, f2) -> f1 + f2).get();

		Optional<Double> toplam3 = fiyatlar.stream().reduce((f1, f2) -> f1 + f2);

		toplam = sepet.entrySet().stream().mapToDouble(urun -> urunlerMap.get(urun.getKey()) * urun.getValue()).sum();
		System.out.println("Sepetin toplam tutari : " + toplam);
	}

	public void urunEkle() {
		for (EUrun eklenecekUrun : EUrun.values()) {
			System.out.println(eklenecekUrun.ordinal() + 1 + " - " + eklenecekUrun);
		}
		int secim;
		Scanner sc = new Scanner(System.in);
		System.out.print("Eklenecek Ürün : ");
		secim = sc.nextInt();
		String urun = EUrun.values()[secim - 1].name();
		if (sepet.containsKey(urun)) {
			sepet.replace(urun, sepet.get(urun) + 1);
		} else {
			sepet.put(urun, 1);
		}

	}

	public void urunEkle2() {
		String urunIsmi = Utility.stringDegerAlma("Lütfen sepete eklemek istediğiniz ürünün uzun adını giriniz: ");
		Optional<Urun> urun = urunler.stream().filter(u -> u.getIsim().equalsIgnoreCase(urunIsmi)).findFirst();
//		Urun urun = null;
//		for (Urun u : urunler) {
//			if (u.getIsim().equalsIgnoreCase(urunIsmi)) {
//				urun = u;
//				break;
//			}
//		}
//		if (urun != null) {

		if (urun.isPresent()) {
			if (sepet.containsKey(urunIsmi)) {
				sepet.put(urunIsmi, sepet.get(urunIsmi) + 1);
			} else {
				sepet.put(urunIsmi, 1);
			}
		} else {
			System.out.println("Böyle bir ürün bulunmamaktadır");
		}

	}

	public void menu() {
		int kontrol = 0;
		do {
			System.out.println("-------------------");
			System.out.println("------ Sepet ------");
			System.out.println("-------------------");
			System.out.println("1 - Urunleri Goster");
			System.out.println("2 - Urun Ekle");
			System.out.println("3 - Sepeti Goster");
			System.out.println("0 - CIKIS");
			System.out.println("-------------------");
			kontrol = Utility.intDegerAlma("Lütfen bir seçim yapınız : ");
			switch (kontrol) {
			case 1: {
				urunleriListele();
				break;
			}
			case 2: {
				urunEkle2();
				break;
			}
			case 3: {
				sepetiGoster();

				break;
			}

			case 0: {
				System.out.println("Uygulamadan çıkış yapılıyor");
				break;
			}
			default:
				System.out.println("Lütfen geçerli bir seçim yapınız");
			}

		} while (kontrol != 0);
	}

	private void urunleriListele() {
		urunlerMap.forEach((k, v) -> {
			System.out.println(k + " -> " + v + " TL");
		});

	}

	public void sepetiGoster() {
		sepet.forEach((k, v) -> System.out.println(k + " -> " + v + " adet"));
		sepetToplami4();
	}

	public void urunOlustur() {
		for (int i = 0; i < enumUrunler.length; i++) {
//			Urun urun = new Urun();
//			urun.setFiyat(enumUrunler[i].getFiyat());
//			urun.setIsim(enumUrunler[i].name());
//			urunler.add(urun);
			urunler.add(new Urun(enumUrunler[i].name(), enumUrunler[i].getFiyat()));
		}
//		for (EUrun eurun : enumUrunler) {
//			Urun urun = new Urun();
//			urun.setFiyat(eurun.getFiyat());
//			urun.setIsim(eurun.name());
//			urunler.add(urun);
//		}
		urunler.forEach(System.out::println);

	}

	public void urunOlustur2() {
		Arrays.asList(enumUrunler).stream().forEach((x) -> urunler.add(new Urun(x.name(), x.getFiyat())));

//		urunler.forEach(System.out::println);
	}

	public void mapOlustur() {
		urunlerMap = urunler.stream().collect(Collectors.toMap((x) -> x.getIsim(), k -> k.getFiyat()));
//		urunlerMap.forEach((k, v) -> {
//			System.out.println(k + " -> " + v + " TL");
//		});

		// 2. Yöntem
//		System.out.println("2. Yöntem");
//		urunler.stream().forEach((urun) -> urunlerMap.put(urun.getIsim(), urun.getFiyat()));
//		// urunlerMap.entrySet().forEach(System.out::println);
//		urunlerMap.forEach((k, v) -> System.out.println(k + " urununun fiyati " + v + " tl dir."));

	}

}
