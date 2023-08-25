package com.bilgeadam.week08.lecture001.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethodlari {
	public static void main(String[] args) {

		// Queue FIFO -> First in First in First Out

		Queue<Integer> queue = new LinkedList<>();
		queue.offer(2); // siraya bir eleman ekler
		queue.add(2); // sıraya bir eleman ekler
		queue.peek(); // sıradaki ilk öğeyi döndürür herhangi bir işlem yapmaz
		queue.poll(); // sıradaki ilk öğeyi dönrüdür ve sıradan çıkarır
		queue.isEmpty();

	}

}
