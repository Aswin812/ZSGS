package exam;

import java.util.Arrays;
import java.util.Scanner;
public class ContainsWords {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String  : ");
		String str=s.nextLine();
		System.out.println("Enter Array Length : ");
		int n=s.nextInt();
		s.nextLine();
		String[] arr=new String[n];
		int len=0;
		for(int i=0; i<n; i++) {
			arr[i]=s.nextLine();
			len+=arr[i].length();
		}
		
		String output="";
		n=str.length();
		for(int i=0; i<=n-len; i++) {
			if(sequence(str.substring(i, i+len), arr)) {
				output+=String.valueOf(i)+" ";
			}
		}
		System.out.println(Arrays.toString(output.split(" ")));
	}
	
	public static boolean sequence(String str, String[] arr) {
		for(int i=0; i<arr.length; i++) {
			int index=str.indexOf(arr[i]);
			if(index<0) {
				return false;
			}
			str=str.substring(0,index+1)+str.substring(index+arr[i].length(), str.length());
		}
		return true;
	}

}
