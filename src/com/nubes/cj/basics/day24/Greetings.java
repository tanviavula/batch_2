package com.nubes.cj.basics.day24;

public class Greetings {

		private String message;
		
		public Greetings(String message) {
			this.message = message;
		}
		
		public void setMessage(String message) {
			this.message = message;
		}
		
		public void showGreetings() {
			System.out.println("Here is your message:"+message);
		}
}
