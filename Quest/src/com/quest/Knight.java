package com.quest;

public class Knight extends Person {
	private String weapon;
	
	protected Knight(String weapon, String name) {
		super(name);
	}
	
	public void sayName() {
		System.out.println("My name is "+ name+ "I'm a " + weapon);
		System.out.println();
	}
	public void setWeapon(String useWeapon) {
		weapon = useWeapon;
	}
	public String getWeapon() {
		return weapon;
	}
}
