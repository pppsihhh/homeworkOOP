package sample;

import java.util.Arrays;
import java.util.Objects;

public class Student extends Human implements CSVConverter {
	private int id;
	private String group;

	public Student(String name, String lastName, int age, Sex sex, int id, String group) {
		super(name, lastName, age, sex);
		this.id = id;
		this.group = group;
	}

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toCSVString() {
		String s;
		s = this.getName() + ";" + this.getLastName() + ";" + this.getAge() + ";";
		s += this.getSex() + ";" + this.id + ";" + this.group;
		return s;
	}

	@Override
	public Student fromCSVString(String str) {
		String[] a = str.split(";");
		Student st = new Student();
		st.setName(a[0]);
		st.setLastName(a[1]);
		st.setAge(Integer.parseInt(a[2]));
		if (a[3].equals("MAN")) {
			st.setSex(Sex.MAN);
		} else {
			st.setSex(Sex.WOMAN);
		}
		st.setId(Integer.parseInt(a[4]));
		st.setGroup(a[5]);

		return st;
	}

	public String toStringShort() {
		return this.getLastName() + " " + this.getName();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(group, id);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(group, other.group) && id == other.id;
	}

	@Override
	public String toString() {
		return "Student [name - " + this.getName() + ", lastName - " + this.getLastName() + ", age - " + this.getAge()
				+ ", id - " + id + ", group - " + group + "]";
	}

}
