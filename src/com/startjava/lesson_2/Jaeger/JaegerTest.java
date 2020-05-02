package com.startjava.lesson_2.Jaeger;

import java.util.Scanner;

public class JaegerTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите имя робота: ");
		String name = in.next();
		System.out.print("Введите страну робота: ");
		String country = in.next();
		System.out.print("Введите марку робота: ");
	 	String mark = in.next();
	 	System.out.print("Введите вес робота: ");
	 	float weight = in.nextFloat();
	 	System.out.print("Введите высоту робота: ");
		float height = in.nextFloat();
		System.out.print("Введите скорость робота: ");
		float speed = in.nextFloat();
		System.out.print("Введите силу робота: ");
		float strenght = in.nextFloat();
		System.out.print("Введите броню робота: ");
		float armor = in.nextFloat();
		float armor1 = armor;
		Jaeger robOne = new Jaeger(name, country, mark, weight, height, speed, strenght, armor);
		robOne.move();
		robOne.bulletproof();
		robOne.chekRus();
		System.out.print("\nИмпульс робота равен " + robOne.impulse());
		System.out.print("\n");

		System.out.print("Введите имя робота: ");
		name = in.next();
		System.out.print("Введите страну робота: ");
		country = in.next();
		System.out.print("Введите марку робота: ");
	 	mark = in.next();
	 	System.out.print("Введите вес робота: ");
	 	weight = in.nextFloat();
	 	System.out.print("Введите высоту робота: ");
		height = in.nextFloat();
		System.out.print("Введите скорость робота: ");
		speed = in.nextFloat();
		System.out.print("Введите силу робота: ");
		strenght = in.nextFloat();
		System.out.print("Введите броню робота: ");
		armor = in.nextFloat();
		float armor2 = armor;
		Jaeger robTwo = new Jaeger(name, country, mark, weight, height, speed, strenght, armor);
		robTwo.move();
		robTwo.bulletproof();
		robTwo.chekRus();
		System.out.print("\nИмпульс робота равен " + robTwo.impulse());

		System.out.print("\n");
		robTwo.compare(armor1, armor2);
	}
}
