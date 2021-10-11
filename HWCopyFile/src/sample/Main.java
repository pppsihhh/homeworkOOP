package sample;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		File f1 = new File("F:\\Временная папка\\17");
		File f2 = new File("Временная папка");
		f2.mkdir();
		
		try {
			CopyFile.selectiveCopyFiles(f1, f2, "jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
