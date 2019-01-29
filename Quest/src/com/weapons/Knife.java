package com.weapons;

public class Knife extends Weapon {
	private int sharpnes;

	public Knife(int sharpnes, int strength) {
		super(strength);
	}
	public void sayTitle() {
		System.out.println("My knife title is "+ title);
	}
	public void setSharpnes(int sharpnes) {
		if(sharpnes>=0 && sharpnes<=10) {
			System.out.println("final");}
	}
	public int getSharpnes() {
		return sharpnes;
	}

}
