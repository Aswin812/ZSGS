package exam;

public class FindIndexOfString {

	public static void main(String[] args) {
		String str="thistest123string123";
		String s="tring";
		
		System.out.println(indexOf(str, s));		
	}
	
	
	public static int indexOf(String str, String s) {
		int n=str.length();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==s.charAt(0)) {
				int x=0;
				int y=i;
				while(x<s.length()) {
					if(str.charAt(y++)!=s.charAt(x++))break;
				}
				if(x==s.length())return i;
			}
		}
		return -1;
	}

}
