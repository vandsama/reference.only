package com.techelevator.farm;

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
	public String getSound( )
	{
		if (this.isAsleep) {
			return "zzzzzzzz";
		}

		// does the subclass have a custom sound that should be used?
		String customSound = this.GetCustomSound();

		// use the custom sound if one is returned
		return (customSound != null) ? customSound : sound;
	}

	public void sleep() {
		isAsleep = true;
	}

	public void wake() {
		isAsleep = false;
	}

	// all subclasses must implement this method
	public abstract String eat();

	protected String GetCustomSound() {
		return getSound();
	}

	@Override
	public String toString() {
		return this.name + " sounds like " + this.sound;
	}

}
