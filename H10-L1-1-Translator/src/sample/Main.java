package sample;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		Translator a = new Translator();
		File in = new File("in.txt");
		File out = new File("out.txt");
		a.fileTransletor(in, out);
	}
}
