package com.collectionss;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Pqueue {
	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //Sorting the value by DESC
		pq.offer(40);
		pq.offer(12);
		pq.offer(24);
		pq.offer(36);
		System.out.println(pq);

	}
} 