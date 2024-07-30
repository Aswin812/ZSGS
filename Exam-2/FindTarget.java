package exam;

import java.util.Scanner;
public class FindTarget {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array length : ");
		int n=s.nextInt();
		System.out.println();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Enter Target Value : ");
		int target=s.nextInt();
		
		int index=-1;
		for(int i=0; i<n; i++) {
			if(target==arr[i])
				index=i;
			else  if(target<arr[i]) {
				index=i;
				break;
			}
		}
		if(index==-1)index=n;
		System.out.println("Output : "+index);
	}

}
