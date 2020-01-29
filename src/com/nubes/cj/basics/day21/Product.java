package com.nubes.cj.basics.day21;

public class Product {
    
	private int pid;
	private String pname;
	private String brand;
	private float price;
	
	public Product(int pid,String pname) {
		this(pid,pname,"Not provided");
	}
	public Product(int pid,String pname,String brand) {
		this(pid, pname,brand,0);
	}
	public Product(int pid,String pname,String brand,float price) {
		this.pid = pid;
		this.pname = pname;
		this.brand = brand;
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println(String.format("%d %s %s %f",pid,pname,brand,price));
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		if(price<0) {
			throw new IllegalArgumentException("Sorry! price can't be -ve number");
		}
		this.price = price;
	}
	
	
}
