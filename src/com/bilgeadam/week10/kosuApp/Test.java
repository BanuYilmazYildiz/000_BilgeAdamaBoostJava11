package com.bilgeadam.week10.kosuApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Kosucu> kosucular = new ArrayList<Kosucu>();
		for (int i = 1; i < 11; i++) {
			kosucular.add(new Kosucu("Kosucu-" + i));
		}

		kosucular.forEach(kosucu -> {
			Thread thread = new Thread(kosucu);
			thread.start();
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		List<Kosucu> surelereGore = kosucular.stream().sorted((k1, k2) -> Double.compare(k1.getSure(), k2.getSure()))
				.collect(Collectors.toList());
		for (int i = 0; i < surelereGore.size(); i++) {
			Kosucu kosucu = surelereGore.get(i);
			System.out.println(
					"Sıra: " + (i + 1) + ", İsim: " + kosucu.getIsim() + " Süre :" + kosucu.getSure() + " saniye");
		}

	}

}
