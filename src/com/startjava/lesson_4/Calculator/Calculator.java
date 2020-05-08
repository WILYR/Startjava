package com.startjava.lesson_4.Calculator;

import java.lang.Math;

public class Calculator {
    private String str;
    private char operation = '0';
    private String[] arrOf;

    public void takeSymbols(String str) {
        for (int j = 0; j < str.length(); j++) {
            operation = str.charAt(j);
            if (operation == '+' || operation == '-' || operation == '/' || operation == '*' || operation == '^' || operation == '%') {
                break;
            } else {
                operation = '0';
            }
        }
        arrOf = str.split("[+\\-*/^%]");
    }

    public void calculate() {
        float result;
        switch (operation) {
            case '+':
                result = Float.parseFloat(arrOf[0]) + Float.parseFloat(arrOf[1]);
                System.out.println("Ответ: " + result);
                break;
            case '-':
                result = Float.parseFloat(arrOf[0]) - Float.parseFloat(arrOf[1]);
                System.out.println("Ответ: " + result);
                break;
            case '*':
                result = Float.parseFloat(arrOf[0]) * Float.parseFloat(arrOf[1]);
                System.out.println("Ответ: " + result);
                break;
            case '%':
                result = Float.parseFloat(arrOf[0]) % Float.parseFloat(arrOf[1]);
                System.out.println("Ответ: " + result);
                break;
            case '^':
                result = (float) Math.pow(Float.parseFloat(arrOf[0]), Float.parseFloat(arrOf[1]));
                System.out.println("Ответ: " + result);
                break;
            case '/':
                result = Float.parseFloat(arrOf[0]) / Float.parseFloat(arrOf[1]);
                System.out.println("Ответ: " + result);
                break;
            case '0':
                System.out.println("Вы ввели некорректное выражение");
        }
    }
}