package com.nubes.cj.basics.day44;

interface MyIterator<T> {
	boolean hasNext();
	T next();

}

public class MyList<T> {

	private Object[] arr;
	private int count = 0;

	public MyList() {
		arr = new Object[10];
	}

	public void add(T obj) {
		//Ensure size and increase 
		arr[count++] = obj;
	}

	public boolean find(T obj) {
		if (count == 0)
			return false;
		for (Object ele : arr) {
			if (ele == obj)
				return true;
		}
		return false;

	}
	public MyIterator<T> iterator(){
		return new Itr();
	}
	
	public class Itr implements MyIterator<T>{
		int c = 0;
		@Override
		public boolean hasNext() {
			return c < count;
		}

		@Override
		public T next() {
			return (T)arr[c++];
		}
	}

}
