package com.blacksw.numbaseball;

public class Main {
	public static void main(String[] args) {
		User user = new User();
		user.inputNumberList();
		Computer com = new Computer();

		// Compare user number list with com number list
		ScoreBoard scoreBoard = new ScoreBoard();
		scoreBoard.compareTwoNumberLists(user.getNumberList(), com.getNumberList());

		// Compare Result
		System.out.println(scoreBoard.toResult());
	}
}
