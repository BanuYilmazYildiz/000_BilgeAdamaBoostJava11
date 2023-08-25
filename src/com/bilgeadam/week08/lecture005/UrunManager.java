package com.bilgeadam.week08.lecture005;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class UrunManager {
	List<Urun> urunler = new ArrayList<Urun>();

	static Scanner sc = new Scanner(System.in);

	public Urun urunOlustur() {
		System.out.print("Ürün adını giriniz : ");
		String urunAdi = sc.nextLine();
		System.out.print("Ürün fiyatini giriniz : ");
		int fiyat = Integer.parseInt(sc.nextLine());
		System.out.print("Ürün SKT giriniz : ");
		int skt = Integer.parseInt(sc.nextLine());

		if (urunAdi.isBlank() || fiyat <= 0) {
			return null;
		} else {
			return new Urun(urunAdi, fiyat, skt);
		}
	}

	public Optional<Urun> urunOlustur2() {
		System.out.print("Ürün adını giriniz : ");
		String urunAdi = sc.nextLine();
		System.out.print("Ürün fiyatini giriniz : ");
		int fiyat = Integer.parseInt(sc.nextLine());
		System.out.print("Ürün SKT giriniz : ");
		int skt = Integer.parseInt(sc.nextLine());

		if (urunAdi.isBlank() || fiyat <= 0) {
			return Optional.empty();
		} else {

			return Optional.of(new Urun(urunAdi, fiyat, skt));
		}
	}

	public void urunEkle(Optional<Urun> urun) {
		urun.ifPresent(u -> {
			urunler.add(u);
		});
	}

	public void sktGecmisUrunleriListele(List<Urun> urun) {
		urun.stream().filter((x) -> x.getSonKullanmaTarihi() < 2023).forEach(System.out::println);

	}

	public void zamYap(List<Urun> urun) {
		urun.stream().filter((x) -> x.getSonKullanmaTarihi() > 2023).map(f -> {
			f.setFiyat(f.getFiyat() * 2);
			return f;
		}).forEach(System.out::println); // returnde döndüğün her bir y için bu işlemi yap
		;
	}

}
