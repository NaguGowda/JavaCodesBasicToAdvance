package Recheckjava;

class Beeks {
	// private variable
	private String name;

	public void setName(String name) {

		this.name = name; // accessible within class
	}

	public String getName() {
		return name;
	}
}

public class PrivateMethodaccess {
	public static void main(String[] args) {

		Beeks p = new Beeks();
		p.setName("Nagu");

		// System.out.println(p.name); // Error: 'name'
		// has private access
		System.out.println(p.getName());
	}
}