package com.blacksw.numbaseball;

import java.util.Scanner;

public class User {
	private NumberList numberList;

	public User() {
		numberList = new NumberList();
	}

	public void inputNumberList() {
		boolean inputLoop = true;
		while (inputLoop) {
			System.out.print("Input three numbers(Format Ex-> 1 2 3) : ");
			Scanner reader = new Scanner(System.in);
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

	public NumberList getNumberList() {
		return numberList;
	}
}
