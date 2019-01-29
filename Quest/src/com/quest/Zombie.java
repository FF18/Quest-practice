package com.quest;

public class Zombie extends Person {
	private String deathDate;
	
	public Zombie(String deathDate, String name) {
		super(name);
	}
	public void sayName() {
		System.out.println("My name is "+ name+ "I'm a " + deathDate);
		System.out.println();
	}

	public String getDeathDate() {
		return deathDate;
	}
}
