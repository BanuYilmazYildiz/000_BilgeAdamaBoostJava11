package com.bilgeadam.week09.lecture001;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1- not ortalaması hesaplayan Stream yapısını kuralım. Her öğrenci için ayrı
 * hesaplayıp ortalamaNotlar isimli double listede saklayabiliriz. Bir de sınıf
 * ortalaması
 * 
 * 2- Ogrencileri bölümlerine göre mapleyen bir metot yazalım. Ciktisini da
 * metot içinde alalım
 */

public class StudentManager {

	List<Student> ogrenciler;

	public StudentManager() {
		baslangicVerisiOlustur();
	}

	public void baslangicVerisiOlustur() {
		ogrenciler = new ArrayList<Student>();

//		ogrenciler = List.of(new Student(1, "Alperen", "MF"), new Student(2, "Mahmut", "MF"));

		Student student = new Student(1, "Alperen", "MF");
		student.getNotlar().add(90.0);
		student.getNotlar().add(95d);
		student.getNotlar().add(100.0);

		Student student2 = new Student(2, "Mahmut", "TM");
		student2.getNotlar().add(50.0);
		student2.getNotlar().add(65d);
		student2.getNotlar().add(90.0);

		Student student3 = new Student(3, "Fatma", "MF");
		student3.getNotlar().add(75.0);
		student3.getNotlar().add(50d);
		student3.getNotlar().add(83.0);

		Student student4 = new Student(4, "Ali", "MF");
		student4.getNotlar().add(85.0);
		student4.getNotlar().add(85d);
		student4.getNotlar().add(100.0);

		Student student5 = new Student(5, "Ayşe", "TM");
		student5.getNotlar().add(45.0);
		student5.getNotlar().add(40d);
		student5.getNotlar().add(40.0);

		Student student6 = new Student(6, "Alican", "TM");
		student6.getNotlar().add(90.0);
		student6.getNotlar().add(90d);
		student6.getNotlar().add(100.0);

		// öğrencileri öğrenciler listesine ekleme
//		ogrenciler.add(student);
//		ogrenciler.add(student2);
//		ogrenciler.add(student3);
//		ogrenciler.add(student4);
//		ogrenciler.add(student5);
//		ogrenciler.add(student6);

		ogrenciler = List.of(student, student2, student3, student4, student5, student6);
	}

	public void ogrenciNotOrtalama() {
		List<Double> ortalamaNotlar = new ArrayList<Double>();

		// 1. çözüm -> map
//		ortalamaNotlar = ogrenciler.stream()
//				.map(o -> o.getNotlar().stream().collect(Collectors.averagingDouble(Double::doubleValue)))
//				// Double dediğimiz ::double -> veri double olarak geliyor double olarak çıkıyor
//				.collect(Collectors.toList());
//		ortalamaNotlar.forEach(System.out::println);

		// 2. çözüm -> for-Each
//		ogrenciler.stream().forEach((ogrenci -> {
//			System.out.println(ogrenci.getNotlar().stream().collect(Collectors.averagingDouble(z -> z)));
//		}));

		// 3.çözüm -> forEach
//		ogrenciler.stream().forEach((ogrenci -> {
//			ortalamaNotlar.add(ogrenci.getNotlar().stream().collect(Collectors.averagingDouble(z -> z)));
//		}));
//		ortalamaNotlar.forEach(System.out::println);

//		ogrenciler.stream().forEach(ogrenci -> System.out.println(ogrenci.notOrtalamasiHesapla()));

//		ortalamaNotlar = ogrenciler.stream().map(ogrenc -> ogrenc.notOrtalamasiHesapla()).collect(Collectors.toList());
//		ortalamaNotlar.forEach(System.out::println);

		Double ort = ogrenciler.stream().map((ogrenci) -> ogrenci.notOrtalamasiHesapla()).collect(Collectors.toList())
				.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
		System.out.println(ort);

		Double ort2 = ogrenciler.stream().map(ogr -> ogr.notOrtalamasiHesapla())
				.collect(Collectors.averagingDouble(Double::doubleValue));
		System.out.println(ort2);

		Double ort3 = ogrenciler.stream().collect(Collectors.averagingDouble(
				(z) -> z.getNotlar().stream().collect(Collectors.averagingDouble(Double::doubleValue))));
		System.out.println(ort3);

	}
}
