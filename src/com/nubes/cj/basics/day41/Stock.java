package com.nubes.cj.basics.day41;

public class Stock {

		private String date;
		private float high;
		private float low;
		private float volume;
		
		public Stock() {
		}
		public Stock(String date, float high, float low, float volume) {
			this.date = date;
			this.high = high;
			this.low = low;
			this.volume = volume;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public float getHigh() {
			return high;
		}
		public void setHigh(float high) {
			this.high = high;
		}
		public float getLow() {
			return low;
		}
		public void setLow(float low) {
			this.low = low;
		}
		public float getVolume() {
			return volume;
		}
		public void setVolume(float volume) {
			this.volume = volume;
		}
		@Override
		public String toString() {
			return "Stock [date=" + date + ", high=" + high + ", low=" + low + ", volume=" + volume + "]";
		}
		
		
}
