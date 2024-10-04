package Game;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		startGame();
	}
	
	static void startGame() {
		Scanner s=new Scanner(System.in);
		char[][] board=new char[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j]='_';
			}
    }
		char player='X';
		int count=0;
		while(count<9) {
			printBoard(board);
			System.out.println("Player "+player+" : ");
			System.out.println("Enter row : (1-3)");
			int row=s.nextInt()-1;
			System.out.println("Enter column : (1-3)");
			int col=s.nextInt()-1;
			if(row<0||col<0||row>2||col>2||board[row][col]!='_') {
				System.out.println("Enter valid column and row...");
				continue;
			}
			board[row][col]=player;
			count++;
			
			if(isWin(board, player)) {
				printBoard(board);
				System.out.println("Player "+player+" is Win...");
				break;
			}
			else {
				player=player=='X'?'O':'X';
			}
			if(count==9) {
				System.out.println("Match Draw !");
			}
		}
		
		System.out.println("1. Retry  (or)  2. Finish");
		int inp=s.nextInt();
		if(inp==1) startGame();
		System.out.println();
		
	}
	
	static boolean isWin(char[][] board, char player) {
		for(int i=0; i<3; i++) {
			if(check(board, player, 0, i, 1, 0, 3)||check(board, player, i, 0, 0, 1, 3)||check(board, player, i, 0, 1, 1, 3)||check(board, player, 0, i, 1, -1, 3)) {
				return true;
			}
		}
		return false;
	}
	
	static boolean check(char[][] board, char player, int i, int j, int x, int y, int target) {
		if(target==0) return true;
		if(i>=0&&j>=0&&i<3&&j<3&&board[i][j]==player)
			return check(board, player, i+x, j+y, x, y, target-1);
		return false;
	}
	
	static void printBoard(char[][] board) {
		for(int i=0; i<3; i++) {
			System.out.print("| ");
			for(int j=0; j<3; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println();
	}

}
