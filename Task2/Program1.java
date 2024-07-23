package Programs;
import java.util.Scanner;
public class Program1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Letter : ");
		char input=s.nextLine().charAt(0);
		for(int i=input; i<='Z'; i++) {
			System.out.print(input++);
		}
	}
}
