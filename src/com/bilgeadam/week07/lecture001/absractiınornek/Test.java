package com.bilgeadam.week07.lecture001.absractiınornek;

public class Test {
	/**
	 * Tasit superclass olacak. bu sınıf abstract sınıf olacak.
	 * 
	 * marka
	 * 
	 * model
	 * 
	 * maksHiz
	 * 
	 * vites
	 * 
	 * hizlan();
	 * 
	 * frenYap();
	 * 
	 * viteesDegistir();
	 * 
	 * ozellikleriGoster();
	 * 
	 * akrobatikHareketYap();
	 * 
	 * Bu tasit sınıfından miras alan araba ve motorsiklet isimli iki sınıf
	 * oluştualım.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Araba arava = new Araba();
		Araba araba2 = new Araba("Mercedes", "G400", 0, "D");
		Motorsiklet motor = new Motorsiklet();
		Motorsiklet motor2 = new Motorsiklet("BMW", " S 1000 RR ", 50, "1");

		motor.setMarka("Ducati");
		motor.setModel("848");
		motor.setHiz(50);
		motor.setVites("1");

		araba2.ozellikleriGoster();
		System.out.println();
		araba2.vitesDegistir("1");
		araba2.hizlan();
		araba2.hizlan();
		araba2.frenYap();

		araba2.ozellikleriGoster();
		araba2.akrobatikHareketYap();
		System.out.println();

		motor.ozellikleriGoster();
		motor.vitesDegistir("2");
		motor.hizlan();
		motor.hizlan();
		motor.hizlan();
		motor.hizlan();
		System.out.println();
		motor.ozellikleriGoster();
		motor.akrobatikHareketYap();

	}

}
