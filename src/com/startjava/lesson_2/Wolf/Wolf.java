package com.startjava.lesson_2.Wolf;

public class Wolf {
	private String gender = "man";
	private String name = "Bearsick";
	private float weight = 24.5f;
	private int age = 6;
	private String color = "Grey";
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if(gender.equals("man") || gender.equals("woman")) {
			this.gender = gender;
			System.out.print("\nВолк теперь " + this.gender);
		} else {
			System.out.print("\nНекорректный ввод пола");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.equals("")) {
			System.out.print("\nНекорректное имя");
		} else {
			this.name = name;
			System.out.print("\nВолка теперь зовут " + this.name);
		}
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		if(weight <= 0.5) {
			System.out.print("\nВы ввели некорректный вес");
		} else {
			this.weight = weight;
			System.out.print("\nВолк теперь весит " + this.weight);
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 8) {
			System.out.print("\nНекорректный возраст");
		} else {
			this.age = age;
			System.out.print("\nВозраст волка теперь " + this.age);
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color.equals("Grey") || color.equals("White") || color.equals("Brown") || color.equals("Black")) {
			this.color = color;
			System.out.print("\nЦвет волка теперь " + this.color);
		} else {
			System.out.print("\nНекорректный цвет волка");
		}
	}

	public float move(float moveSpeed) {
		System.out.printf("\nВолк идет со скоростью: " + moveSpeed);
		return moveSpeed;
	}

	public void sit(boolean isSit) {
		if(isSit) {
			System.out.println("\nВолк сидит");
		} else {
			System.out.println("\nВолк не сидит");
		}
	}

	public float run(float runSpeed) {
		System.out.printf("Волк бежит со скоростью: " + runSpeed);
		return runSpeed;
	}

	public void say(String roar) {
		System.out.println("\nВолк рычит: " + roar);
	}

	public boolean hunting(boolean isHuntSucc) {
		if (isHuntSucc) {
			System.out.println("Волк на охоте");
		} else {
			System.out.println("Волк не на охоте");
		}
		return isHuntSucc;
	}
}