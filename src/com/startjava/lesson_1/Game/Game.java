package com.startjava.lesson_1.Game;

import java.util.Scanner;
import java.lang.Math;

public class Game {
	public static void main(String[] args) {
		int end = 100;
		Scanner in = new Scanner(System.in);
		int rand = (int)(Math.random() * end);
		//System.out.printf("Rand  = %d ", rand);
		System.out.print("Компьютер сгенерировал число");
		System.out.print("\nВведите число для игры: ");
		int userNumber = in.nextInt();
		while(userNumber != rand) {	
			if(userNumber < rand) {
				System.out.print("Ваше число меньше, чем у компьютера");
				System.out.print("\nВведите другое число для игры: ");
				userNumber = in.nextInt();
			} else if(userNumber > rand) {
				System.out.print("Ваше число больше, чем у компьютера");
				System.out.print("\nВведите другое число для игры: ");
				userNumber = in.nextInt();
			}
		}
		System.out.printf("Вы победили, копьютер загадал число %d", rand);
	}
}