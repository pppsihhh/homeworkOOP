package sample;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class TipoStack {

	private Object[] tStack;
	private int index = 0;

	TipoStack(int stackLength) {
		tStack = new Object[stackLength];
	}
	
	public Object[] getTStack() {
		return this.tStack;
	}

	public void push(Object obj) {
		if (index == tStack.length - 1) {
			tStack = Arrays.copyOfRange(tStack, 0, tStack.length + 1);
		}
		if (index == 0 && tStack[index] == null) {
			tStack[index] = obj;
		} else {
			index ++;
			tStack[index] = obj;
		}
	}

	public Object pop() throws NoSuchElementException {

		if (tStack[index] == null) {
			throw new NoSuchElementException();
		}
		Object a = tStack[index];
		if (index == 0) {
			tStack[index] = null;
		} else {
			tStack[index] = null;
			index --;
		}
		
		return a;
	}
	
	public Object peek() throws NoSuchElementException {
		if (tStack[index] == null) {
			throw new NoSuchElementException();
		}
		return tStack[index];
	}

	@Override
	public String toString() {
		String a = "TipoStack [elements: ";
		
		for (int i = 0; i < tStack.length; i++) {
			if (tStack[i] == null) {
				break;
			}
			if (i > 0) {
				a += "; ";
			}
			a += tStack[i].toString();
		}
		
		a += "]";
		return a;
	}
	
	

}
