package com.startjava.lesson_4.GuessNumber;

import java.util.Scanner;

public class GameTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer;
        do {
            System.out.print("\nВведите имя первого игрока: ");
            Player player1 = new Player(in.next());
            System.out.print("\nВведите имя второго игрока: ");
            Player player2 = new Player(in.next());
            Game oneGame = new Game(player1, player2);
            oneGame.startGame();
            do {
                System.out.print("\nХотите продолжить?(yes/no): ");
                answer = in.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (!answer.equals("no"));
    }
}