package exam;

public class FindMaximumSubarray {

	public static void main(String[] args) {
		int[] arr= {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
		int n=arr.length;
		int k=4;
		int max=Integer.MIN_VALUE;
		int[] tempArr=new int[k];
		for(int i=0; i<k; i++) {
			tempArr[i]=arr[i];
		}
		max=Math.max( max(tempArr), max);
		System.out.print(max+" ");
		int index=0;
		
		for(int i=k; i<n; i++) {// 8 5 10 7
			tempArr[index++]=arr[i];
			max=Math.max(max, max(tempArr));
			System.out.print(max+" ");
			if(index==k)index=0;
		}
		
	}
	
	public static int max(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i])max=arr[i];
		}
		return max;
	}

}
