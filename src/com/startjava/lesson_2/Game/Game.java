package com.startjava.lesson_2.Game;

import java.lang.Math;
import java.util.Scanner;

public class Game {
	private int endRange = 100;
	private int rand = (int)(Math.random() * endRange) + 1;
	private Scanner in = new Scanner(System.in);
	private Player player1;
	private Player player2;

	public Game(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void startGame() {
		while(true) {	
			System.out.print("\nПервый игрок вводит число для игры: ");
			player1.setNumber(in.nextInt());
			if(player1.getNumber() < rand) {
				System.out.print("\nУ первого игрока число меньше, чем у компьютера");
			} else if(player1.getNumber() > rand) {
				System.out.print("\nУ первого игрока число больше, чем у компьютера");
			} else if(player1.getNumber() == rand) {
				System.out.print("\nВыиграл " + player1.getName() + " компьютер загадал число " + rand);
				break;
			}
			System.out.print("\nВторой игрок вводит число для игры: ");
			player2.setNumber(in.nextInt());
			if(player2.getNumber() < rand) {
				System.out.print("\nУ второго игрока число меньше, чем у компьютера");
			} else if(player2.getNumber() > rand) {
				System.out.print("\nУ второго игрока число больше, чем у компьютера");
			} else if(player2.getNumber() == rand) {
				System.out.print("\nВыиграл " + player2.getName() + " компьютер загадал число " + rand);
				break;
			}
		}
	}
}