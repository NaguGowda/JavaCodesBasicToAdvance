package Recheckjava;

public class predefinedMethod {
	public float randommm() {
		System.out.println(Math.random()); // <--------
		return 0;
	}

	public static void main(String[] args) {
		predefinedMethod jj = new predefinedMethod();
		jj.randommm();
	}
}

//build in methods are 
//math.random
// .PI