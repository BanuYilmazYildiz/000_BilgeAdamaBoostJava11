package com.bilgeadam.week08.lecture002.set;

public class Ogrenci implements Comparable<Ogrenci> {

	int id;
	String name;

	public Ogrenci(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ogrenci [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Ogrenci o) {
		if (o.id < this.id) {
			return 1;
		} else if (o.id == this.id) {
			return 0;
		} else {
			return -1;
		}

	}

}
