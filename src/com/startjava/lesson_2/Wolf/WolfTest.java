package com.startjava.lesson_2.Wolf;

public class WolfTest {
	public static void main(String[] args) {
		Wolf first = new Wolf();
		
		System.out.printf("Волку %d лет", first.getAge());
		System.out.printf("\nВолк %s", first.getGender());
		System.out.printf("\nВолка зовут: %s", first.getName());
		System.out.printf("\nВолк весит %.1f", first.getWeight());
		System.out.printf("\nВолк %s цвета", first.getColor());
		System.out.println("");

		first.setGender("woman");
		first.setName("WildBoy");
		first.setWeight(4.5f);
		first.setAge(10);
		first.setColor("White");
		System.out.println("");

		first.move(9.13f);
		first.sit(false);
		first.run(15.5f);
		first.say("I'AM THE BEAST");
		first.hunting(true);

		System.out.println("\nВывод новых данных с помощью геттера: ");
		System.out.printf("Волку %d лет", first.getAge());
		System.out.printf("\nВолк %s", first.getGender());
		System.out.printf("\nВолка зовут: %s", first.getName());
		System.out.printf("\nВолк весит %.1f", first.getWeight());
		System.out.printf("\nВолк %s цвета", first.getColor());
	}
}