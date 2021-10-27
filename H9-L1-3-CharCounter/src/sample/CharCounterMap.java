package sample;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharCounterMap {
	
	Map<Character, Integer> mapStat = new HashMap<>(50);
	List<CharClass> charClassArray = new ArrayList<>(50);
	
	public void stat (File file) {
		char[] temp = new CharCounter().readText(file).toCharArray();
		for (char c : temp) {
			char b = Character.toLowerCase(c);
			if (mapStat.containsKey(b)) {
				int t = mapStat.get(b);
				t++;
				mapStat.put(b, t);
			} else {
				mapStat.put(b, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> set1 = mapStat.entrySet();
		for (Entry<Character, Integer> p : set1) {
			charClassArray.add(new CharClass(p.getKey(), p.getValue()));
		}
		Collections.sort(charClassArray, new CharClassComparator<>());
		for (CharClass a : charClassArray) {
			System.out.println(a.toString());
		}
	}

}
