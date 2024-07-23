package Programs;

import java.util.Arrays;

public class Program14 {

	public static void main(String[] args) {
		int[] arr= {5,7,4,8,3,9,6,3,3,4};
		int[] output=new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			output[i]=arr[i];
		}
		System.out.println(Arrays.toString(output));
	}

}
