package com.startjava.lesson_2.Calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calcOne = new Calculator();
		Scanner in = new Scanner(System.in);
		String answer;
		do {
			System.out.print("Введите первое число: ");
			float firstNumber = in.nextFloat();
			calcOne.setNum1(firstNumber);
			//System.out.print("Вы ввели число: " + calcOne.getNum1());
			System.out.print("Введите второе число: ");
			float secondNumber = in.nextFloat();
			calcOne.setNum2(secondNumber);
			//System.out.print("Вы ввели число: " + calcOne.getNum2());
			System.out.print("Введите операцию: ");
			String addOperation = in.next();
			calcOne.setOperation(addOperation);
			String a = calcOne.getOperation();
			while(!a.equals("+") && !a.equals("-") && !a.equals("%") && !a.equals("*") && !a.equals("^") && !a.equals("/")) {
				if (a.equals("End")) {
					System.out.print("Работа программы закончена");
					return;
				} else {
					System.out.print("Введите корректную операцию (End для выхода): ");
					calcOne.setOperation(in.next());
					a = calcOne.getOperation();
				}
			} 
			System.out.println("Ответ: " + calcOne.calculate());
			do {
				System.out.print("Хотите продолжить?(yes/no): ");
				answer = in.next();
			} while(!answer.equals("yes") && !answer.equals("no"));
		} while(answer.equals("yes"));
	}
}