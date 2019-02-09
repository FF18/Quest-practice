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
		return bullets;
	}
//	public void setAddBullets(int bullets) {
//		this.bullets = bullets;
//	}
	public void setaddBullets(int bullets) {
		this.bullets = bullets;
//		bullets = 0;
		System.out.println("Add "+ bullets+ " bullets for gun");
	}
	public int getShoots() {
		return shoots;
	}
	public void setShoots(int shoots) {
		this.shoots = shoots;
//		shoots = 0;
		System.out.println("Numbers shoots from Revolver "+ shoots);
	}

}
