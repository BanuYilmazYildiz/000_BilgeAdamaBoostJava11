package com.bilgeadam.week5.lecture002;

public class MaasOzelListe {
	double[] maasListesi;
	int boyut = 0;

	public void add(double maas) {

		double[] tmp;
		if (maasListesi == null) {
			maasListesi = new double[1];
			maasListesi[0] = maas;
		} else {
			tmp = new double[boyut + 1];
			for (int i = 0; i < boyut; i++) {
				tmp[i] = maasListesi[i];
			}
			tmp[boyut] = maas;

			maasListesi = tmp;
		}
		boyut++;

	}

	public void list() {
		System.out.print("[");
		for (int i = 0; i < boyut; i++) {
			if (i == boyut - 1)
				System.out.print(maasListesi[i]);
			else
				System.out.print(maasListesi[i] + ", ");
		}
		System.out.print("]");
		System.out.println();
	}

	public double[] getList() {
		return maasListesi;
	}

//	public String getIndexOf(int i) {
//		return ogrenciListesi[i];
//	}

}
