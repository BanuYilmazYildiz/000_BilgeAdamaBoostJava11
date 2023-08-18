package com.bilgeadam.week07.lecture003.footballApp;

public abstract class AktifFutbolcu extends Futbolcu {

	public AktifFutbolcu(String adSoayd, int formaNo) {
		super(adSoayd, formaNo);

	}

	public boolean pasVer() {
		int pasSkoru = pasSkor();
		if (pasSkoru > 68) {
//			System.out.println("Pas başarılı");
//			System.out.println("Pas Skoru = " + pasSkor());
			return true;
		} else {
//			System.out.println("Pas başarısız");
//			System.out.println("Pas Skoru = " + pasSkor());
			return false;
		}
	}

	public abstract int pasSkor();

	public boolean sutCek(int kurtaris) {

		int sutSkoru = golSkor(kurtaris);

		if (sutSkoru > 68) {
//			System.out.println("GOL!!!!!");
//			System.out.println("sutSkoru = " + sutSkoru);
			return true;
		} else {
//			System.out.println("Kurtarıldı!!!");
//			System.out.println("sutSkoru = " + sutSkoru);

			return false;
		}
	}

	public abstract int golSkor(int kurtaris);

}
