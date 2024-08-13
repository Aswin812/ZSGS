package exam;

import java.util.Scanner;
public class AddTwoNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int num1=12233;
		int num2=13;
		System.out.println("Enter Base Value : ");
		int base=s.nextInt();
		
		String result="";
		int carry=0;
		while(num1>0||num2>0) {
			int temp1=num1%10;
			int temp2=num2%10;
			num1/=10;
			num2/=10;
			int sum=temp1+temp2+carry;
			if(sum>base) {
				result=String.valueOf(sum-base)+result;
				carry=1;
			}
			else if(sum<base) {
				result=String.valueOf(sum)+result;
				carry=0;
			}
			else if(sum==base|| sum==0) {
				result=String.valueOf(0)+result;
				if(sum!=0)carry=1;
			}
			else if(temp1>0&&temp1<base) {
				result=String.valueOf(temp1+carry)+result;
				carry=0;
			}
			else if(temp2>0&&temp2<base) {
				result=String.valueOf(temp2+carry)+result;
				carry=0;
			}
		}
		if(carry==1)result=""+carry+result;
		System.out.println(result);
	}

}
