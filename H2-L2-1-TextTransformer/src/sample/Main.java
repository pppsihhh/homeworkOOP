package sample;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		String a = "interesting";
		
		File file = new File("SaveTxt.txt");
//		TextTransformer tr = new TextTransformer();
		TextTransformer tr = new UpDownTransformer();
//		UpDownTransformer tr = new UpDownTransformer();
//		TextTransformer tr = new InverseTransformer();
//		InverseTransformer tr = new InverseTransformer();
		TextSaver ts = new TextSaver(tr, file);
		ts.saveTextToFile(a);
		
	}
}
