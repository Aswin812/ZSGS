package dungeonGame;

import java.util.Arrays;
import java.util.Scanner;

public class DungeonGame {
	static int repCount=0;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Enter Row : ");
		int row=s.nextInt();
		System.out.println("Enter Col : ");
		int col=s.nextInt();
		char[][] board=new char[row][col];
		for(int i=0; i<row; i++) {
			Arrays.fill(board[i], '_');
		}
		
		System.out.println("Adventure row : ");
		int adRow=s.nextInt();
		System.out.println("Adventure col :");
		int adCol=s.nextInt();
		System.out.println("Gold row : ");
		int gRow=s.nextInt();
		System.out.println("Gold col : ");
		int gCol=s.nextInt();
		
		System.out.println("Enter Number of Pits : ");
		int n=s.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("pit "+(i+1)+" row : ");
			int r=s.nextInt();
			System.out.println("pit "+(i+1)+" col : ");
			int c=s.nextInt();
			board[r][c]='P';
		}
		
		board[adRow][adCol]='A';
		board[gRow][gCol]='G';
		printBoard(board);
		int adventure=findMin(board, adRow, adCol, gRow, gCol, 0);
		
		if(adventure==0)
			System.out.println("No Possible solution");
		else
			System.out.println("Minimum Number of Steps : "+adventure);
			
		printBoard(board);

	}
	static int ind1=-1, ind2=-1;
	public static int findMin(char[][] arr, int  i, int j, int x, int y, int count) {
		repCount++;
		if(repCount>4) {
			repCount=0;
			return 0;
		}
		if(ind1==i&&ind2==j) {
			arr[i][j]='_';
			count--;
			j--;
		}
		else {
			ind1=i;
			ind2=j;
		}
		
		if(i>x) {
			while(i>x) {
				i--;
				if(arr[i][j]=='P') {
					i++;
					break;
				}
				count++;
			}
		}
		if(j<y) {
			while(j<y) {
				j++;
				if(arr[i][j]=='P') {
					j--;
					break;
				}
				count++;
			}
		}
		if(i<x) {
			while(i<x) {
				i++;
				if(arr[i][j]=='P') {
					i--;
					break;
				}
				count++;
			}
		}
		if(j>y) {
			while(j>y) {
				j--;
				if(arr[i][j]=='P') {
					j++;
					break;
				}
				count++;
			}
		}
		if(i!=x||j!=y) {
			findMin(arr, i, j, x, y, count);
		}

		return count;
	}

	public static void printBoard(char[][] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print("|");
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println();
	}

}
