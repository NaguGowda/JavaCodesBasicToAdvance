package com.interfaces;

class Outer {
	interface Inner {
		void display();
	}
}

class NestedInterfaceInsideClass implements Outer.Inner {

	public void display() {

		System.out.println("Hello from Nested Interface Inside a Class!");
	}

	public static void main(String[] args) {

		Outer.Inner obj = new NestedInterfaceInsideClass();
		obj.display();
	}
}
