package com.nubes.cj.basics.day38;

class TaskManager implements Cloneable{
	private static TaskManager obj;
	private static int count = 0;
	private TaskManager() {
		
	}
	// Currently not handled thread concepts
	public  static TaskManager getInstance() throws MaxAttemptException {
		count++;
		if(count > 3) {
			throw new MaxAttemptException("You can't call task manager instance method more three times:");
		}
		if(obj==null) {
			obj = new TaskManager();
		}
		return obj;
	}
	@Override
	protected TaskManager clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("You can't clone this object");
	}
}
public class TaskManagerExample {

		public static void main(String[] args){
			
			    
				TaskManager obj1 = TaskManager.getInstance();
				System.out.println(obj1);
				TaskManager obj2;
				try {
					obj2 = obj1.clone();
					System.out.println(obj2);
				} catch (CloneNotSupportedException e) {
					
					e.printStackTrace();
				}
				System.out.println("End of the main method");
		}

		
}
