package com.startjava.lesson_4.GuessNumber;

public class Player {
    private String name;
    private int number;
    private int[] enteredNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int[] getEnteredNumbers() {
        return enteredNumbers;
    }

    public void setEnteredNumbers(int number, int i) {
        enteredNumbers[i] = number;
    }
}