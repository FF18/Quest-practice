package com.weapons;

public class Gun extends Weapon {
	private int bullets;
//	private int shoots;

	public Gun(int strength) {
		super(strength);
	}
	public void sayTitle() {
		System.out.println("My gun title is "+ title);
	}
	public int getAddBullets() {
		return bullets;
	}
	public void setAddBullets(int bullets) {
		this.bullets = bullets;
	}
//	public void addBullets(int bullets) {
//		this.bullets = bullets;
//	}
	public int getShoots() {
		return bullets;
	}
	public void setShoots(int bullets) {
		this.bullets = bullets;
	}

}
