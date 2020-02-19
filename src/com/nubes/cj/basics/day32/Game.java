package com.nubes.cj.basics.day32;

public abstract class Game {
	
	public void start() {
		System.out.println("The Game :" + this.getClass().getSimpleName() + " is started");
	}

	public  abstract void play();

	public void stop() {
		System.out.println("The Game :" + this.getClass().getSimpleName() + " is stoped");
	}
}
