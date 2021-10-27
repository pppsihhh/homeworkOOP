package sample;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		printList();

	}

	public static void printList() {
		List<Integer> a = new ArrayList<>(10);
		for (int i = 0; i < 10; i++) {
			a.add((int)(Math.random() * 10 + 1));
		}
		
		a.remove(0);
		a.remove(0);
		a.remove(a.size()-1);
		
		System.out.println(a);
	}

}
