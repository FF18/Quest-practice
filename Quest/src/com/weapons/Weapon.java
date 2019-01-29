package com.weapons;

public abstract class Weapon {
	private int strength;
	private String owner;
	public String title;

	public Weapon(int strength) {
		this.strength = strength;
	}
	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength, int value) {
		this.strength = strength;
		if(value >= 0 && value <= 100) {
			System.out.println("final");}
		}
		public String getOwner() {
			return owner;
		}
		public void setOwner(String owner) {
			this.owner = owner;
		}
		abstract public void sayTitle();

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
			System.out.println("weapon");
		}
	}
	
