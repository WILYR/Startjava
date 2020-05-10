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
    private int attempt = 0;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        System.out.println("\nУ каждого игрока 10 попыток!");
        while (attempt != 10) {
            enterNum(player1);
            if (compareNums(player1)) {
                break;
            }
            if (attempt == 9) {
                System.out.println("\nУ " + player1.getName() + " закончились попытки");
            }
            enterNum(player2);
            if (compareNums(player2)) {
                break;
            }
            if (attempt == 9) {
                System.out.println("\nУ " + player2.getName() + " закончились попытки");
            }
            attempt++;
        }
        int[] copyNumArray1 = Arrays.copyOf(player1.getEnteredNumbers(), attempt);
        int[] copyNumArray2 = Arrays.copyOf(player2.getEnteredNumbers(), attempt);
        showEnteredNums(copyNumArray1, player1);
        showEnteredNums(copyNumArray2, player2);
        setFillNumbers(copyNumArray1, player1);
        setFillNumbers(copyNumArray2, player2);
        System.out.println("\nОбнуленные массивы:");
        showEnteredNums(player1.getEnteredNumbers(), player1);
        showEnteredNums(player2.getEnteredNumbers(), player2);
    }

    public void enterNum(Player player) {
        System.out.print("\n" + player.getName() + " вводит число для игры: ");
        player.setEnteredNumber(in.nextInt(), attempt);
    }

    public boolean compareNums(Player player) {
        boolean isCompareTrue = false;
        if (player.getEnteredNumbers()[attempt] < rand) {
            System.out.print("\nУ " + player.getName() + " число меньше, чем у компьютера");
        } else if (player.getEnteredNumbers()[attempt] > rand) {
            System.out.print("\nУ " + player.getName() + " число больше, чем у компьютера");
        } else if (player.getEnteredNumbers()[attempt] == rand) {
            System.out.print("\nВыиграл " + player.getName() + " с " + (attempt + 1) + "-ой попытки" + ", компьютер загадал число " + rand);
            attempt++;
            isCompareTrue = true;
        }
        return isCompareTrue;
    }

    public void showEnteredNums(int[] nums, Player player) {
        System.out.println("\nЧисла игрока " + player.getName());
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }

    public void setFillNumbers(int[] array, Player player) {
        Arrays.fill(array, 0, attempt, 0);
        for (int j = 0; j < array.length; j++) {
            player.setEnteredNumber(array[j], j);
        }
    }
}
