package sample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class StudentGroup {

	private String groupName;
	private Student[] studentArray = new Student[10];

	public StudentGroup(String groupName, Student[] studentArray) {
		super();
		this.groupName = groupName;
		this.studentArray = studentArray;
	}

	public StudentGroup() {
		super();
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Student[] getStudentArray() {
		return studentArray;
	}

	public void setStudentArray(Student[] studentArray) {
		this.studentArray = studentArray;
	}
	
	public boolean isEqualsStudent() {
		
		for (int i = 0; i < this.studentArray.length; i++) {
			for (int j = i+1; j < this.studentArray.length; j++) {
				if (studentArray[i].equals(studentArray[j])) {
					return true;
				}
			}
		}
		
		return false;
	}

	public void addStudent(Student s) throws NoFreePlaseException {
		boolean a = true;
		int count = 0;
		for (int i = 0; i < studentArray.length; i++) {
			if (this.studentArray[i] != null && this.studentArray[i].getId() == s.getId()) {
				a = false;
			}
		}

		if (a) {
			for (int i = 0; i < this.studentArray.length; i++) {

				if (this.studentArray[i] == null) {
					this.studentArray[i] = s;
					break;
				} else {
					count++;
				}
			}
		}
		if (count == 10) {
			throw new NoFreePlaseException();
		}
	}

	public void expulsionStudent(int id) {
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null && studentArray[i].getId() == id) {
				studentArray[i] = null;
			}
		}
	}

	public Student searchStudent(String name) throws NoSuchElementException {
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null && studentArray[i].getName().equals(name)) {
				return studentArray[i];
			}
		}
		throw new NoSuchElementException();
	}

//	The method sorts and changes the original array
	public void sortStudentByLastName() {
		Arrays.sort(this.studentArray, Comparator.nullsLast(new StudentLastNameComparator()));
	}

	public Student[] toString2() {
		Student[] arr = new Student[this.studentArray.length];
		int max = getMaxLenght();
		for (int i = 1; i <= max; i++) {
			arr = countSort(max, i);
		}

		return arr;
	}

	private int getMaxLenght() {
		int maxL = 0;
		for (Student s : this.studentArray) {
			if (s != null && s.getLastName().length() > maxL) {
				maxL = s.getLastName().length();
			}
		}
		return maxL;
	}

	private int getSCode(String text, int maxLenght, int position) {
		if (text.length() <= maxLenght - position) {
			return -1;
		}
		return text.codePointAt(maxLenght - position);
	}

	private int[] findMinMaxKey(int maxLenght, int position) {

		int minKey = 0;
		int maxKey = minKey;
		for (Student s : this.studentArray) {
			if (s == null) {
				continue;
			}
			int codePoint = getSCode(s.getLastName(), maxLenght, position);
			if (codePoint < minKey) {
				minKey = codePoint;
			}
			if (codePoint > maxKey) {
				maxKey = codePoint;
			}
		}
		return new int[] { minKey, maxKey };
	}

	private Student[] countSort(int maxLenght, int position) {
		int[] minMaxKey = findMinMaxKey(maxLenght, position);
		int minKey = minMaxKey[0];
		int maxKey = minMaxKey[1];
		int n = maxKey - minKey + 1;
		int[] support = new int[n];
		for (Student s : this.studentArray) {
			if (s == null) {
				continue;
			}
			support[getSCode(s.getLastName(), maxLenght, position) - minKey] += 1;
		}
		int size = this.studentArray.length;
		for (int i = support.length - 1; i >= 0; i--) {
			size -= support[i];
			support[i] = size;
		}
		Student[] result = new Student[this.studentArray.length];
		for (Student s : this.studentArray) {
			if (s == null) {
				continue;
			}
			result[support[getSCode(s.getLastName(), maxLenght, position) - minKey]] = s;
			support[getSCode(s.getLastName(), maxLenght, position) - minKey] += 1;
		}
		return result;
	}

@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(studentArray);
		result = prime * result + Objects.hash(groupName);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentGroup other = (StudentGroup) obj;
		return Objects.equals(groupName, other.groupName) && Arrays.equals(studentArray, other.studentArray);
	}

	//	 this method returns a list of students sorted alphabetically. It does not affect the original array of students.
	@Override
	public String toString() {
		Student[] ss = new Student[this.studentArray.length];
		ss = this.toString2();
		String s;
		int p = 0;
		s = "StudentGroup [groupName=" + groupName + ", students: ";
		for (int i = 0; i < ss.length; i++) {
			if (ss[i] == null) {
				continue;
			}
			if (p > 0) {
				s += ", ";
			}
			s += ss[i].toStringShort();
			p++;
		}
		s += "]";
		return s;
	}

}
