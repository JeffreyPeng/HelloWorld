package peng;

import java.util.LinkedList;

public class Stack<T> {
	private LinkedList<T> storage = new LinkedList<T>();
	
	public void push (T t) {
		storage.addFirst(t);
	}
	
	public T peek () {
		return storage.peekFirst();
	}
	
	public T pop () {
		return storage.removeFirst();
	}
	
	public boolean empty () {
		return storage.isEmpty();
	}
	
	@Override
	public String toString() {
		return storage.toString();
	}
}
