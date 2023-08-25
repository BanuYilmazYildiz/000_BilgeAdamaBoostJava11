package com.bilgeadam.week08.lecture001.stack;

import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		// Stack ->> LIFO ->> Last in first out
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1); // 1 sayısını stack'e ekler
		stack.push(2); // 2 sayısını stack'e ekler. Genellikle stacklerde ekleme işlemi için push
						// kullanılır.
		stack.peek(); // Stack'e en son eklenen değeri stack'ten çıkarmadan getirir
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println();

		stack.pop(); // Stack'e en son eklenen değeri getirir ve stack'ten çıkarır.

		System.out.println(stack);
//		stack.pop(); -> stackte eleman kalmamışken bu method tekrar calıştırılırsa emptyScatkException alırız.

		System.out.println(stack.isEmpty()); // stack'te eleman olup olmadığını kontrol eder. Eğer hiç eleman yoksa
												// true, eleman varsa false

	}

}
