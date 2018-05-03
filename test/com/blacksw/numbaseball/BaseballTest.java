package com.blacksw.numbaseball;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class BaseballTest {
	@Test
	public void testReturnCountOfRandomNumberListElements() {
		Computer computer = new Computer();
		assertEquals(3, computer.getNumberList().getSize());
	}

	@Test
	public void testCompareTwoNumberLists() {
		NumberList comList = new NumberList();
		NumberList userList = new NumberList();
		comList.setNumberList(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
		userList.setNumberList(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));

		ScoreBoard scoreResult = new ScoreBoard();
		scoreResult.compareTwoNumberLists(userList, comList);
		assertEquals("Strike : 3, Ball : 0, Out : 0", scoreResult.toResult());
	}

	@Test
	public void testNumberListInput() {
		User user = new User();
		NumberList numberList = user.getNumberList();

		boolean inputLoop = true;
		while (inputLoop) {
			System.out.print("Input three numbers(Format Ex-> 1 2 3) : ");
			Scanner reader = new Scanner("1 2 3");
			String[] split = reader.nextLine().split(" ");

			try {
				numberList.clear();
				for (String element : split) {
					if (!element.equals(""))
						numberList.add(Integer.valueOf(element));
				}
				numberList.validateNumberList();
				inputLoop = false;
			} catch (NumberFormatException e) {
				System.out.println("문자는 불가능한 입력 값입니다. 다시 입력해주세요.");
			} catch (NumberListFormatException e) {
				System.out.println(e.getMessage());
			} catch (NumberListCountException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
