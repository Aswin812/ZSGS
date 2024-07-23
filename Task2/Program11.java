package Programs;
import java.util.Scanner;
public class Program11 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String : ");
		String input=s.nextLine();
		String output="";
		for(int i=0; i<input.length(); i++) {
			if(Character.isAlphabetic(input.charAt(i))) {
				char temp=input.charAt(i);
				int num=0;
				while(i+1<input.length()&&Character.isDigit(input.charAt(i+1))) {
					num=num*10+(input.charAt(++i)-'0');
				}
				for(int j=0; j<num; j++) {
					output+=temp;
				}
			}
		}
		System.out.println(output);
	}

}
