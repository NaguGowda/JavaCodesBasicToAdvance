package com.oops.check;

abstract class Fruits {
	// Abstract methods
	abstract void dry();

	abstract void raw();

	// concret method
	void getOne() {
		System.out.println("Store filled");
	}

}

class Checkout extends Fruits {

	private String name;
	private String color;

	public Checkout(String name, String color) {
		this.name = name;
		this.color = color;

	}

	@Override
	void dry() {
		System.out.println("name of the fruit is :" + this.color );
	}

	@Override
	void raw() {
		System.out.println("color of "+ this.name);

	}
}

public class AbstractClassCheck {
	public static void main(String[] args) {
		
		System.out.println("Checking reverse game of the guessing\n");
		
		Fruits LL = new Checkout("Apple", "RED");
		LL.dry();
		LL.raw();

	}

}
