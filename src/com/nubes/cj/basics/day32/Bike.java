package com.nubes.cj.basics.day32;

public class Bike extends Game {

	@Override
	public void play() {
		System.out.println("You are playing :"+this.getClass().getSimpleName()+" Game");
		System.out.println("Please ensure you are wearing helmet while riding .....");
	}

}
