package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteEqualls {

	public static boolean equalsFile(File file1, File file2) throws IOException {
		byte[] f1 = new byte[1000];
		byte[] f2 = new byte[1000];
		try (InputStream is1 = new FileInputStream(file1); InputStream is2 = new FileInputStream(file2)) {

			for (;;) {
				int rb1 = is1.read(f1);
				int rb2 = is2.read(f2);

				if (rb1 != rb2) {
					return false;
				}
				if (rb1 <= 0) {
					break;
				}
				if (rb1 == rb2) {
					for (int i = 0; i < f1.length; i++) {
						if (f1[i] != f2[i]) {
							return false;
						}
					}
				}
			}
		} catch (IOException e) {
			throw e;
		}
		return true;
	}
}
