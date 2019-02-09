package com.weapons;

public class Strength extends Weapon {
	private int strength;
	final private int maxStrength = 100;
	protected String name;
	

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
//			strength = 55;
			System.out.println("Strength of weapon is "+ strength);
			System.out.println("Max strength of weapon is 100 ");
			}else {
				System.out.println("Excess of strength");
			}
//		this.strength = strength;
//		public String getName() {
//			return name;
//		}
//		public void setName(String name) {
//			this.name = name;
//		}
		}
	
	}
