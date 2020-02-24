package com.nubes.cj.basics.day33;

import java.util.Arrays;

interface Game {
	void start();
	void play();
	void stop();
}
abstract class AbstractGame implements Game{
	@Override
	public void start() {
		System.out.println("Game is started...");
	}
	@Override
	public void stop() {
		System.out.println("Game is stoped...");
	}
}
class Car extends AbstractGame implements Game {
	
	@Override
	public void play() {
		System.out.println("It can move both directions");
	}
	
}

class Bike extends AbstractGame implements Game {

	@Override
	public void play() {
		System.out.println("It can move both only forward direction");
	}

}

public class GameClient {
public static void main(String[] args) {
	String s1 = "hello";
	String s2 = "Holle";

}
}
