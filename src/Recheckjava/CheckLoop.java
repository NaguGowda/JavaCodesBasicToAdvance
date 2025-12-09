package Recheckjava;

public class CheckLoop {
	public static void main(String[] args) {
		System.out.println("looping check");
		int L=10;
		
		for (int i = 0; i < L; i++) {
			if(i==8) {
				i++;
			}
			System.out.println(i);
			
		}
	}

}
