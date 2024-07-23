package Programs;

import java.util.Arrays;

public class Program19 {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr[0].length; j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}		
		int num=arr.length-1;
		for(int i=0; i<arr.length; i++,num--) {
			for(int j=i; j<arr.length; j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[num][j];
				arr[num][j]=temp;
			}
		}
		
		for(int i=0; i<arr.length; i++)
			System.out.println(Arrays.toString(arr[i]));
	}

}
