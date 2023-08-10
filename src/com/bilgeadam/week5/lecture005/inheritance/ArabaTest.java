package com.bilgeadam.week5.lecture005.inheritance;

public class ArabaTest {

	public static void main(String[] args) {

		Tasit tasit = new Tasit();
		tasit.setColor("mavi");
		tasit.setKm(0);
		tasit.setMarka("Mercedes");

//		System.out.println(tasit.getColor() + tasit.getKm() + tasit.getMarka());
		System.out.println(tasit.toString());

		Tasit tasit2 = new Tasit("Audi", "Siyah", 150);

//		System.out.println(tasit2.getColor() + tasit2.getKm() + tasit2.getMarka());
		System.out.println(tasit2.toString());

		Araba araba = new Araba();
		araba.setColor("mavi");
		araba.setKm(0);
		araba.setMarka("Mercedes");
		araba.setKapiSayisi(4);
		System.out.println(araba.toString());

		Araba araba2 = new Araba();
		System.out.println(araba2.toString());
		araba2.calistir();
		araba2.hizlan();
		araba2.durdur();

//		Araba araba3 = (Araba) new Tasit ("Fiat" , "Kırmızı",0 );
//		System.out.println(araba3.toString());

		Tasit araba3 = new Araba("Fiat", "Kırmızı", 200, 4);
		System.out.println(araba3.toString());
	}

}
