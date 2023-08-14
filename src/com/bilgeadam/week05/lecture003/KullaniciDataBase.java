package com.bilgeadam.week05.lecture003;

public class KullaniciDataBase {
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
	static int uzunluk = 1;

	public static void kullanicilariOlustur() {
		Kullanici kullanici = new Kullanici();
		kullanici.isim = "Zeynep";
		kullanici.email = "zeynep@hotmail.com";
		kullanici.sifre = "123";
		kullanici.id = uzunluk;
		kullaniciListesi[0] = kullanici;
		uzunluk++;

		Kullanici kullanici2 = new Kullanici();
		kullanici2.isim = "Alperen";
		kullanici2.email = "alperen@hotmail.com";
		kullanici2.sifre = "123";
		kullanici2.id = uzunluk;
		kullaniciListesi[1] = kullanici2;
		uzunluk++;

		Kullanici kullanici3 = new Kullanici();
		kullanici3.isim = "Banu";
		kullanici3.email = "banu@hotmail.com";
		kullanici3.sifre = "123";
		kullanici3.id = uzunluk;
		kullaniciListesi[2] = kullanici3;
		uzunluk++;
	}
}
