package Programs;

import java.util.Arrays;

public class Program16 {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,5,8};
		int[] arr2= {2,4,5,6,7,8,9};
		int[] arr=new int[arr1.length+arr2.length];
		int index=0;
		int i=0, j=0;
		while(i<arr1.length&&j<arr2.length) {
			if(arr1[i]==arr2[j]) {
				arr[index++]=arr1[i++];
				j++;
			}
			else if(arr1[i]>arr2[j])arr[index++]=arr2[j++];
			else if(arr1[i]<arr2[j])arr[index++]=arr1[i++];
		}
		while(i<arr1.length) arr[index++]=arr1[i++];
		while(j<arr2.length) arr[index++]=arr2[j++];
		
		System.out.println(Arrays.toString(arr));
	}

}
