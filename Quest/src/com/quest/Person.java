package com.quest;

public abstract class Person {
	public String name;
	
	public Person(String name) {
		this.name = name;
	}
	abstract public void sayName();
}
