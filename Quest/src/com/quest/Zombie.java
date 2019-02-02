package com.quest;

public class Zombie extends Person {
	private String deathDate;
	
	public void sayName() {
		System.out.println("It name is ...  "+ " it's a Zombie ");
	}

	public String getDeathDate() {
		return deathDate;
	}
}
