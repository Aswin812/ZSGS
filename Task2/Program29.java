package Programs;
import java.util.Scanner;
public class Program29 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter N : ");
		int n=s.nextInt();
		for(int i=0; i<n; i++) {
			if(i==0||i==n-1) {
				for(int j=0; j<n; j++) {
					System.out.print("*");
				}
			}
			else {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
