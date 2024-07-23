package Programs;
import java.util.ArrayList;
import java.util.Scanner;
public class Program28 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int sum=0;
		int input=s.nextInt();
		for(int i=1; i<=input; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(1);
			}
			if(i!=input)System.out.print("+");
			sum=sum*10+i;
		}
		System.out.println();
		System.out.println("Sum : "+sum);
		ArrayList<Integer> list=new ArrayList<>();
		list.add(3);
		
	}
}
