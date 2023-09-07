package com.bilgeadam.week10.lecture002;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileIslemler {
	/**
	 * menu ;
	 *
	 * 0- ÇIKIS
	 * 
	 * 1- Dosya Yarat
	 * 
	 * 2- Ekle
	 * 
	 * 3- Okuma
	 * 
	 * 4- Harf Degistir
	 * 
	 * 5- Dosya Silme
	 * 
	 * 
	 * Lutfen islem seciniz
	 * 
	 * 1- File sabitler sınıfında static bir file yaratalım. bu file'ı tüm
	 * methodlarımızda kullanacağız
	 * 
	 * 2- Dosya yaratmak için bir method yazalım. eğer dosyamız dizinde yokas bu
	 * dosayayı yaratsın. Eğer dizinde dosya var ise "bu dosya daha önce
	 * oluşturulmustur"
	 * 
	 * 3- Dosyamıza dışarıdan aldığımız veriyi ekleyelim (Scanner ile aldığımız
	 * veriyi) ve her ekleme yapıldıktan sonra bir sonraki ekleme için alt satıra
	 * geçilsin
	 * 
	 * 4- Dosyadan veri okumak için bir method yazalım.
	 * 
	 * 5- HarfDegistir methodunu yazalım. Bu method string bir parametre alsın.
	 * İcerisindeki harfi istenilen harf ile degistirip dosyaya kahdetsin
	 * 
	 * 6- dosyaSil metodu yazalım
	 */

	public static void main(String[] args) {
		FileIslemler fileIslmeler = new FileIslemler();
		fileIslmeler.dosyaYarat();
//		fileIslmeler.doyayaVeriEkle("Merhaba Dunya");
//		String tumMetin = fileIslmeler.dosyadanVeriOkuma();
//		fileIslmeler.harfDegistir(tumMetin);
//		fileIslmeler.dosyadanVeriOkuma();
//		fileIslmeler.dosyaSil(FileSabitler.file);
		fileIslmeler.dosyaSil2(FileSabitler.path);
		fileIslmeler.dosyaYarat();

	}

	public void dosyaYarat() {
		try {
			if (FileSabitler.file.exists()) {
				System.out.println(FileSabitler.file.getAbsolutePath() + " Dosya daha önceden oluşturulmustur");
			} else {
				FileSabitler.file.createNewFile();
				System.out.println(FileSabitler.file.getName() + " basari ile olusturulmustur");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void dosyaYarat2() {
		try {
			if (FileSabitler.file.createNewFile()) { // -> boolean deger dondugu icin dosyayi olusturma calisirken
														// kullanabiliyoruz
				System.out.println(FileSabitler.file.getName() + " basari ile olusturulmustur");
			} else {
				System.out.println(FileSabitler.file.getAbsolutePath() + " Dosya daha önceden oluşturulmustur");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void doyayaVeriEkle(String metin) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dosyaya eklenerek mi yapılsın (E/H): ");
		boolean kontrol = false;
		if (sc.nextLine().equalsIgnoreCase("e")) {
			kontrol = true;
		}
		try {
			FileWriter fw = new FileWriter(FileSabitler.file, kontrol);
			BufferedWriter bufferedWritter = new BufferedWriter(fw);
			bufferedWritter.write(metin + "\n");
			bufferedWritter.flush();
			System.out.println("Veri eklendi. " + FileSabitler.file.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String dosyadanVeriOkuma() {
		String tumMetin = "";
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(FileSabitler.file));
			String deger = "";
			while ((deger = bufferedReader.readLine()) != null) {
				tumMetin += deger + "\n";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(tumMetin);
		return tumMetin;
	}

	public void harfDegistir(String metin) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lutfen degistirmek istediginiz harfi giriniz : ");
		char eskiHarf = sc.nextLine().charAt(0); // -> girilen, bulunan string ilk char ı
		System.out.print("Lutfen yeni harfi giriniz : ");
		char yeniHarf = sc.nextLine().charAt(0);
		metin = metin.replace(eskiHarf, yeniHarf);
		doyayaVeriEkle(metin);

	}

	public void dosyaSil(File file) {
		if (file.exists()) {
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			file.delete();
			System.out.println(file.getName() + " isimli dosya silindi");
		} else {
			System.out.println("Boyle bir dosya bulunmamaktadır.");
		}

	}

	public void dosyaSil2(Path path) {
		try {
			if (Files.deleteIfExists(path)) {
				System.out.println("Dosyanız siliniyor");
				try {
					Thread.sleep(5000);
				} catch (Exception e) {
					e.printStackTrace();
				}

			} else {
				System.out.println("Boyle bir dosya bulunmamaktadır.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
