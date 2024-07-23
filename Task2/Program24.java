package Programs;
import java.util.Scanner;
public class Program24 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=s.nextInt();
		int num=n/2;
		int a=1;
		for(int i=1; i<=n/2; i++,num--) {
			for(int j=1; j<=n/2; j++) {
				if(j>=num) {
					System.out.print(a+++" ");
				}
				else System.out.print(" ");
			}
			System.out.println();
			if(a>=n)break;
		}

	}

}
