package com.nubes.cj.basics.day32;

import java.util.Scanner;

public class Manager {
	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); while (true) {
		 * System.out.println("Enter the choice 1.Car 2. Bike 3. Bicycle 4.Exit"); int
		 * ch = sc.nextInt(); if (ch == 4) { sc.close(); System.exit(0); } Game game =
		 * getSelectedGame(ch); game.start(); game.play(); game.stop();
		 * System.out.println("Thank you for playing...."); }
		 */
		int n = 20;
		Game game[] = new Game[n];
		for(int i=0;i<n;i++) {
			int r = (int)Math.ceil(Math.random()*3);
			game[i] = getSelectedGame(r);
		}
	
		
		int c = 0;
		for(Game g:game) {
			if(g instanceof Bike) {
				++c;
				System.out.println(c+".");
				g.start();
				g.play();
				g.stop();
			}
		}
	}

	private static Game getSelectedGame(int num) {
		if (num == 1) {
			return  new Car();
		} else if (num == 2) {
			return new Bike();
		} else {
			return new Bicycle();
		}

	}
}
