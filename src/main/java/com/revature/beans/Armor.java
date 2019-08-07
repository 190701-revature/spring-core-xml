package com.revature.beans;

public class Armor {
	private String name;
	private String material;
	private int armorRating;
	private int durability;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getArmorRating() {
		return armorRating;
	}
	public void setArmorRating(int armorRating) {
		this.armorRating = armorRating;
	}
	public int getDurability() {
		return durability;
	}
	public void setDurability(int durability) {
		this.durability = durability;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + armorRating;
		result = prime * result + durability;
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Armor other = (Armor) obj;
		if (armorRating != other.armorRating)
			return false;
		if (durability != other.durability)
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Armor [name=" + name + ", material=" + material + ", armorRating=" + armorRating + ", durability="
				+ durability + "]";
	}
	public Armor(String name, String material, int armorRating, int durability) {
		super();
		this.name = name;
		this.material = material;
		this.armorRating = armorRating;
		this.durability = durability;
	}
	public Armor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
