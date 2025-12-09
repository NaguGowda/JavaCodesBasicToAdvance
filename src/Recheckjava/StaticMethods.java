package Recheckjava;

public class StaticMethods {
	
	public static void displayMessage() {
		
		System.out.println("Hello from static method!");
		System.out.println(Math.random() + "\n"); //random( )is static method
		
	}

	public static void main(String[] args) {
		
		StaticMethods.displayMessage(); // Calling static method using class name
		
//		directly
		displayMessage(); // recommended
		
	}
}
