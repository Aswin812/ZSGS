package Programs;

public class Program13 {

	public static void main(String[] args) {
		int[] arr= {7,6,25,43,4,3,82};
		int min=Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i])min=arr[i];
		}
		System.out.println(min);
	}

}
