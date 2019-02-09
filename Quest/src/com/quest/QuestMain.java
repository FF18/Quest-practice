package com.quest;

import com.weapons.Strength;
import com.weapons.Gun;
import com.weapons.Knife;
import com.animals.Animal;
import com.animals.Dragon;
import com.animals.Horse;

public class QuestMain {
	
	public static void main(String[] args) {
		Knight knight = new Knight();
		Superman superman = new Superman();
		Person zombie = new Zombie();
		
		com.weapons.Strength str = new Strength(0);
		com.weapons.Knife knife = new Knife(0, 0);
		com.weapons.Gun gun = new Gun(0);
		
		com.animals.Dragon dra = new Dragon(null, 0);
		com.animals.Horse hor = new Horse(null, 0);
		
		
		knight.sayName();
		knight.setWeapon(null);
		superman.sayName();
		superman.setSpeed(0, 100);
		zombie.sayName();
		System.out.println();
		
		str.setStrength(90);
		knife.sayName();
		knife.setSharpnes(9);
		gun.sayName();
		gun.setaddBullets(5);
		gun.setShoots(4);
//		com.weapons.Weapon setOwner ();
		System.out.println();
		
		dra.makeSound();
		dra.setHeight(5);
		hor.makeSound();
		hor.setSpeed(20, 0);
	}
}
