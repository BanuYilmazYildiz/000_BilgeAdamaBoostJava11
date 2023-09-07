package com.bilgeadam.week10.lecture003;

public class ThreadTest {

	public static void main(String[] args) {
		Calisan calisan = new Calisan("Alperen");
		Calisan calisan2 = new Calisan("Banu");

		calisan.start();
		calisan2.start();
		calisan.calis();
		calisan2.calis();
	}

}
