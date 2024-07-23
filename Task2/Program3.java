package Programs;
import java.util.Arrays;
import java.util.Scanner;
public class Program3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number of Student : ");
		int input=s.nextInt();
		int num=101;
		int[][] arr=new int[input/5][5];
		for(int i=0; i<arr[0].length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[j][i]=num++;
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}

}
