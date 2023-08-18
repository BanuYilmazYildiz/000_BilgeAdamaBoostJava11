package com.bilgeadam.week07.lecture003.footballApp;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) throws InterruptedException {

//		System.out.println(takim.getKaleci());
//		for (AktifFutbolcu futbolcu : takim.getFutbolcular()) {
//			System.out.println(futbolcu.pasVer());
//		}
		Takim takim = new Takim("Ev Sahibi");
		Takim takim2 = new Takim("Deplasman");
		List<Takim> takimlar = new ArrayList<Takim>();
		takimlar.add(takim);
		takimlar.add(takim2);

		Mac mac = new Mac(takimlar);
		mac.mac();

//		mac.oyna(mac.takimlar.get(0));

	}

}
