package exam;

import java.util.Arrays;

public class OccurrenceOfZero {

	public static void main(String[] args) {
		int[] arr= {1,0,3,4,5,0,7,0,0,8,9,8,9};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				shift(arr, i);
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void shift(int[] arr, int ind) {
		int num=0;
		
		for(int i=ind+1; i<arr.length; i++) {
			int temp=arr[i];
			arr[i]=num;
			num=temp;
		}
		
	}

}
