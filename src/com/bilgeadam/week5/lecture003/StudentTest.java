package com.bilgeadam.week5.lecture003;

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.ad = "Ugur";
		student1.ogrenciKaydet();
		Student student2 = new Student();
		student2.ad = "Alperen";
		student2.ogrenciKaydet();
		Student student3 = new Student();
		student3.ad = "Sedat";
		student3.ogrenciKaydet();

		System.out.println(student1.ad);
		System.out.println(student1.ogrenciNumarasi);

	}

}
