package programs;

import java.util.*;

public class Program3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name : ");
		String input=s.nextLine();
		String[][] arr= {
				{"Paari", "Karikalan"},
				{"Udhiran", "Sendhan"},
				{"Sendhan", "Arulmozhi"},
				{"Karikalan", "Sendhan"}
				};
		List<String> list=new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i][1].equals(input)) {
				list.add(arr[i][0]);
			}
		}
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(list.contains(arr[i][1]))count++;
		}
		System.out.println(count);
	}

}
