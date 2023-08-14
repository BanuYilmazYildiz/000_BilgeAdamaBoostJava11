package com.bilgeadam.week07.lecture001.absractiınornek;

public abstract class Tasit {

	private String marka;
	private String model;
	private int hiz;
	private String vites;

	public Tasit() {
		super();
	}

	public Tasit(String marka, String model, int hiz, String vites) {
		super();
		this.marka = marka;
		this.model = model;
		this.hiz = hiz;
		this.vites = vites;
	}

	public void hizlan() { // concrate method
		hiz += 10;
	}

	public void frenYap() { // concrate method
		hiz -= 10;
	}

	public void vitesDegistir(String yeniVites) { // concrate method
		vites = yeniVites;

	}

	public void ozellikleriGoster() { // concrate method
		System.out.println("Marka : " + marka);
		System.out.println("Model : " + model);
		System.out.println("Hız : " + hiz);
		System.out.println("Vites : " + vites);
	}

	public abstract void akrobatikHareketYap(); // cabstract method -> gövde yoki miras alındığı sınıflarda gövdesini
												// kazanacak.

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getHiz() {
		return hiz;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}

	public String getVites() {
		return vites;
	}

	public void setVites(String vites) {
		this.vites = vites;
	}

	@Override
	public String toString() {
		return "Tasit [marka=" + marka + ", model=" + model + ", hiz=" + hiz + ", vites=" + vites + "]";
	}

}
