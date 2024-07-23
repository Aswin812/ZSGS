package Programs;
import java.util.Scanner;
public class Program12 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Character : ");
		char input=s.nextLine().charAt(0);
		if((input>=65&&input<=90)||(input>=97&&input<=122)){
			System.out.println("Enter Character is Alphabet");
		}
		else System.out.println("This character is not Alphabet");
	}

}
