package com.startjava.lesson_2.Person;

public class Person {
	String name = "Nikita";
	String gender = "man";
	String country = "Russia";
	byte age = 22;
	float weight = 79.3f;
	short height = 189;

	float move(float moveSpeed) {
		moveSpeed = 10.4f;
		return moveSpeed;
	}

	boolean sit() {
		System.out.println("Вы сидите");
		return true;
	}

	void say(String personSay) {
		System.out.println("Вы сказали:" + personSay);
	}

	float run(float runSpeed) {
		System.out.println("Скорость бега: " + runSpeed);
		return runSpeed;
	}

	boolean dance() {
		boolean isGoodDance = true;
		return isGoodDance;
	}
}