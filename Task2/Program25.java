package Programs;
import java.util.Scanner;
public class Program25 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number  : ");
		int n=s.nextInt();
		int num=n;
		for(int i=1; i<=n; i++,num--) {
			for(int j=1; j<=n; j++) {
				if(i==j||j==num) {
					System.out.print(i);
				}
				else System.out.print(" ");
			}
			System.out.println();
		}

	}

}
