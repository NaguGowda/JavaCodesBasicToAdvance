package Recheckjava;

public class ArrayBasic {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		
		int s = a.length;
		
		for(int i=0;i<s;i++) { //array = means 7 value storage, 0 has counts
			System.out.println(a[i]++);
		}
	}

}
