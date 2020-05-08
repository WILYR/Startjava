package com.startjava.lesson_4.Calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calcOne = new Calculator();
        Scanner in = new Scanner(System.in);
        String answer;
        String mathExpression;
        do {
            System.out.println("Введите выражение: ");
            mathExpression = in.next();
            calcOne.takeSymbols(mathExpression);
            calcOne.calculate();
            do {
                System.out.print("Хотите продолжить?(yes/no): ");
                answer = in.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}