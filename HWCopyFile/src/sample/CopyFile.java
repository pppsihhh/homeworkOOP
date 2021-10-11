package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {

	public static void selectiveCopyFiles(File folderIn, File folderOut, String key) throws IOException {
		File[] files = folderIn.listFiles();
		for (File file : files) {
			String[] s = file.getName().split("\\.");
			if (file.isFile() && s[s.length - 1].equals(key)) {
				File out = new File(folderOut, file.getName());
				copyFile(file, out);
			}

		}
	}

	public static void copyFile(File in, File out) throws IOException {
		try (InputStream is = new FileInputStream(in); OutputStream os = new FileOutputStream(out)) {
			is.transferTo(os);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
