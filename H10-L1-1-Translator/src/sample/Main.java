package sample;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		
		Translator a = new Translator();
		System.out.println(a.getVacabulary());
		a.addNewWords();
		System.out.println(a.getVacabulary());
		
//		File in = new File("in.txt");
//		File out = new File("out.txt");
//		a.fileTransletor(in, out);
	}
}
