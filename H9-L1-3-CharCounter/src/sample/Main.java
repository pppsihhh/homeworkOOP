package sample;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		File f1 = new File("111.txt");
		CharCounter a = new CharCounter();
		a.Statistic(f1);
	}
}
