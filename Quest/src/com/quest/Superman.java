package com.quest;

public class Superman extends Person {
	private int speed;
	
	public void sayName() {
		name = "Henry Cavill.";
		System.out.println("My name is  "+name + " I'm a Superman. ");
	}
	
	public void setSpeed(int speed, int maxSpeed) {
		if(speed<=maxSpeed) {
				System.out.println("Superman is increasing speed ");
			}
		
		if(speed>=maxSpeed) {
				System.out.println("Superman is decreasing speed ");
			}
		}
		public int getSpeed() {
			return speed;
		}

	}
