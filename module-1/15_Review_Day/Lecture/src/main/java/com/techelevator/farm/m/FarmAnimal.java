package com.techelevator.farm.m;

public abstract class FarmAnimal implements Singable {
	private String name;
	private String sound;
	private boolean isAsleep = false;

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public String getName( ) {
		return name;
	}
	public final String getSound( )
	{
		if (this.isAsleep) {
			return "zzzzzzz....";
		}

		// does the subclass have a custom sound that should be used?
		String customSound = "";
		if (this instanceof HasCustomSound)
		{
			HasCustomSound cs = (HasCustomSound) this;
			customSound = cs.getCustomSound();
		}
		// use the custom sound if one is returned
		return  (customSound != null) ? customSound : sound;
	}

	public void sleep() {
		isAsleep = true;
	}

	public void wake() {
		isAsleep = false;
	}

	// all subclasses must implement this method
	public abstract String eat();


	@Override
	public String toString() {
		return this.name + " sounds like " + this.sound;
	}

}
