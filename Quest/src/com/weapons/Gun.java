package com.weapons;

public class Gun extends Strength {
	private int bullets;
	private int shoots;

	public Gun(int strength) {
		super(strength);
	}
	public void sayName() {
		name = "Revolver";
		System.out.println("My gun name is "+ name);
	}

	public int getAddBullets() {
		return shoots;
	}
//	public void setAddBullets(int bullets) {
//		this.bullets = bullets;
//	}
	public void setaddBullets(int shoots) {
		shoots = 6;
		System.out.println("Add "+ shoots+ " bullets for gun");
	}
	public int getShoots() {
		return shoots;
	}
	public void setShoots(int bullets) {
		this.bullets = bullets;
		bullets = 6;
		System.out.println("Numbers shoots from Revolver "+ bullets);
	}

}
