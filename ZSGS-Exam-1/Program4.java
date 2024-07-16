package programs;

import java.util.Arrays;

public class Program4 {

	public static void main(String[] args) {
		int[] arr= {10,12,13,23,35};
		int n=arr.length;
		int[] dis=new int[n];
		for(int i=0; i<n; i++) {
			dis[i]=distance(arr[i]);
		}
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(dis[i]>dis[j]) {
					int temp1=dis[i];
					dis[i]=dis[j];
					dis[j]=temp1;
					
					int temp2=arr[i];
					arr[i]=arr[j];
					arr[j]=temp2;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static int distance(int num) {
		int left=num-1;
		int right=num+1;
		if(prime(num)) {
			return 0;
		}
		while(true) {
			if(prime(left)) {
				return num-left;
			}
			else if(prime(right)) {
				return right-num;
			}
			else {
				left--;
				right++;
			}
		}
		
	}
	public static boolean prime(int num) {
		for(int i=2; i<=9; i++) {
			if(num%i==0&&i!=num)return false;
		}
		return true;
	}

}
