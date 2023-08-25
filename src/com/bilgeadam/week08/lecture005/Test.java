package com.bilgeadam.week08.lecture005;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test {

	public static void main(String[] args) {

		UrunManager urunManager = new UrunManager();
		List<Optional<Urun>> yeniUrunler = new ArrayList<Optional<Urun>>();
//		Urun urun = urunManager.urunOlustur();
//		System.out.println(urun);
//		Optional<Urun> urun2 = urunManager.urunOlustur2();
//		System.out.println(urun2);
//		System.out.println();
//
//		Optional<Urun> urun3 = urunManager.urunOlustur2();
//		System.out.println(urun3);
//		System.out.println();

		for (int i = 0; i < 3; i++) {
			urunManager.urunEkle(urunManager.urunOlustur2());
//			yeniUrunler.add(urunManager.urunOlustur2());
		}
//		for(Urun urun : urunManager.urunler) {
//			System.out.println(urun);
//		}

		for (Optional<Urun> urun : yeniUrunler) {
			System.out.println(urun);
		}

		// Eğer urun var ise urunun fiyatını 2 katına çıkarın

//		for (Optional<Urun> urun : yeniUrunler) { // değişiklik yapılacaksa içinde map kullanılıyor
//			urun.map(u -> {
//				u.setFiyat(2 * u.getFiyat());
//				return u;
//			}).ifPresent(System.out::println);
//		}
		System.out.println("SKT geçmiş ürünler;");
		urunManager.sktGecmisUrunleriListele(urunManager.urunler);
		System.out.println();

		System.out.println("SKT geçmemiz ve zam yapılmış olanlar");
		urunManager.zamYap(urunManager.urunler);

	}

}
