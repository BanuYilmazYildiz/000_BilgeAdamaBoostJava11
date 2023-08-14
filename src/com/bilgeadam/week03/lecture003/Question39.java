package com.bilgeadam.week03.lecture003;

public class Question39 {

	public static void main(String[] args) {
		/*
		 * String'i parçalara ayıralım, bir array'e kaydedelim. Sonra aşağıdaki örnek
		 * çıktıyı almaya çalışalım; Adananın plaka kodu = 01 String sehirler =
		 * "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;" +
		 * "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";
		 * 
		 */
		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
				+ "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";

		String sehirler1[] = sehirler.split(";");
		for (int i = 0; i < sehirler1.length; i++) {
			int index = sehirler1[i].indexOf('-');
//			String sehir = sehirler1[i].substring(index + 1);
//			String plaka = sehirler1[i].substring(0, index);
//			System.err.println(sehir + " plaka kodu=\t" + plaka);
			System.out.println(sehirler1[i].substring(index + 1) + " plaka kodu=\t" + sehirler1[i].substring(0, index));

		}

	}

}
