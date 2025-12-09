package com.interfaces;

interface CheckInterf {
	
	static int Speed =0;
	
	public void changeGear(int a);
	public void speedup(int a);
	public void speeddown(int a);

}

class motoGP implements CheckInterf{
	int speed;
	int gear;
	int down;
	
	public void changeGear(int newgear) {
		gear=newgear;
	}
	
	public void speedup(int uppp) {
		speed +=uppp;
	}
	
	public void speeddown(int downn) {
		down -=downn;
	}
	
	void statuss() {
		System.out.println("current gear is " + gear + " ,with speed of " + speed + " pls make speed " + down);
	}
}

class CheckInterface{
	public static void main(String[] args) {
		motoGP MM=new motoGP();
		
		MM.changeGear(1);
		MM.speedup(3);
		MM.speeddown(2);
		
		
		System.out.println("gear current status is :");
		MM.statuss();
		
		
	}
}
