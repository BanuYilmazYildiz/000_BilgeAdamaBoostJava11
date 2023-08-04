package com.bilgeadam.week5.lecture004;

import java.util.Scanner;

public class Uygulama {
	Scanner sc = new Scanner(System.in);

	/**
	 * Menu 1-Kayıt ol 2- Giriş yap 3-Kullanıcıları göster 4- Çıkış
	 * 
	 * 
	 * 1-Menü oluştur 2-Menüden seçim yap 3-Yapılan seçime göre aksiyon alınabilecek
	 * bir tema oluştur.
	 * 
	 * case1 : kayitOl(); içini yaz. database e kaydedebilmek içim; kullaniciEkle
	 * (parametre alabilir almayabilir) case1.1 -> database sinifinde liste boyutunu
	 * artır isimli method liste.length-2 veri girdisi olduğunda liste boyutunu 5
	 * arttırsın
	 * 
	 * Bu gün derste çözdüğümüz örnekte case 2 ve case 3 yapılacak.
	 * 
	 * case 2 için; girisYap( ) metodu uygulama sınıfında kullanılacak.
	 * 
	 * 
	 * 
	 * 
	 */
	public void aplication() { // Static olduğu için bir sınıf metodudur.
		int secim;
		do {
			menu();
			secim = secimYap();
			switch (secim) {
			case 1:
				kayitOl();

				break;
			case 2:
				girisYap();
				break;
			case 3:
				kullanilariGoster();
				break;
			case 4:
				System.err.println("Çıkış Yapıldı");
				break;
			case 5:
//				for (int i = 0; i < Database.kullaniciListesi.length; i++) {
//					if (Database.kullaniciListesi[i] != null) {
//						System.out.println(Database.kullaniciListesi[i].isim + " " + Database.kullaniciListesi[i].id);
//					}
//				}
				System.out.println(Database.kullaniciListesi.length);
				break;
			default:
				System.err.println("Lütfen geçerli seçim yapınız.");
			}

		} while (secim != 4);

	}

	private void kayitOl() {
		Kullanici kullanici = new Kullanici();
		System.out.println("********* Kayit Ekrani *********\n");
		System.out.print("Lütfen isminizi giriniz : ");
		kullanici.isim = sc.nextLine();
		System.out.print("Lütfen email giriniz : ");
		kullanici.email = sc.nextLine();
		System.out.print("Lütfen sifrenizi giriniz : ");
		kullanici.sifre = sc.nextLine();
		kullanici.id = Database.uzunluk + 1;
		Database.kullaniciEkle(kullanici);

	}

	private void girisYap() {

		System.out.println("********* Giris Ekrani *********");
		System.out.print("Lütfen mailinizi giriniz : ");
		String mail = sc.nextLine();
		System.out.print("Lütfen sifrenizi giriniz : ");
		String sifre = sc.nextLine();

		if (Database.kullaniciVarMi(mail, sifre)) {
			System.out.println(Database.kullaniciAdi + " basariyla sisteme giris yapti");
		} else {
			System.out.println("Email ya da sifre hatali");
			Database.sayac++;
		}
		if (Database.sayac == 3) {
			System.err.println("3 kere hatalı giriş yaptınız lütfen ana menüden seçim yapın");
			Database.sayac = 0;
		}

	}

	private void kullanilariGoster() {
		System.out.println();
		System.out.println("id    | Kullanici Adi        | Kullanıcı Mail");
		System.out.println("--      -------------          --------------");
		for (int i = 0; i < Database.kullaniciListesi.length; i++) {
			if (Database.kullaniciListesi[i] != null) {
				System.out.printf("%-2s	%-8s		%-18s\n", Database.kullaniciListesi[i].id,
						Database.kullaniciListesi[i].isim, Database.kullaniciListesi[i].email);
			}
		}

	}

	public void menu() {
		System.out.println();
		System.out.println("********************************");
		System.out.println("**** KULLANICI KAYIT SISTEMI ***");
		System.out.println("********************************");
		System.out.println();
		System.out.println("1- Kayit Ol");
		System.out.println("2- Giris Yap");
		System.out.println("3- Kullanicilari Goster");
		System.out.println("4- C I K I S");
		System.out.println();
	}

	public int secimYap() {
		System.out.print("Lütfen bir seçim yapınız : ");
		int secim = sc.nextInt();
		sc.nextLine();
		return secim;
	}

}
