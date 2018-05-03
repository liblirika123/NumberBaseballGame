package com.blacksw.numbaseball;

import java.util.List;
import java.util.Iterator;

public class ScoreBoard {
	private int strikes;
	private int balls;
	private int outs;

	public ScoreBoard() {
		init();
	}

	public void init() {
		strikes = 0;
		balls = 0;
		outs = 0;
	}

	public void compareTwoNumberLists(NumberList user, NumberList com) {
		List<Integer> userList = user.getNumberList();
		List<Integer> comList = com.getNumberList();
		for (Iterator<Integer> i = userList.iterator(); i.hasNext();) {
			int num = i.next();
			if (comList.contains(num)) {
				if (comList.indexOf(num) == userList.indexOf(num))
					strikes++;
				else
					balls++;
			} else {
				outs++;
			}
		}
	}

	public String toResult() {
		return "Strike : " + strikes + ", Ball : " + balls + ", Out : " + outs;
	}

}
