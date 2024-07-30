package exam;

import java.util.*;
public class GnerateParentheses {
	static String str1="";
	static String str2="";
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n : ");
		int n=s.nextInt();
		for(int i=0; i<n; i++) {
			str1+="()";
			str2="("+str2+")";
		}
		String output=str1+" "+str2+" ";
		while(true) {
			String temp=generate(str1, output);
			output+=temp+" ";
			if(temp.length()==0)break;
			
		}
		while(true) {
			String temp=generate(str2, output);
			output+=temp+" ";
			if(temp.length()==0)break;
			
		}
		System.out.println(output);
	}
	
	public static String generate(String str, String output) {
		int n=str.length(); 
		String temp=str.substring(0,1)+str.substring(n-1,n)+str.substring(1, n-1);
		if(temp.equals(str1)) {
			return "";
		}
		if(valid(temp)) {
			str1=temp;
			return temp;
		}
		return "";
	}
	
	public static boolean valid(String str) {
		List<Character> list=new ArrayList<>();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='(')list.add(str.charAt(i));
			else if(str.charAt(i)==')'){
				if(list.size()>0)
					list.remove(list.size()-1);
			}
		}
		return list.isEmpty();
	}

}
