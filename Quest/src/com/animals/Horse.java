package com.animals;

public class Horse extends Animal{
	public Horse(String name, int age) {
		super(name, age);
		name = "Llamrei";
		age = 12;
		System.out.println("This horse by name "+ name);
		System.out.println("He is "+age +"yeas old");
	}
	private int speed;
	
//	public Horse(String name, int age, String sound) {
//		super(name, age);
//	}
	
	@Override
	public void makeSound() {
		System.out.println("My horse is neigh");
	}
	
	public void setSpeed(int speed, int maxSpeed) {
		if(speed<=maxSpeed) {
				System.out.println("Horse is increasing speed");
			}
		
		if(speed>=maxSpeed) {
				System.out.println("Horse is decreasing speed");
			}
		}
		public int getSpeed() {
			return speed;
		}

	}

