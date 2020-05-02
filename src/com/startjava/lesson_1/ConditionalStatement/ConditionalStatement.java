package com.startjava.lesson_1.ConditionalStatement;

public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 40;
		char gender = 'w';
		double height = 2.80;
		char firstLetterName = 'h';

		if(age > 20) {
			System.out.printf("Ваш возраст больше 20 и он равен %d", age);
		}

		if(gender == 'm') {
			System.out.printf("\nВы мужчина");
		}

		if(gender != 'm') {
			System.out.printf("\nВы не мужчина");
		}

		if(height < 1.80) {
			System.out.printf("\nВаш рост меньше 1.80 и равен %.2f", height);
		} else {
			System.out.printf("\nВаш рост не меньше 1.80 и равен %.2f", height);
		}

		if(firstLetterName == 'M') {
			System.out.printf("\nПервая буква в вашем имени %s", firstLetterName);
		} else if(firstLetterName == 'I') {
			System.out.printf("\nПервая буква в вашем имени %s", firstLetterName);
		} else {
			System.out.printf("\nПервая буква в вашем имени не M и не I");
		}
	} 
}