package com.animals;

public class Dragon extends Animal{
	public Dragon(String name, int age) {
		super(name, age);
		name = "Kid";
		age = 10;
		System.out.println("This dragon by name "+ name);
		System.out.println("He is "+age +" yeas old");
	}
	private int height;
	
	@Override
	public void makeSound() {
		System.out.println("Sound dragon is roar");
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
		System.out.println("He height dragon "+height +" m");
	}
}
