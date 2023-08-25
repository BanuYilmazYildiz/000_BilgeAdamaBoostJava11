package com.bilgeadam.week08.lecture001.stack;

import java.util.Stack;

public class ParaSayma {

	public static void main(String[] args) {
		/**
		 * 
		 * Stack oluşturalım. Bu stacka 5-6 tane değer ekleyelim.
		 * 
		 * 100 tl den yüksek olanları toplam değerine ekleyelim, küçük olanları ise
		 * başka bir değere ekleyelim.
		 * 
		 * En son toplamı ve yeni oluşturduğumuz stacki yazdıralım
		 */

		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> stackNew = new Stack<Integer>();
		stack.push(200);
		stack.push(35);
		stack.push(123);
		stack.push(54);
		stack.push(87);

		int toplam = 0;
		while (!stack.isEmpty()) {
			if (stack.peek() > 100) {
				toplam += stack.pop();
			} else {
				stackNew.push(stack.pop());
			}
		}
		System.out.println("Toplam = " + toplam);
		System.out.println("Yeni Stack = " + stackNew);
		System.out.println();

		for (Integer para : stackNew) {
			System.out.println(para);
		}
		System.out.println();

		stackNew.forEach(System.out::println);
		System.out.println();
		System.out.println(stack);

	}

}
