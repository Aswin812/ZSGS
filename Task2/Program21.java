package Programs;
import java.util.Scanner;
public class Program21 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=s.nextInt();
		int num=(n+n)-1;
		for(int i=0; i<n; i++,num-=2) {
			int in=n-i;
			boolean flag=false;
				for(int j=0; j<n+n; j++) {
					if(j>=num) {
						System.out.print(in++ +" ");
					}
					else {
						System.out.print(" ");
					}
					if(in>n)flag=true;
					if(flag)in-=2;
				}
			System.out.println();
		}
	}

}
