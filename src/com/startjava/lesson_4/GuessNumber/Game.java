package com.startjava.lesson_4.GuessNumber;

import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Game {
    private int endRange = 100;
    private int rand = (int) (Math.random() * endRange) + 1;
    private Scanner in = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int i = 0;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void enterNum(Player player) {
        player.setEnteredNumber(in.nextInt(), i);
    }

    public boolean compareNums(Player player) {
        boolean isCompareTrue = false;
        if (player.getEnteredNumber(player.getEnteredNumbers(), i) < rand) {
            System.out.print("\nУ первого игрока число меньше, чем у компьютера");
        } else if (player.getEnteredNumber(player.getEnteredNumbers(), i) > rand) {
            System.out.print("\nУ первого игрока число больше, чем у компьютера");
        } else if (player.getEnteredNumber(player.getEnteredNumbers(), i) == rand) {
            System.out.print("\nВыиграл " + player.getName() + " с " + (i + 1) + "-ой попытки" + ", компьютер загадал число " + rand);
            i++;
            isCompareTrue = true;
        }
        return isCompareTrue;
    }

    public void massiveOut(int[] mass) {
        for (int value : mass) {
            System.out.print(value + " ");
        }
        System.out.print("\n");
    }

    public void playerInfo() {
        int[] copyNumMass1 = Arrays.copyOf(player1.getEnteredNumbers(), i);
        int[] copyNumMass2 = Arrays.copyOf(player2.getEnteredNumbers(), i);
        System.out.println("\nЧисла первого игрока: ");
        massiveOut(copyNumMass1);
        System.out.println("\nЧисла второго игрока: ");
        massiveOut(copyNumMass2);
        Arrays.fill(copyNumMass1, 0, i, 0);
        Arrays.fill(copyNumMass2, 0, i, 0);
        System.out.println("\nОбнуленные массивы:");
        massiveOut(copyNumMass1);
        massiveOut(copyNumMass2);
    }

    public void startGame() {
        System.out.println("\nУ каждого игрока 10 попыток!");
        while (i != 10) {
            System.out.print("\nПервый игрок вводит число для игры: ");
            enterNum(player1);
            if (compareNums(player1)) {
                break;
            }
            if (i == 9) {
                System.out.println("\nУ " + player1.getName() + " закончились попытки");
            }
            System.out.print("\nВторой игрок вводит число для игры: ");
            enterNum(player2);
            if (compareNums(player2)) {
                break;
            }
            if (i == 9) {
                System.out.println("\nУ " + player2.getName() + " закончились попытки");
            }
            i++;
        }
        playerInfo();
    }
}