package Recheckjava;

class keeks {
	String n = "";

	// Instance method
	public void test(String n) {
		this.n = n;
	}
}

class InstanceMethodcall {
	
	public static void main(String[] args) {

		// create an instance of the class
		keeks t = new keeks();

		// calling an instance method in the class
		t.test("GeeksforGeeks");
		System.out.println(t.n);
	}
}