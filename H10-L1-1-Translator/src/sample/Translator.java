package sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Translator {
	private Map<String, String> vacabulary = new HashMap<>();

	public Translator() {
		super();
		String result = "";
		File f1 = new File("vacabulary\\words.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(f1))) {
			String temp = "";
			while ((temp = br.readLine()) != null) {
				result += temp;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] s1 = result.split(";");
		for (int i = 0; i < s1.length; i++) {
			String[] s2 = s1[i].split("-");
			vacabulary.put(s2[0], s2[1]);
		}
	}

	public Map<String, String> getVacabulary() {
		return vacabulary;
	}

	public void fileTransletor(File in, File out) {
		String read = readFromFile(in);
		String[] readArray = read.split(" ");
		String write = arrTransletor(readArray);
		writeToFile(out, write);

	}

	public String readFromFile(File in) {
		String result = "";
		try (BufferedReader reader = new BufferedReader(new FileReader(in))) {
			String temp = "";
			while ((temp = reader.readLine()) != null) {
				result += temp;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	public String arrTransletor(String[] arr) {
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			String temp = vacabulary.get(arr[i]);
			if (temp == null) {
				result += "(" + arr[i] + " не найдено в словаре)";
			} else {
				result += " " + temp;
			}
		}
		return result;
	}

	public void writeToFile(File out, String str) {
		try(PrintWriter pw = new PrintWriter(out)) {
			pw.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Translator [vacabulary=" + vacabulary + "]";
	}

}
