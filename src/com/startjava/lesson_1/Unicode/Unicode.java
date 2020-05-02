package com.startjava.lesson_1.Unicode;

public class Unicode {
	public static void main(String[] args) {
		char i = '\u0033';
		while (i != '\u0126') {
			System.out.printf("\nCode = %c", i);
			i++;
		}
	}
}