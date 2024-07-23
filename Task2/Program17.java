package Programs;

import java.util.Arrays;

public class Program17 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(i%2==0&&arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				else if(i%2!=0&&arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
