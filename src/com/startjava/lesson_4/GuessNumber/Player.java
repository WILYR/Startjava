package com.startjava.lesson_4.GuessNumber;

public class Player {
    private String name;
    private int[] enteredNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNumbers() {
        return enteredNumbers;
    }

    public void setEnteredNumber(int number, int i) {
        enteredNumbers[i] = number;
    }
//    public int getLastNumber(int[] array) {
//        return array[array.length - 1];
//    }

//    public int getCurrentNumber(int[] array, int i) {
//        return array[i];
//    }
}