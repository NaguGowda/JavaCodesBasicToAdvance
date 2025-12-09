package Recheckjava;

class PassingArr {
	public void sum(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
			sum += arr[i];
			System.out.println("total is: \n" + sum);
		}

	}

}

public class PassingArrayMethod {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 45, 6, 77 };

		PassingArr s = new PassingArr();
		s.sum(arr1);

	}
}
