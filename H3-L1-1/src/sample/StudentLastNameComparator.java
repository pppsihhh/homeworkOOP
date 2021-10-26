package sample;

import java.util.Comparator;

public class StudentLastNameComparator<T extends Student> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {

		return o1.getLastName().compareTo(o2.getLastName());
	}
	
}
