package exam;

import java.util.Scanner;
public class IntegerToRoman {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] arr=new int[26];
		arr['I'-'A']=1;
		arr['V'-'A']=5;
		arr['X'-'A']=10;
		arr['L'-'A']=50;
		arr['C'-'A']=100;
		arr['D'-'A']=500;
		arr['M'-'A']=1000;
		
		System.out.println("Enter Input : ");
		String input=s.nextLine();
		int result=0;
		
		for(int i=0; i<input.length(); i++) {
			result+=arr[input.charAt(i)-'A'];
			if(i>0&&arr[input.charAt(i-1)-'A']<arr[input.charAt(i)-'A']) {
				result-=arr[input.charAt(i-1)-'A'];
				i++;
			}
		}
		System.out.println(result);
		
	}

}
