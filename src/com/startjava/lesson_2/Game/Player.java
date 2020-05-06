package com.startjava.lesson_2.Game;

public class Player {
	private String name;
	private int number;
	private int[] numMass;

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

	public int[] getNumMass() {
		return numMass;
	}

	public void setNumMass(int[] numMass) {
		this.numMass = numMass;
	}
}