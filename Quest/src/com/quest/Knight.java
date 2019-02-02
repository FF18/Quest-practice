package com.quest;

public class Knight extends Person {
	private String weapon;
	
	public void sayName() {
		name = "Lancelot";
		System.out.println("My name is "+ name+ " I'm a knight ");
	}
	public void setWeapon(String useWeapon) {
		weapon = useWeapon;
		weapon = "sword Excalibur";
		System.out.println("My favorites weapon is "+ weapon);
	}
	public String getWeapon() {
		return weapon;
	}
}
