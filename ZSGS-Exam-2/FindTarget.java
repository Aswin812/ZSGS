package exam;

import java.util.Scanner;
public class FindTarget {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] arr= {1,2,4,6,7,};
		int n=arr.length;
		System.out.println("Enter Target : ");
		int target=s.nextInt();
		System.out.println("Index : "+check(arr, target));
	}
	
	public static int check(int[] arr, int target) {
		int st=0, end=arr.length-1;
		int mid=0;
		while(st<=end) {
			mid=(st+end)/2;	
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]<target)
				st=mid+1;
			else if(arr[mid]>target)
				end=mid-1;
		}
		return end+1;
	}

}
