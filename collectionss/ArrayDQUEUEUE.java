package com.collectionss;

import java.util.ArrayDeque;

public class ArrayDQUEUEUE {
	public static void main(String[] args) {
		ArrayDeque<Integer> adq = new ArrayDeque<>(); // Inserting value form both side of queue
		adq.offer(23);
		adq.offerFirst(12);
		adq.offerLast(45);
		System.out.println(adq);

		adq.offer(26);

		System.out.println(adq);
		System.out.println(adq.peek()); //top/1st value

		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());

		System.out.println(adq.poll());//remove 1st element
		System.out.println("poll() " + adq);
		System.out.println(adq.pollFirst());

		System.out.println("pollFirst() " + adq);
		System.out.println(adq.pollLast()); //remove last element
		System.out.println("pollLast() " + adq);
	}
}