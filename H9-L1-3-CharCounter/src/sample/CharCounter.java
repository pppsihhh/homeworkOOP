package sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CharCounter {
	private List<Character> charList = new ArrayList<>(100);
	private List<CharClass> charClassArr = new ArrayList<>(50);
	
	

	public List<Character> getCharList() {
		return charList;
	}

	public List<CharClass> getCharClassArr() {
		return charClassArr;
	}

	public void Statistic(File file) {
		charListCreator(readText(file));
		charClassCreator();
		CharClassComparator<CharClass> com = new CharClassComparator<>();
		Collections.sort(charClassArr, com);
		charClassArrPrint();
	}

	public String readText(File file) {
		String result = "";
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String temp = "";
			while ((temp = br.readLine()) != null) {
				result += temp;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	public void charListCreator(String s) {
		char[] t = s.toCharArray();
		for (int i = 0; i < t.length; i++) {
			charList.add(Character.toLowerCase(t[i]));
		}
	}

	public void charClassCreator() {
		while (charList.size() > 0) {
			char c = charList.remove(0);
			int t = 1;
			int i;
			while ((i = charList.indexOf(c)) >= 0) {
				charList.remove(i);
				t++;
			}
			charClassArr.add(new CharClass(c, t));
		}
	}
	
	public void charClassArrPrint() {
		for (CharClass charClass : charClassArr) {
			System.out.println(charClass.toString());
		}
	}
}
