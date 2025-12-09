package com.string;

public class String_Builder {

	public static void main(String[] args) throws InterruptedException {

		StringBuilder builder = new StringBuilder();

		Object lock = new Object(); // lock for synchronization

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				synchronized (lock) {
					builder.append('A');
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				synchronized (lock) {
					builder.append('A');
				}
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Final Output: " + builder.toString());
		System.out.println(builder.length());
	}
}
