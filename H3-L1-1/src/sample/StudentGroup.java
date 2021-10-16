package sample;

import java.util.NoSuchElementException;

public class StudentGroup {
	private String groupName;
	private Student[] st = new Student[10];

	public StudentGroup(String groupName, Student[] st) {
		super();
		this.groupName = groupName;
		this.st = st;
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

	public Student[] getSt() {
		return st;
	}

	public void setSt(Student[] st) {
		this.st = st;
	}

	public void addStudent(Student s) throws NoFreePlaseException {
		boolean a = true;
		int count = 0;
		for (int i = 0; i < st.length; i++) {
			if (this.st[i] != null && this.st[i].getId() == s.getId()) {
				a = false;
			}
		}

		if (a) {
			for (int i = 0; i < this.st.length; i++) {
				
				if (this.st[i] == null) {
					this.st[i] = s;
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
		for (int i = 0; i < st.length; i++) {
			if (st[i] != null && st[i].getId() == id) {
				st[i] = null;
			}
		}
	}

	public Student searchStudent(String name) throws NoSuchElementException {
		for (int i = 0; i < st.length; i++) {
			if (st[i] != null && st[i].getName().equals(name)) {
				return st[i];
			}
		}
		throw new NoSuchElementException();
	}

	public Student[] toString2() {
		Student[] arr = new Student[this.st.length];
		int max = getMaxLenght();
		for (int i = 1; i <= max; i++) {
			arr = countSort(max, i);
		}

		return arr;
	}

	private int getMaxLenght() {
		int maxL = 0;
		for (Student s : this.st) {
			if (s != null && s.getSurname().length() > maxL) {
				maxL = s.getSurname().length();
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
		for (Student s : this.st) {
			if (s == null) {
				continue;
			}
			int codePoint = getSCode(s.getSurname(), maxLenght, position);
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
		for (Student s : this.st) {
			if (s == null) {
				continue;
			}
			support[getSCode(s.getSurname(), maxLenght, position) - minKey] += 1;
		}
		int size = this.st.length;
		for (int i = support.length - 1; i >= 0; i--) {
			size -= support[i];
			support[i] = size;
		}
		Student[] result = new Student[this.st.length];
		for (Student s : this.st) {
			if (s == null) {
				continue;
			}
			result[support[getSCode(s.getSurname(), maxLenght, position) - minKey]] = s;
			support[getSCode(s.getSurname(), maxLenght, position) - minKey] += 1;
		}
		return result;
	}

	@Override
	public String toString() {
		Student[] ss = new Student[this.st.length];
		ss = this.toString2();
		String s;
		int p = 0;
		s = "StudentGroup [groupName=" + groupName + ", st=";
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
