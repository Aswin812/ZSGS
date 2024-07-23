package Programs;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number 1 : ");
		int a=s.nextInt();
		System.out.println("Enter Number 2 : ");
		int b=s.nextInt();
		
		System.out.println("Bitwise AND Operator : "+(a&b));
		System.out.println("Bitwise OR Operator : "+(a|b));
		System.out.println("Bitwise XOR Operator : "+(a^b));
		System.out.println("Bitwise Operator : "+(~a));
	}

}
