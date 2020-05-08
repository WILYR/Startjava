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

    public void setNum(Player player) {
        player.setNumber(in.nextInt());
        player.setEnteredNumbers(player.getNumber(), i);
    }

    public boolean checkNum(Player player) {
        boolean b = false;
        if (player.getNumber() < rand) {
            System.out.print("\nУ первого игрока число меньше, чем у компьютера");
        } else if (player.getNumber() > rand) {
            System.out.print("\nУ первого игрока число больше, чем у компьютера");
        } else if (player.getNumber() == rand) {
            System.out.print("\nВыиграл " + player.getName() + " с " + (i + 1) + "-ой попытки" + ", компьютер загадал число " + rand);
            i++;
            b = true;
        }
        return b;
    }

    public void startGame() {
        System.out.println("\nУ каждого игрока 10 попыток!");
        while (i != 10) {
            System.out.print("\nПервый игрок вводит число для игры: ");
            setNum(player1);
            if (checkNum(player1)) {
                break;
            }
            if (i == 9) {
                System.out.println("\nУ " + player1.getName() + " закончились попытки");
            }
            System.out.print("\nВторой игрок вводит число для игры: ");
            setNum(player2);
            if (checkNum(player2)) {
                break;
            }
            if (i == 9) {
                System.out.println("\nУ " + player2.getName() + " закончились попытки");
            }
            i++;
        }
    }

    public void playerInfo() {
        int[] copyNumMass1 = Arrays.copyOf(player1.getEnteredNumbers(), i);
        int[] copyNumMass2 = Arrays.copyOf(player2.getEnteredNumbers(), i);
        System.out.println("\nЧисла первого игрока: " + Arrays.toString(copyNumMass1));
        System.out.println("\nЧисла второго игрока: " + Arrays.toString(copyNumMass2));
        Arrays.fill(copyNumMass1, 0, i, 0);
        Arrays.fill(copyNumMass2, 0, i, 0);
        System.out.println("\nОбнуленные массивы:");
        System.out.println("\n" + Arrays.toString(copyNumMass1));
        System.out.println("\n" + Arrays.toString(copyNumMass2));
    }
}