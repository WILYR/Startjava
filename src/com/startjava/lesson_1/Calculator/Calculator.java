package com.startjava.lesson_1.Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float num = in.nextFloat();
        //System.out.printf("Первое число: %f \n", num);
        System.out.print("Введите второе число: ");
        float num2 = in.nextFloat();
        //System.out.printf("Второе число: %f \n", num2);T
        System.out.print("Введите операцию(+, -, *, /, ^, %): ");
        String operation = in.next();
        //System.out.printf("Операция: %s \n", operation);
        float answer;
        float counter = num;
        if (operation.equals("+")) {
            answer = num + num2;
            System.out.printf("Ответ: %f \n", answer);
        } else if (operation.equals("-")) {
            answer = num - num2;
            System.out.printf("Ответ: %f \n", answer);
        } else if (operation.equals("/")) {
            answer = num / num2;
            System.out.printf("Ответ: %f \n", answer);
        } else if (operation.equals("*")) {
            answer = num * num2;
            System.out.printf("Ответ: %f \n", answer);
        } else if (operation.equals("^")) {
            if (num2 == 0) {
                System.out.print("Ответ: = 1");
            } else if (num2 > 0) {
                while ((num2 - 1) != 0) {
                    num2--;
                    counter *= num;
                }
                System.out.printf("Ответ: = %f", counter);
            } else if (num2 < 0) {
                while ((num2 + 1) != 0) {
                    num2++;
                    counter *= num;
                }
                System.out.printf("Ответ: %f", 1 / counter);
            }
        } else if (operation.equals("%")) {
            answer = num % num2;
            System.out.printf("Ответ: %f \n", answer);
        }
    }
}