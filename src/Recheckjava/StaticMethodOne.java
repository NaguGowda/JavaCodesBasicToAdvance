package Recheckjava;


//Can be called without creating an instance of the class.
//Since static methods are any object specific, they can access only static members 
//(data and methods), and cannot access non-static members.

public class StaticMethodOne {
	
	public static void main(String[] args) {
		
		System.out.println("Check statis methods");
		StaticMethodOne cece = new StaticMethodOne();
		cece.CheckOne(" Hello");
		
	}
	
	public void CheckOne(String a) {
		System.out.println("check" + a);
		
	}
}
