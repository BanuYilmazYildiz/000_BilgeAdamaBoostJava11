package com.bilgeadam.week5.lecture005.inheritance;

public class Tasit {

	private String marka;
	private String color;
	private int km;

	public void calistir() {
		System.out.println("Tasit calistirildi");
	}

	public void durdur() {
		System.out.println("Tasit calismayi durdurdu");
	}

	public void hizlan() {
		System.out.println("Tasit hizlaniyor");
	}

	public Tasit() {
		super();
	}

	public Tasit(String marka, String color, int km) {
		super();
		this.marka = marka;
		this.color = color;
		this.km = km;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	@Override
	public String toString() {
		return "Tasit [marka=" + marka + ", color=" + color + ", km=" + km + "]";
	}

}
