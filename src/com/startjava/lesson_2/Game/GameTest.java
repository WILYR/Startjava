package com.startjava.lesson_2.Game;

import java.util.Scanner;

public class GameTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String answer;
		do {
			System.out.print("\nВведите имя первого игрока: ");
			String name1 = in.next();
			Player player1 = new Player(name1);
			System.out.print("\nВведите имя второго игрока: ");
			String name2 = in.next();
			Player player2 = new Player(name2);
			Game oneGame = new Game(player1, player2);
			oneGame.startGame();
			do {
				System.out.print("\nХотите продолжить?(yes/no): ");
				answer = in.next();
			} while(!answer.equals("yes") && !answer.equals("no"));
		} while(!answer.equals("no"));

	}
}