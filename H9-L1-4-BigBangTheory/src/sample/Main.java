package sample;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	
	public static void main(String[] args) {
		BigBangTheotyQueue(6);
	}
	
	public static void BigBangTheotyQueue (int cups) {
		Deque<String> big = new ArrayDeque<>();
		big.add("Sheldon");
		big.add("Leonard");
		big.add("Volovic");
		big.add("Kutrapalli");
		big.add("Penny");
		
		for (int i = 0; i < cups; i++) {
			String s = big.pop();
			big.add(s);
			big.add(s);
		}
		
		System.out.println(big);
	}
}


