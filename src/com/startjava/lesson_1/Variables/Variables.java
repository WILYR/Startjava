package com.startjava.lesson_1.Variables;

public class Variables {
	public static void main(String[] args) {
		boolean keyboardWork = true;
		byte ramMemory = 4;
		short romMemory = 500;
		int processorCoreAmount = 2;
		float batteryVoltage = 12.894f;
		double processorFrequency = 2.20;
		long batteryCapacity = 37340;
		char vramMemory = '2';
		System.out.printf("Работа клавиатуры = %s;\nОперативная память = %d Гб;", keyboardWork, ramMemory);
		System.out.printf("\nВнутренняя память = %d Гб;\nЧисло ядер процессора = %d;", romMemory, processorCoreAmount);
		System.out.printf("\nНапряжение батареи = %.3f В;\nЧастота процессора = %.3f ГГц;", batteryVoltage, processorFrequency);
		System.out.printf("\nЕмкость батареи = %d мВч;\nВидео память = %c Гб", batteryCapacity, vramMemory);
	}
}