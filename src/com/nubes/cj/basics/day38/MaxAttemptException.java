package com.nubes.cj.basics.day38;

public class MaxAttemptException extends RuntimeException {
		private String message;
		public MaxAttemptException() {
			this.message = "You have reached max number of attempts";
		}
		public MaxAttemptException(String message){
			this.message = message;
		}
		
		
}
