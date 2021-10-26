package sample;

import java.util.Comparator;

public class CharClassComparator<T extends CharClass> implements Comparator<T>{

	@Override
	public int compare(T o1, T o2) {
		
		if (o1.getFrequency() < o2.getFrequency()) {
			return 1;
		}
		if (o1.getFrequency() > o2.getFrequency()) {
			return -1;
		}
		return 0;
	}
	
	

}
