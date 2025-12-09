package com.string;

public class String_Buffer {
//	public static void main(String[] args) {
//
////		StringBuilder sb = new StringBuilder("00000"); // 5 chars space
//		
//		StringBuffer sb = new StringBuffer("00000"); // 5 chars space
//
//		for (int i = 0; i < 5; i++) {
//			sb.setCharAt(i, (char) ('1' + i)); // replace existing char
//		}
//
//		System.out.println(sb.toString());
//	}
//}

	public static void main(String[] args) throws InterruptedException {

		StringBuffer buffer = new StringBuffer();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				buffer.append('A'); // Thread-safe append
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				buffer.append('A');
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Final Output: " + buffer.toString());
		System.out.println(buffer.length());

	}
}
