package com.animals;

public abstract class Animal {
	public String name;
	private int age;
	public String sound;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void getName(String name){
		this.name = name;
	}
	public String setName(){
		return name;
	}
//	abstract public void sayName;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	abstract public void makeSound();
}
