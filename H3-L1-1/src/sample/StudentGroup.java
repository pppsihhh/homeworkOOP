package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public class StudentGroup {

	private String groupName;
	private List<Student> studentArray = new ArrayList<>(10);
 
	public StudentGroup(String groupName, ArrayList<Student> studentArray) {
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

	public ArrayList<Student> getStudentArray() {
		return (ArrayList<Student>) studentArray;
	}

	public void setStudentArray(ArrayList<Student> studentArray) {
		this.studentArray = studentArray;
	}
	
	public boolean isEqualsStudent() {
		
		for (int i = 0; i < this.studentArray.size(); i++) {
			for (int j = i+1; j < this.studentArray.size(); j++) {
				if (studentArray.get(i).equals(studentArray.get(j))) {
					return true;
				}
			}
		}
		
		return false;
	}

	public void addStudent(Student s) throws NoFreePlaseException {
		if (studentArray.size() == 10) {
			throw new NoFreePlaseException();
		} 
		boolean a = true;
		for (int i = 0; i < studentArray.size(); i++) {
			if (studentArray.get(i).getId() == s.getId()) {
				a = false;
			}
		}
		if (a) {
			studentArray.add(s);
		}
	}

	public void expulsionStudent(int id) {
		for (int i = 0; i < studentArray.size(); i++) {
			if (studentArray.get(i).getId() == id) {
				studentArray.remove(i);
			}
		}
	}

	public Student searchStudent(String lastName) throws NoSuchElementException {
		for (int i = 0; i < studentArray.size(); i++) {
			if (studentArray.get(i).getLastName().equals(lastName)) {
				return studentArray.get(i);
			}
		}
		throw new NoSuchElementException();
	}

	public void sortStudentByLastName() {
		Collections.sort(studentArray, new StudentLastNameComparator<Student>());
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(groupName, studentArray);
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
		return Objects.equals(groupName, other.groupName) && Objects.equals(studentArray, other.studentArray);
	}

	@Override
	public String toString() {
		String s = "";
		s = "StudentGroup [groupName=" + groupName + ", students: ";
		for (int i = 0; i < studentArray.size(); i++) {
			if (i > 0) {
				s += ", ";
			}
			s += studentArray.get(i).toStringShort();
		}
		s += "]";
		return s;
	}
}
