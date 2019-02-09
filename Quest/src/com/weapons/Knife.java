package com.weapons;

public class Knife extends Strength {
	private int sharpnes;
	final private int maxSharpnes = 10;

	public Knife(int sharpnes2, int strength) {
		super(strength);
		this.sharpnes = sharpnes2;
	}

	public void sayName() {
		name = "Excalibur";
		System.out.println("My sword name is "+ name);
	}
	public void setSharpnes(int sharpnes) {
		if(sharpnes>=0 && sharpnes<=maxSharpnes) {
//			sharpnes = 8;
			System.out.println("Sharpnes of weapon "+ sharpnes);
			System.out.println("Max sharpnes of knife is 10 ");
		}else {
			System.out.println("Mistake sharpnes of weapon");
		}
	}
	public int getSharpnes() {
		return sharpnes;
	}

}
