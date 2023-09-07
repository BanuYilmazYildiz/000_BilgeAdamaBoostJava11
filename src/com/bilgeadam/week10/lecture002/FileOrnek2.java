package com.bilgeadam.week10.lecture002;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOrnek2 {

	public static void main(String[] args) {
		// Buffer , Buffering -> Ön yükleme (videonun belli kısmını yüklüyor sen
		// izliyorsun)

		String path = "C:/Users/pc/Desktop/Java-11/Eclipse Workspace/000__BilgeAdamBoostJava11/deneme3.txt";
		File file = new File(path);
		try {
			file.createNewFile(); // -> dosya oluşturma yöntem 1
//			FileWriter fileWriter = new FileWriter(file); // Yöntem 2

			/**
			 * boolean true şeklinde geldi. Önceki bilgeleri silmiyor
			 */

//			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true)); // Yöntem 3
			BufferedWriter writer = new BufferedWriter(new FileWriter(file)); // Yöntem 3
			BufferedReader reader = new BufferedReader(new FileReader(file));
			writer.write("Satır1\n");
			writer.write("Satır2\n");
			writer.write("Satır1\n");
			writer.write("Satır2\n");
			writer.write("Satır1\n");
			writer.write("Satır2\n");
			writer.write("Satır1\n");
			writer.write("Satır2\n");
			writer.write("Satır1\n");
			writer.write("Satır2\n");
			writer.write("Satır1\n");
			writer.write("Satır2\n");

			/*
			 * Buffer dolduktan sonra bize gösterecek.Dolmadan okumak için boşaltmamız lazım
			 */
			writer.flush(); // sifonu çekmek, tamam sortiyi yolla
//			String deger1 = reader.readLine(); // satır satır okuyor
//			System.out.println(deger1);
//			String deger2 = reader.readLine(); // satır satır okuyor
//			System.out.println(deger2);
//			String deger3 = reader.readLine(); // satır satır okuyor
//			System.out.println(deger3);

			String deger;
			while ((deger = reader.readLine()) != null) {
				System.out.println(deger);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
