package Recheckjava;

public class EnanhcedForLoop {
	public static void main(String[] args) {
		System.out.println("Enhanced Loop");
		
		String a[] = {"cate", "bate", "date", "eate", "fate"}; 
		for (int i = 0; i < a.length; i++) {
			String str = a[i];
			if(str=="date") {
//				break;
				continue;
			}
			System.out.println(str);			
		}
	}

}
