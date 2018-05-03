package com.blacksw.numbaseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {
	private NumberList numberList;

	public Computer() {
		numberList = new NumberList();
		numberList.setNumberList(randomList());
	}

	public List<Integer> randomList() {
		Random random = new Random();
		List<Integer> numberList = new ArrayList<Integer>(3);
		for (int i = 0; i < 3; i++) {
			numberList.add(random.nextInt(10));
		}
		return numberList;
	}

	public NumberList getNumberList() {
		return numberList;
	}
}
