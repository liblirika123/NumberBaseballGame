package com.blacksw.numbaseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberList {
	private List<Integer> numberList;

	public NumberList() {
		numberList = new ArrayList<Integer>(3);
	}

	public void setNumberList(List<Integer> inputNumberList) {
		this.numberList = inputNumberList;
	}

	public List<Integer> getNumberList() {
		return numberList;
	}

	public int getSize() {
		return numberList.size();
	}

	public void add(int value) {
		validateElement(value);
		numberList.add(value);
	}

	public void clear() {
		numberList.clear();
	}

	public void validateNumberList() {
		if (getSize() != 3)
			throw new NumberListCountException("입력한 숫자 개수가 적절치 않습니다. 다시 입력해주세요.");
	}

	public void validateElement(int value) {
		if (value < 0 || value > 9)
			throw new NumberListFormatException("숫자 범위에 해당하지 않는 입력 값입니다. 다시 입력해주세요.");
	}

	public String toString() {
		return "Number List : " + numberList.toString();
	}
}
