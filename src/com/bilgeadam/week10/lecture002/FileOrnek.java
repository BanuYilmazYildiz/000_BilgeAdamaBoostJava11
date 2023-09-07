package com.bilgeadam.week10.lecture002;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOrnek {

	public static void main(String[] args) {
		// C:\Users\pc\Desktop\Java-11\Eclipse Workspace

		// Output -> Yazma islemi
		// Input -> Okuma islemi

//		String kelime = "C:\\Users\\pc\\Desktop\\Java-11\\Eclipse Workspace";
		try {
			FileOutputStream fos = new FileOutputStream(
					"C:/Users/pc/Desktop/Java-11/Eclipse Workspace/000__BilgeAdamBoostJava11/deneme2.txt");
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\pc\\Desktop\\Java-11\\Eclipse Workspace\\000__BilgeAdamBoostJava11\\deneme2.txt");
//			byte[] array = { 101, 80, 88 };

			try {
//				fos.write(65);
//				fos.write(array);
				String kelime = "Merhaba Dunya! ";
				fos.write(kelime.getBytes());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println((char) fis.read());
//				System.out.println(fis.read());
				int deger;
				// MraaDna
				// ehb uy!
				while ((deger = fis.read()) != -1) {
					System.out.println((char) deger);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
