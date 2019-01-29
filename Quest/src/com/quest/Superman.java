package com.quest;

public class Superman extends Person {
	private int speed;

	public Superman(int speed, String name) {
		super(name);
	}
	
	public void sayName() {
		System.out.println("My name is "+ name+ "I'm a " + speed);
		System.out.println();
	}
	public void increaseSpeed(int useSpeed) {
		speed = useSpeed;
	}
	public int decreaseSpeed() {
		return speed;
	}
}
