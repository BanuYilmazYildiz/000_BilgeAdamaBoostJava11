package com.bilgeadam.week08.lecture001.stack;

import java.util.Stack;

import com.bilgeadam.week08.lecture001.Utility;

public class PalindromStack {
	/**
	 * Disaridan bir metin gireceğiz. sonra bu metni br stacke atayacağız.
	 * 
	 * daha sonra bu kelimenin palindrom olup olmadığını kontrol eden bir method
	 * yazalım
	 * 
	 * 
	 */

	Stack<Character> stack = new Stack<Character>();

	public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
//		System.out.print("Lutfen bir kelime giriniz = ");
//		String kelime = sc.nextLine();
//		System.out.println(isPolindrom(kelime));
		PalindromStack palindromStack = new PalindromStack();
		String kelime = Utility.stringDegerAlma("Lütfen bir kelime giriniz : ");

		if (palindromStack.isPolindrom(kelime)) {
			System.out.println("Kelime palindromdur");
		} else {
			System.out.println("Kelime palindrom değildir");
		}

	}

	public void stackOlusturma(String kelime) {
		for (int i = 0; i < kelime.length(); i++) {
			stack.push(kelime.charAt(i));
		}
	}

	public boolean isPolindrom(String kelime) {
		stackOlusturma(kelime);
		for (int i = 0; i < stack.size() / 2; i++) {
			if (stack.pop() != kelime.charAt(i)) {
				return false;
			}
		}
		return true;

	}

//	public static boolean isPolindrom(String kelime) {
//		Stack<Character> charlar = stackOlustur(kelime);
//		String tersKelime = "";
//		while (!charlar.isEmpty()) {
//			tersKelime += charlar.pop();
//		}
//		if (kelime.equalsIgnoreCase(tersKelime)) {
//			return true;
//		} else {
//			return false;
//		}
//
//	}
//
//	public static Stack<Character> stackOlustur(String kelime) {
//		Stack<Character> charlar = new Stack<Character>();
//		for (int i = 0; i < kelime.length(); i++) {
//			charlar.push(kelime.charAt(i));
//
//		}
//		return charlar;
//	}

}
