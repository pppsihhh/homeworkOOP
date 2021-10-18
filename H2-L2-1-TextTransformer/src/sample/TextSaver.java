package sample;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TextSaver {
	private TextTransformer transformer;
	private File file;
	
	public TextTransformer getTransformer() {
		return transformer;
	}

	public void setTransformer(TextTransformer transformer) {
		this.transformer = transformer;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public TextSaver(TextTransformer transformer, File file) {
		super();
		this.transformer = transformer;
		this.file = file;
	}

	public TextSaver() {
		super();
	}

	public void saveTextToFile(String text) {
		try (PrintWriter pw = new PrintWriter(file)) {

			pw.print(transformer.transform(text));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
