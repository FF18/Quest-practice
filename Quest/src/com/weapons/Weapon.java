package com.weapons;

public abstract class Weapon {

	private String owner;
	public String name;
	
	protected abstract void sayName();
	
		public String getOwner() {
			return owner;
		}
		public void setOwner(String owner) {
			this.owner = owner;
		}
	
	}
