package com.collectionss;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {
	public static void main(String[] args) {
		//FIFO
//		offer, poll, peek, if app crashes we can use add or offer sometime
		Queue<Integer> Q = new LinkedList<>();
		
		Q.offer(12);
		Q.offer(13);
		Q.offer(14);
		Q.offer(15);
		
		System.out.println(Q);
		
		System.out.println(Q.poll());
		
		System.out.println(Q);

		System.out.println(Q.peek());
		
		
	}
}
