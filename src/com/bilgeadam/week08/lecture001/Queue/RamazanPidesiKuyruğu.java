package com.bilgeadam.week08.lecture001.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class RamazanPidesiKuyruğu {
	/**
	 * String, bir kuyruk tanımlayalım
	 * 
	 * bu kuyruğa 10-12 tane isim ekleyelim
	 * 
	 * Random 1-10 arası pide üretelim
	 * 
	 * kuyruğa gçre pideleri dağıtmaya başlayalım
	 * 
	 * pidelerini alanları, pideler bittiği zaman ğide alamayanları liste halinde
	 * yazdıralım
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Queue<String> pideKuyrugu = new LinkedList<String>();
		pideKuyrugu.offer("Banu");
		pideKuyrugu.offer("Batuhan");
		pideKuyrugu.offer("Betül");
		pideKuyrugu.offer("Sena");
		pideKuyrugu.offer("Mehmet");
		pideKuyrugu.offer("Burak");
		pideKuyrugu.offer("Ece");
		pideKuyrugu.offer("Kerem");
		pideKuyrugu.offer("Özge");
		pideKuyrugu.offer("Selin");

		Random random = new Random();
		int pideSayisi = random.nextInt(11);
		System.out.println("üretilen pide sayısı : " + pideSayisi);

		for (int i = 0; i < pideSayisi; i++) {
			if (!pideKuyrugu.isEmpty()) {
				System.out.println(pideKuyrugu.peek() + " pide aldı");
				pideKuyrugu.poll();
			}

		}
		System.out.println("Pide alamayanlar = " + pideKuyrugu);

	}

}
