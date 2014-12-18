package virtualChessboard;

public class VirtualChess {
	public enum Chessmen {
		WHITE_KING,
		WHITE_QUEEN,
		WHITE_ROOK,
		WHITE_BISHOP,
		WHITE_KNIGHT,
		WHITE_PAWN,

		BLACK_KING,
		BLACK_QUEEN,
		BLACK_ROOK,
		BLACK_BISHOP,
		BLACK_KNIGHT,
		BLACK_PAWN,

		EMPTY
	}
	public static void main(String[] args) {
		//creating a chessboard matrix, array of size 8x8
		Chessmen[][] chessboard = new Chessmen[8][8]; 

		//nested for loop populate chessboard with pieces and empty spaces
		for (int i = 0; i<8; i++) {
			for (int j = 0; j<8; j++) {

				//if...else...to place pieces in their right place
				if ((i == 0) && ((j == 0)||(j == 7))) {
				chessboard[i][j] = Chessmen.BLACK_ROOK;
				}
				else if ((i == 0) && ((j == 1)||(j == 6))) {
				chessboard[i][j] = Chessmen.BLACK_KNIGHT;	
				}
				else if ((i == 0) && ((j == 2)||(j == 5))) {
				chessboard[i][j] = Chessmen.BLACK_BISHOP;	
				}
				else if ((i == 0) && (j == 3)) {
				chessboard[i][j] = Chessmen.BLACK_QUEEN;	
				}
				else if ((i == 0) && (j == 4)) {
				chessboard[i][j] = Chessmen.BLACK_KING;	
				}
				else if (i == 1) {
				chessboard[i][j] = Chessmen.BLACK_PAWN;	
				}

				else if ((i == 7) && ((j == 0)||(j == 7))) {
				chessboard[i][j] = Chessmen.WHITE_ROOK;
				}
				else if ((i == 7) && ((j == 1)||(j == 6))) {
				chessboard[i][j] = Chessmen.WHITE_KNIGHT;	
				}
				else if ((i == 7) && ((j == 2)||(j == 5))) {
				chessboard[i][j] = Chessmen.WHITE_BISHOP;	
				}
				else if ((i == 7) && (j == 3)) {
				chessboard[i][j] = Chessmen.WHITE_QUEEN;	
				}
				else if ((i == 7) && (j == 4)) {
				chessboard[i][j] = Chessmen.WHITE_KING;	
				}
				else if (i == 6) {
				chessboard[i][j] = Chessmen.WHITE_PAWN;	
				}

				else {
				chessboard[i][j] = Chessmen.EMPTY;	
				}


			}
		}
		printBoard(chessboard);

	}
	public static void printBoard(Chessmen[][] chessboard){
		for (int i = 0; i<8; i++) {
			for (int j = 0; j<8; j++) {
				if ((0 == i)&&(0 == j)) {
					System.out.println("  \ta\tb\tc\td\te\tf\tg\th\t");
				}
				if (0 == j) {
					System.out.print(8 - i + ".\t");
				}
				switch(chessboard[i][j]){
					case BLACK_PAWN: System.out.print("\u265F\t");break;
					case BLACK_KING: System.out.print("\u265A\t");break;
					case BLACK_QUEEN: System.out.print("\u265B\t");break;
					case BLACK_BISHOP: System.out.print("\u265D\t");break;
					case BLACK_KNIGHT: System.out.print("\u265E\t");break;
					case BLACK_ROOK: System.out.print("\u265F\t");break;
					case WHITE_PAWN: System.out.print("\u2659\t");break;
					case WHITE_KING: System.out.print("\u2654\t");break;
					case WHITE_QUEEN: System.out.print("\u2655\t");break;
					case WHITE_BISHOP: System.out.print("\u2657\t");break;
					case WHITE_KNIGHT: System.out.print("\u2658\t");break;
					case WHITE_ROOK: System.out.print("\u2656\t");break;
					case EMPTY: System.out.print(" \t");break;
				}				
			}
			System.out.println(); //change to another line after each column
		}
	}
}
/*
Unicode for chess pieces:
\u2654 WK
\u2655 wQ
\u2656 wR
\u2657 wB
\u2658 wK
\u2659 wP

\u2665A BK
\u2665B bQ
\u2665C bR
\u2665D bB
\u2665E bK
\u2665F bP
*/