package com.startjava.lesson_1.Cycle;

public class Cycle {
	public static void main(String[] args) {
		int finish = 20;
		for (int i = 0; i <= finish; i++) {
			System.out.printf("i = %d\n", i);
		}

		int counter = -6;
		while (counter <= 6) {
			System.out.printf("counter = %d\n", counter);
			counter += 2;
		}
		
		int third = 10;
		int sumOdd = 0;
		do {
			if (third % 2 != 0) {
				// System.out.printf("third = %d\n", sumOdd); - нечетные числа
				sumOdd += third;
			} 
		} while (third++ < 20);
		System.out.printf("Сумма нечетных = %d", sumOdd);
	}
}