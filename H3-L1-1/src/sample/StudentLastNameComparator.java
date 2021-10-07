package sample;

import java.util.Comparator;

public class StudentLastNameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		
		String lastName1 = s1.getLastName();
		String lastName2 = s2.getLastName();
		
		return lastName1.compareTo(lastName2);
	}
	
}