package com.startjava.lesson_2.Game;

import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Game {
	private int endRange = 10;
	private int rand = (int)(Math.random() * endRange) + 1;
	private Scanner in = new Scanner(System.in);
	private Player player1;
	private Player player2;
	private int[] numMass1 = new int[10];
	private int[] numMass2 = new int[10];

	public Game(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void startGame() {
		System.out.println("\nУ каждого игрока 10 попыток!");
		int i = 0;
		while(i != 10) {
			System.out.print("\nПервый игрок вводит число для игры: ");
			player1.setNumber(in.nextInt());
			numMass1[i] = player1.getNumber();
			if (player1.getNumber() < rand) {
				System.out.print("\nУ первого игрока число меньше, чем у компьютера");
			} else if (player1.getNumber() > rand) {
				System.out.print("\nУ первого игрока число больше, чем у компьютера");
			} else if (player1.getNumber() == rand) {
				System.out.print("\nВыиграл " + player1.getName() +  " с "+ (i+1) +"-ой попытки" + ", компьютер загадал число " + rand);
				i++;
				break;
			}
			if(i == 9) {
				System.out.println("\nУ "+ player1.getName() + " закончились попытки");
			}
			System.out.print("\nВторой игрок вводит число для игры: ");
			player2.setNumber(in.nextInt());
			numMass2[i] = player2.getNumber();
			if (player2.getNumber() < rand) {
				System.out.print("\nУ второго игрока число меньше, чем у компьютера");
			} else if (player2.getNumber() > rand) {
				System.out.print("\nУ второго игрока число больше, чем у компьютера");
			} else if (player2.getNumber() == rand) {
				System.out.print("\nВыиграл " + player2.getName() +  " с "+ (i+1) +"-ой попытки" + ", компьютер загадал число " + rand);
				i++;
				break;
			}
			if(i == 9) {
				System.out.println("\nУ "+ player2.getName() + " закончились попытки");
			}
			i++;
		}
		int[] copyNumMass1 = Arrays.copyOf(numMass1, i);
		int[] copyNumMass2 = Arrays.copyOf(numMass2, i);
		player1.setNumMass(copyNumMass1);
		player2.setNumMass(copyNumMass2);
		System.out.println("\nЧисла первого игрока: " + Arrays.toString(player1.getNumMass()));
		System.out.println("\nЧисла второго игрока: " + Arrays.toString(player2.getNumMass()));
		Arrays.fill(player1.getNumMass(), 0, i, 0);
		Arrays.fill(player2.getNumMass(), 0, i, 0);
		System.out.println("\nОбнуленные массивы:");
		System.out.println("\n" + Arrays.toString(player1.getNumMass()));
		System.out.println("\n" + Arrays.toString(player2.getNumMass()));
	}
}