package com.nubes.cj.basics.day13.pms;

public class Product {

	private int pid;
	private String pname;
	private double price;

	public Product(int pid, String pname, double price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("Pid :"+this.pid+" "+this.pname+" "+this.price);
	}
}
