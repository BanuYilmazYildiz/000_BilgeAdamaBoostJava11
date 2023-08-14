package com.bilgeadam.week05.lecture004;

public class Database {
	/**
	 * fields(isim email sifre id)
	 * 
	 * 
	 * database isimli bir sınıf oluşturlarım bu data base sınıfında bir kullanıcı
	 * listesi olsun
	 * 
	 * burada bir metot yazalım ve 3 adet kullanıcı ekleyelim
	 * 
	 */

	static Kullanici[] kullaniciListesi = new Kullanici[5];
	static int uzunluk = 0;
	static String kullaniciAdi = "";
	static int sayac = 0;

	public static void kullaniciEkle(Kullanici kullanici) {

		if (uzunluk == kullaniciListesi.length - 2) {
			listeBoyutunuArtır();
		}

		if (uzunluk < kullaniciListesi.length) {
			kullaniciListesi[uzunluk] = kullanici;
			uzunluk++;

		}

	}

	public static void listeBoyutunuArtır() {
		Kullanici[] tmp = new Kullanici[kullaniciListesi.length + 5];
		for (int i = 0; i < kullaniciListesi.length; i++) {
			tmp[i] = kullaniciListesi[i];
		}
		kullaniciListesi = tmp;
	}

	public static boolean kullaniciVarMi(String email, String sifre) {
		for (int i = 0; i < kullaniciListesi.length; i++) {
			if (kullaniciListesi[i] != null) {
				if (kullaniciListesi[i].email.equals(email) && kullaniciListesi[i].sifre.equals(sifre)) {
//					kullaniciAdi = kullaniciListesi[i].isim;
					System.out.println("Hosgeldiniz -> " + kullaniciListesi[i].isim);
					// aynı anda birden fazla giriş yapıldığı durumda bu daha mantıklı
					return true;
				}
			}
		}
		return false;
	}

//	public static void kullanicilariOlustur() {
//		Kullanici kullanici = new Kullanici();
//		kullanici.isim = "Zeynep";
//		kullanici.email = "zeynep@hotmail.com";
//		kullanici.sifre = "123";
//		kullanici.id = uzunluk;
//		kullaniciListesi[0] = kullanici;
//		uzunluk++;
//
//		Kullanici kullanici2 = new Kullanici();
//		kullanici2.isim = "Alperen";
//		kullanici2.email = "alperen@hotmail.com";
//		kullanici2.sifre = "123";
//		kullanici2.id = uzunluk;
//		kullaniciListesi[1] = kullanici2;
//		uzunluk++;
//
//		Kullanici kullanici3 = new Kullanici();
//		kullanici3.isim = "Banu";
//		kullanici3.email = "banu@hotmail.com";
//		kullanici3.sifre = "123";
//		kullanici3.id = uzunluk;
//		kullaniciListesi[2] = kullanici3;
//		uzunluk++;
//	}
}
