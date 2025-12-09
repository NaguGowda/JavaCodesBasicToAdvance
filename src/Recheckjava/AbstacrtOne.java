package Recheckjava;

abstract class AbstractOne {

	// Abstract methods have no body and must be overridden in a subclass.
	abstract void check(String name); // Abstract method
}

class Geeks extends AbstractOne {
	void check(String name) {
		System.out.println(name);
	}

	public static void main(String[] args) {
		Geeks obj = new Geeks(); // Subclass object
		obj.check("GeeksforGeeks");
	}

}

//Predefined Methods
//Java provides many built-in methods via the Java Standard Library, like hashCode().
//
//public class Geeks {
//    public static void main(String[] args) {
//        Geeks obj = new Geeks();
//        System.out.println(obj.hashCode()); // Predefined method
//    }
//}