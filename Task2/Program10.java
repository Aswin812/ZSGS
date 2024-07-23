package Programs;
import java.util.Scanner;
public class Program10 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String : ");
		String input=s.nextLine();
		System.out.println(reverse(input.split(" "), 0));
		
	}
	
	public static String reverse(String[] arr, int i) {
		if(i==arr.length)return "";
		return reverse(arr, i+1)+arr[i]+" ";
	}

}
