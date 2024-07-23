package Programs;
import java.util.Scanner;
public class Program23 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=s.nextInt();
		int num=n;
		for(int i=0; i<n; i++,num--) {
			for(int j=0; j<n; j++) {
				if(j>=i) {
					System.out.print(num+" ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
