package com.bilgeadam.week08.lecture004;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {

		SansliNumaralar sansliNumaralar = new SansliNumaralar();
		sansliNumaralar.mapOlustur();
//		sansliNumaralar.sayilarMap.forEach((k, v) -> System.out.println(k + " = " + v));
		sansliNumaralar.listeyeEkle();
//		System.out.println(sansliNumaralar.sayilarListe);
		sansliNumaralar.sansliNumaralariBul();
		int i = 1;
		for (Integer sayi : sansliNumaralar.sayilarSet) {
			System.out.println(i + ". sansli sayi -> " + sayi);
			i++;
		}

		// 50 den büyük olan sanslı numaralar

//		gunlerListesi.stream().filter(g -> g.contains("a"));

		sansliNumaralar.sayilarSet.stream().filter((s) -> s > 50).forEach(System.out::println);
		System.out.println("-----------------------------------------");
		System.out.println("50'den büyük olan sayıların yeni bir listede toplanması");
		List<Integer> list = sansliNumaralar.sayilarSet.stream().filter(number -> number > 50)
				.collect(Collectors.toList());
		System.out.println(list);
		System.out.println("-----------------------------------------");
		System.out.println("50'den büyük sayıların toplamını bir toplam2 degiskenine esitleyip yazdiralim");
//		int toplam2 = sansliNumaralar.sayilarSet.stream().filter(number -> number > 50).reduce(0, Integer::sum);
		Optional<Integer> toplam2 = sansliNumaralar.sayilarSet.stream().filter(number -> number > 50)
				.reduce((x, y) -> x + y);
		System.out.println("Toplam2 = " + toplam2.get()); // toplam3.get(); diyerek optional'dan kurtulmak mümkün
		System.out.println("2. seçenek;");
		sansliNumaralar.sayilarSet.stream().filter(number -> number > 50).reduce((x, y) -> x + y)
				.ifPresent(System.out::println);

		System.out.println("-----------------------------------------");
		System.out.println("sansli sayilarin toplami");
//		int toplam = sansliNumaralar.sayilarSet.stream().reduce(0, Integer::sum);
		Optional<Integer> toplam = sansliNumaralar.sayilarSet.stream().reduce((x, y) -> x + y);
		System.out.println(toplam);

//		Integer[] sayilar = new Integer[sansliNumaralar.sayilarSet.size()];
//		int j = 0;
//		for (Integer sayi : sansliNumaralar.sayilarSet) {
//			sayilar[j] = sayi;
//			j++;
//		}
//		int toplam1 = 0;
//		for (int k = 0; k < sayilar.length; k++) {
//			int sayi = sayilar[k];
//			toplam1 = toplam1 + sayi;
//		}
//		System.out.println("Toplam = " + toplam1);

		// Optional metotlari

		System.out.println("----------- Optional metotlari-----------------");
		int toplam3 = toplam2.get();
		Optional<String> kelime = Optional.empty();
//		String kelime2 = kelime.get(); // NoSuchElementException
		Optional<String> kelime3 = kelime;
		System.out.println(kelime3);
		System.out.println(toplam3);
		System.out.println("--------");
		Optional<String> kelime4 = Optional.ofNullable("Merhaba");
		System.out.println(kelime4);
		System.out.println("--------");
		Optional<String> kelime5 = Optional.of("Merhaba Dünya");
		System.out.println(kelime5);

		System.out.println(kelime5.isEmpty());
		System.out.println(kelime5.isPresent());
	}

}
