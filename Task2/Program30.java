package Programs;
import java.util.Arrays;
public class Program30 {
	public static void main(String[] args) {
		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		int n=matrix.length;
		int[][] arr=new int[n+(n-1)][];
		int index=0;
		boolean flag=false;
		int i=0;
		int count=0;
		while(count<n*n) {
			int[] temp=new int[i+1];
			int ind=0;
			int j=i, k=0;
			if(flag) {
				k=(n-i)-1;
				j=n-1;
			}
			while(j>=0&&k<n) {
				count++;
				temp[ind++]=matrix[k++][j--];
			}
			arr[index++]=temp;
			if(i==n-1) flag=true;
			if(flag) i-=2;
			i++;
		}
		for(int l=0; l<arr.length; l++)
			System.out.println(Arrays.toString(arr[l]));
			
	}
}


