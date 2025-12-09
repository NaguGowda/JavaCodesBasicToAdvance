package Recheckjava;

class MathUtils {

	public static int add(int a, int b) {
		return a + b;
	}
}

public class Publicaccessmodifier {

	public static void main(String[] args) {

		System.out.println(MathUtils.add(222, 10)); // accessible anywhere
	}
}