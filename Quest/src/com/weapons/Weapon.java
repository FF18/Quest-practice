package com.weapons;

public abstract class Weapon {

	private String owner;
	protected String name;
	
	
	protected abstract void sayName();
	
		public String getOwner() {
			return owner;
		}
		public void setOwner(String owner) {
			this.owner = owner;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
