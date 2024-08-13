package exam;

public class Pairs {

	public static void main(String[] args) {
		int[] arr= {2,3,4,5,2,4,5};
		int num=0;
		for(int i=0; i<arr.length; i++) {
			num^=arr[i];
		}
		
		if(num==0) {
			System.out.println("True");
		}
		else
			System.out.println("False");
	}

}
