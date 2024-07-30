package exam;

import java.util.Scanner;
public class CountSequence {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Input : ");
		String input=s.nextLine();
		
		int i=0, j=0;
		int count=0;
		String output="";
		while(i<input.length()&&j<input.length()) {
			if(input.charAt(i)==input.charAt(j)) {
				count++;
			}
			else {
				i=j;
				j--;
				output+=String.valueOf(count)+String.valueOf(input.charAt(j));
				count=0;
			}
			j++;
			if(j==input.length()) {
				output+=String.valueOf(count)+String.valueOf(input.charAt(j-1));
			}
		}
		System.out.println("Output : "+output);
	}

}
