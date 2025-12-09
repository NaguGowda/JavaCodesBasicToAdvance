package Recheckjava;


public class StaticAccessmethos {
	// static method
	public static void greet() {

		System.out.println("Hello Geek!");
	}

	public static void main(String[] args) {

		// calling the method directly
		greet();

		// using the class name
		StaticAccessmethos.greet();
	}
}