package com.startjava.lesson_2.Jaeger;

public class Jaeger {
	private String name;
	private String country;
	private String mark;
	private float weight;
	private float height;
	private float speed;
	private float strenght;
	private float armor;

	public Jaeger(String name, String country, String mark, float weight, float height, float speed, float strenght, float armor) {
		this.name = name;
		this.country = country;
		this.mark = mark;
		this.weight = weight;
		this.height = height;
		this.speed = speed;
		this.strenght = strenght;
		this.armor = armor;
	}

	public void move() {
		if(speed > 0 && speed < 10) {
			System.out.print("Робот " + name + " идет");
		} else if (speed > 10) {
			System.out.print("Робот " + name + " бежит");
		} if (speed == 0) {
			System.out.print("Робот " + name + " стоит");
		}
	}

	public void bulletproof() {
		if(armor > 10) {
			System.out.print("\nРобот " + name + " защищен от пуль");
		} else {
			System.out.print("\nРобот " + name + " не защищен от пуль");
		}
	}

	public void chekRus() {
		if(country.equals("Russia")) {
			System.out.print("\nРобот российского производства");
		} else {
			System.out.print("\nРобот не российский! Он из " + country);
		}
	}

	public float impulse() {
		return speed * weight;
	}

	public void compare(float armor1, float armor2) {
			if(armor1 == armor2) {
				System.out.print("\nУ роботов одинаковая броня!");
			} else if(armor1 > armor2) {
				System.out.print("\nУ первого робота броня больше, чем у второго");
			} else {
				System.out.print("\nУ второго робота броня больше, чем у первого");
			}
	}
}