package com.bilgeadam.week05.lecture003;

public class TestDataBase {
	public static void main(String[] args) {
//		KullaniciDataBase kullaniciDataBase = new KullaniciDataBase();

		KullaniciDataBase.kullanicilariOlustur();

		Kullanici[] kullanicilar = KullaniciDataBase.kullaniciListesi;

		for (int i = 0; i < kullanicilar.length; i++) {
			if (kullanicilar[i] != null) {
				System.out.println(kullanicilar[i].isim + " " + kullanicilar[i].id);
			}
		}

		KullaniciDataBase kullaniciDataBase2 = new KullaniciDataBase();
		for (int i = 0; i < kullaniciDataBase2.kullaniciListesi.length; i++) {
			if (kullanicilar[i] != null) {
				System.out.println(
						kullaniciDataBase2.kullaniciListesi[i].isim + " " + kullaniciDataBase2.kullaniciListesi[i].id);
			}
		}
	}

}
