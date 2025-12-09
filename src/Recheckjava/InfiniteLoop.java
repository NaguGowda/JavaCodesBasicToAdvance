package Recheckjava;

public class InfiniteLoop {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i--) {

			System.out.println("This loop will run forever");
			break;
		}
	}
}