package com.weapons;

public class Strength extends Weapon {
	private int strength;
	final private int maxStrength = 100;
	public String name;
	

	public Strength(int strength) {
		this.strength = strength;
	}

	public void sayName() {
		System.out.println();
	}
	
	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		if(strength >= 0 && strength <= maxStrength) {
			strength = 55;
			System.out.println("Strength of weapon is "+ strength);
			System.out.println("Max strength of weapon is 100 ");
			}
		this.strength = strength;
		}
	
	}
