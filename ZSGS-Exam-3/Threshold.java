package exam;

import java.util.Scanner;
public class Threshold {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] arr= {5,8,10,13,6,2};
		int n=arr.length;
		System.out.println("Enter Threshold : ");
		int threshold=s.nextInt();
		int count=0;
		for(int i=0; i<n; i++) {
			count+=arr[i]/threshold;
			if(arr[i]%threshold!=0)count++;
		}
		System.out.println("Count : "+count);
		
	}

}
