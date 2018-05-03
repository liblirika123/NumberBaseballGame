package com.blacksw.numbaseball;

import java.util.Scanner;

import org.junit.Test;

public class ScannerTest {
	@Test
	public void testInputFormat() {
		Scanner sc = new Scanner("a b c d exit");
		int count = 0;
		while (sc.hasNext()) {
			String word = sc.next();
			System.out.println(word);
			count++;
			if (word.equals("exit")) {
				break;
			}
		}
		System.out.println("단어 개수 = " + count);
	}

	@Test
	public void testNumberListInput() {
		User user = new User();
		NumberList numberList = user.getNumberList();

		boolean inputLoop = true;
		while (inputLoop) {
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
