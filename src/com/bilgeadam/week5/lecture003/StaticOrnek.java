package com.bilgeadam.week5.lecture003;

public class StaticOrnek {
	int number = 0; // nesne değişkeni
	static int number2 = 0; // sınıf değişkeni

	public static void main(String[] args) {
		StaticOrnek staticOrnek = new StaticOrnek();

		staticOrnek.numaraVer(); // n1 =1, n2 = 1
		staticOrnek.numaraVer(); // n1=2 ; n2 = 2
		staticOrnek = new StaticOrnek();
		staticOrnek.numaraVer(); // n1 = 1, n2 = 3
		StaticOrnek staticOrnek2 = new StaticOrnek();
		System.out.println(staticOrnek2.number + " " + staticOrnek.number2); // n1 = 0 ,n2=3
		System.out.println(("1->" + (staticOrnek.number + 1))); // n1 = 2
		System.out.println(("2->" + (staticOrnek2.number + 1))); // n1 = 1
		System.out.println(("3->" + (staticOrnek.number2))); // 3
		number2Artır(); // n2 =8
		staticOrnek.number2Artır(); // n2=13
		System.out.println(("4->" + (staticOrnek2.number2))); // 13
		System.out.println(("5->" + (staticOrnek.number2))); // 13

	}

	public void numaraVer() {
		number += 1;
		number2 += 1;
		System.out.println("number 1 = " + number);
		System.out.println("number 2 =  " + number2);
	}

	public static void number2Artır() {
		number2 += 5;
	}

}
