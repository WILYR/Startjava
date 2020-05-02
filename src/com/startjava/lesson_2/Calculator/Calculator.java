package com.startjava.lesson_2.Calculator;

public class Calculator {
	private float num1;
	private float num2;
	private String operation;

	public float getNum1() {
		return num1;
	}

	public void setNum1(float num1) {
		this.num1 = num1;
	}

	public float getNum2() {
		return num2;
	}

	public void setNum2(float num2) {
		this.num2 = num2;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public float calculate() {
		float result = 0;
		switch(operation) {
			case "+": 
				result = num1 + num2;
				break;
			case "-": 
				result = num1 - num2;
				break;
			case "*": 
				result = num1 * num2;
				break;
			case "%": 
				result = num1 % num2;
				break;
			case "^": 
				result = num1;
				if (num2 > 0) {
					for(int i = 0; i < (num2 - 1); i++) {
						result *= num1;
					}
				} else if (num2 < 0) {
					for(int i = 0; i > (num2 + 1); i--) {
						result *= num1;
					}
					result = 1/result;
				} else {
					result = 1;
				}
				break;
			case "/":
				result = num1 / num2;
		} 
		return result;
	}
}