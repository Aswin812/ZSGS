package Programs;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter coefficient a: ");
		double a=sc.nextDouble();

		System.out.println("Enter coefficient b: ");
		double b=sc.nextDouble();

		System.out.println("Enter coefficient c: ");
		double c=sc.nextDouble();

		double d=b*b-4*a*c;

		if(d>0) {
			double root1=(-b+Math.sqrt(d))/(2*a);
			double root2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("Roots are : "+root1+" "+root2);
		}else if(d==0) {
			double root=-b/(2*a);
			System.out.println("Root is "+root);
		}else {
			double realPart=-b/(2*a);
			double imaginaryPart=Math.sqrt(-d)/(2*a);
			System.out.println(realPart+"+"+imaginaryPart+" "+realPart+"-"+imaginaryPart);
		}

	}

}