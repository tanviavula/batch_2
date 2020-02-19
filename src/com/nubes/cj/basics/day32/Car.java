package com.nubes.cj.basics.day32;

public class Car extends Game {

	@Override
	public void play() {
		System.out.println("You are playing : "+this.getClass().getSimpleName()+" Game");
	}

}
