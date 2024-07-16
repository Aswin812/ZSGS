package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Rows : ");
		int row=s.nextInt();
		System.out.println("Enter Cols : ");
		int col=s.nextInt();
		int[][] arr=new int[row][col];
		int count=1;
		boolean flag=true;
		int i=0, j=col-1;
		while(count<=(row*col)&&i<row&&j<col) {			
			if(flag) {
				arr[i][j]=count++;
				if(i==row-1&&j!=0) {
					arr[i][j-1]=count++;
					flag=false;
					j-=2;
					i--;
					if(j<0)j=0;
				}
				else if(j==col-1&&i!=row-1) {
					arr[i+1][j]=count++;
					flag=false;
					j--;
				}
				else {
					i++;
					j++;
				}
			}
			else {
				arr[i][j]=count++;
				if(j==0&&i!=row-1) {
					arr[i+1][j]=count++;
					flag=true;
					i+=2;
					j++;
					if(i>=row)i=row-1;
				}
				else if(i==0&&j!=0){
					arr[i][j-1]=count++;
					flag=true;
					i++;
				}
				else {
					j--;
					i--;
				}
			}
		}
		for(int k=0; k<arr.length;k++) {
			System.out.println(Arrays.toString(arr[k]));
		}
		
	}

}
