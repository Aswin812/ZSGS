package Programs;
import java.util.Scanner;
public class Program9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int input=s.nextInt();
		int output=0;
		while(input>0) {
			output=output*10+input%10;
			input/=10;
		}
		System.out.println("Output : "+output);
	}

}
