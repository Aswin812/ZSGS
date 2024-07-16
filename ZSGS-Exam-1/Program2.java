package programs;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		String[] once= {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] tens= {"ten", "twenty", "thirty", "fourty", "fivty", "sixty", "seventy", "eighty", "ninty"};
		String output="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number : ");
		String input=s.nextLine();
		if(input.length()==1) {
			output=once[Integer.parseInt(input)-1];
		}
		else {
			int len=1;
			for(int i=input.length()-1; i>=0; i--) {
				if(len==1) {
					if(input.charAt(i)=='0') {
						len++;
						continue;
					}
					output=once[(input.charAt(i)-'0')-1]+output;
					len++;
				}
				else if(len==2) {
					if(input.charAt(i)=='0') {
						len++;
						continue;
					}
					output=tens[(input.charAt(i)-'0')-1]+output;
					len++;
				}
				else if(len==3) {
					if(input.charAt(i)=='0') {
						len++;
						continue;
					}
					if(output.length()>1)output=" and"+output;
					output=once[(input.charAt(i)-'0')-1]+"hundred "+output;
					len++;
				}
				else if(len==4) {
					if(input.charAt(i)=='0') {
						len++;
						continue;
					}
					output=once[(input.charAt(i)-'0')-1]+"thousand "+output;
					len++;
				}
				else if(len==5) {
					if(input.charAt(i)=='0') {
						len++;
						continue;
					}
					output=tens[(input.charAt(i)-'0')-1]+"thousand "+output;
					len++;
				}
				else if(len==6) {
					if(input.charAt(i)=='0') {
						len++;
						continue;
					}
					output=once[(input.charAt(i)-'0')-1]+"lakh "+output;
					len++;
				}
				else if(len==7) {
					if(input.charAt(i)=='0') {
						len++;
						continue;
					}
					output=tens[(input.charAt(i)-'0')-1]+"lakh "+output;
					len++;
				}
				else if(len==8) {
					if(input.charAt(i)=='0') {
						len++;
						continue;
					}
					output=once[(input.charAt(i)-'0')-1]+"crore "+output;
					len++;
				}
				else if(len==9) {
					if(input.charAt(i)=='0') {
						len++;
						continue;
					}
					output=tens[(input.charAt(i)-'0')-1]+"crore "+output;
					len++;
				}
//				output.trim();
				output=" "+output;
			}
		}
		System.out.println(output.trim());
	}

}
