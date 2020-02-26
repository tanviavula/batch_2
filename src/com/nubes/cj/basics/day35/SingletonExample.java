package com.nubes.cj.basics.day35;

class TaskManager {
	String taks = "Eclipse,Paint,Chrome";
	private static TaskManager obj;

	private TaskManager() {
	}

	public static TaskManager getInstance() {
		if (obj == null) {
			obj = new TaskManager();
		}
		return obj;
	}
}

public class SingletonExample {

	public static void main(String[] args) {
		TaskManager obj1 = TaskManager.getInstance();
		TaskManager obj2 = TaskManager.getInstance();
		TaskManager obj3 = TaskManager.getInstance();
		TaskManager obj4 = TaskManager.getInstance();
		TaskManager obj5 = TaskManager.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		System.out.println(obj5);
	}
}
