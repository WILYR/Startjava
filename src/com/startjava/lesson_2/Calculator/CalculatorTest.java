package com.startjava.lesson_2.Calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calcOne = new Calculator();
		Scanner in = new Scanner(System.in);
		String answer;
		String str;
		do {
			System.out.println("Введите выражение: ");
			str = in.next();
			calcOne.takeSymbols(str);
			calcOne.calculate();
			do {
				System.out.print("Хотите продолжить?(yes/no): ");
				answer = in.next();
			} while(!answer.equals("yes") && !answer.equals("no"));
		} while(answer.equals("yes"));
	}
}