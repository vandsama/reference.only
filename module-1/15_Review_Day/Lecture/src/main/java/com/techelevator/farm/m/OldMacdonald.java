package com.techelevator.farm.m;

public class OldMacdonald {
	public static void main(String[] args) {

		Cat myCat = new Cat();
		Cow cow = new Cow();
		Pig pig = new Pig();

//		myCat.sleep();
		cow.sleep();
		pig.sleep();

		Singable[] singables =
				new Singable[] {cow, myCat, new Chicken(), pig, new Tractor()};

		for (Singable singable : singables) {
			String name = singable.getName();
			String sound = singable.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name
					+ ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound
					+ " everywhere a " + sound + " " + sound);
			System.out.println();
		}

		Sellable[] sellables = new Sellable[] {cow, pig, new Egg()};

		for (Sellable sellable : sellables) {
			System.out.println("Step right up and get your " + sellable.getName());
			System.out.println("Only $" + sellable.getPrice());
		}
	}
}
