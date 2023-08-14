package com.bilgeadam.week06.lecture004.interfaceexpamle;

public class Test {

	public static void main(String[] args) {
		Kedi kedi = new Kedi();
		Kopek kopek = new Kopek();

		kopek.kos();
		kopek.suIc();
		kopek.yemekYe();
		kopek.uyu();

		kedi.agacaTirman();
		kedi.kos();
		kedi.suIc();
		kedi.yemekYe();
		kedi.uyu();

		Kus kus = new Kus();
		kus.yemekYe();
		kus.suIc();
		kus.uyu();
		kus.uc();
	}

}
