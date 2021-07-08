
/*******************************************************
 * Purpose : Creating Board for Tic Tac Toe Game Program
 * @author Ganesh Gavhad
 *******************************************************/
package com.bridgelabz;

public class TicTacToeGame {

	public static char[] board = new char[10];

	public static void main(String[] args) {
		System.out.println("Welcome Tic Tac Toe Game");
		createBoard();
	}

	/**
	 * @boardOfGame is a method for creating board using array
	 */
	public static void createBoard() {
		for (int index = 1; index < board.length; index++) {

			board[index] = ' ';

			System.out.println(board);

		}
	}
}