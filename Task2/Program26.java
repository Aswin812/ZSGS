package Programs;
import java.util.Scanner;
public class Program26 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=s.nextInt();
		n=n*2;
		int num1=n/2;
		int num2=n/2;
		for(int i=0; i<n-1; i++, num1--,num2++) {
			for(int j=0; j<n; j++) {
				if((i>0&&i<n-2)&&(j>=num1&&j<=n/2)||(j>n/2&&j<num2)) {
					System.out.print("_");
				}
				else System.out.print("*");
			}
			if(i>=(n/2)-1) {
				num1+=2;
				num2-=2;
			}
			System.out.println();
		}
	}

}
