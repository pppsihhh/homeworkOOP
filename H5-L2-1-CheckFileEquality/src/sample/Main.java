package sample;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		File f1 = new File("61.pdf");
		File f2 = new File("54.pdf");
		
		try {
			System.out.println(ByteEqualls.equalsFile(f1, f2));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
