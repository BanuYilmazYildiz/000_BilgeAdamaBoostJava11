package com.bilgeadam.week10.lecture001;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Uygulama {

	/**
	 * 1- bir yukYeriSec() metodu olsun. Bu metot limandakiyükler arrayinden bir yer
	 * belirlesin. Eğer sinir disi bir deger varsa hata versin.
	 * 
	 * 2- Kendi exception sinifimizi olusturalim. LimanAppException. Daha sonra
	 * sectigimiz indexteki deger null degil ise bu exceptionu firlatalim.
	 * "Sectiginiz yer dolu."
	 * 
	 * 3- kantar() isimli metod olacak, liman 100 kg altındaki ürünleri kabul
	 * etmiyor. Yükümüz bu kurala uymuyorsa hata fırlatalım
	 * 
	 * 
	 * 4- Limanımız cuma günleri yük kabul etmiyor. Bununla alakalı bir metod
	 * yazalım. eger tarihe denk gelen gün cuma ise hata firlatsın
	 * 
	 * 5- yukOlustur() metodu, yazılan metodu kullanlım ve kontrollerden geçiyorsa
	 * bir yük olusturalım
	 */

	Liman liman;

	public static void main(String[] args) {

		Uygulama uygulama = new Uygulama();

		uygulama.yukOlustur();
		for (Yuk yuk : uygulama.liman.getYukler()) {
			System.out.println(yuk);
		}

	}

	public Uygulama() {
		super();
		this.liman = new Liman();
	}

	private void yukOlustur() {
		Yuk yuk = null;
		int index = 0;
		try {
			index = yukYeriSec2();
			LocalDate tarih = tarihKontrol();
			double yukAgirligi = kantar();
			String isim = Utility.stringDegerAlma("Lütfen yükünüzün ismini giriniz : ");
			yuk = new Yuk(isim, yukAgirligi, tarih);
			liman.getYukler()[index] = yuk;
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			if (yuk != null) {
				System.out.println("Yukunuz kabul edilmiştir");
//				System.out.println(yuk.toString());
			} else {
				System.err.println("Yukunuz kabul edilmemistir");

			}
		}
	}

	private LocalDate tarihKontrol() {
		LocalDate tarih = Utility.stringTarihAlma();
		LocalDate bugun = LocalDate.now();
		if (tarih.isBefore(bugun)) {
			throw new LimanAppException(ErrorType.GECMIS_TARIH);
		} else if (tarih.getDayOfWeek() == DayOfWeek.FRIDAY) {
			throw new LimanAppException(ErrorType.MESAI_GUNU_DISINDA);
		} else {
			return tarih;
		}

	}

	private double kantar() {

		double agirlik = Utility.doubleDegerAlma("Lütfen ağırlık giriniz : ");
		if (agirlik < 100) {
			throw new LimanAppException(ErrorType.AGIRLIK_DUSUK);
		} else {
			return agirlik;
		}
	}

	private void yukYeriSec() {

		int index = Utility.intDegerAlma("Lutfen bir yuk yeri seciniz : ");
		try {
			Yuk yuk = liman.getYukler()[index];
		} catch (NullPointerException e) {
			System.out.println("Su an herhangi bir yuk yeri bulunamaktadır");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Lutfen gecerli bir yuk yeri giriniz");
		}
	}

	private int yukYeriSec2() {
		liman.getYukler()[0] = new Yuk("1", 100, LocalDate.now());
		int index = Utility.intDegerAlma("Lutfen bir yuk yeri seciniz : ");
		if (index < 0 || index >= liman.getYukler().length) {
			throw new ArrayIndexOutOfBoundsException("Lutfen gecerli bir yuk yeri giriniz ");
		} else if (liman.getYukler()[index] != null) {
			throw new LimanAppException(ErrorType.DOLU_YER_SECIMI, "Sectiginiz yer doludur");
		}
		return index;
	}

}
