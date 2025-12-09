package Recheckjava;


class Passcheck{
	private String name;
	private String color;
	public void cars(String name, String color) {
		this.name = name;
		this.color =color;
	}
	public void getDetails(String name, String color) {
//		return name;
		System.out.println(name+" and "+color);
	}
}
public class Practice {
	public static void main(String[] args) {
		
		Passcheck k = new Passcheck();
		
		k.getDetails("Hi", "Nagu");
//		System.out.println(); if we use return type should be string for get details method
	}
}


