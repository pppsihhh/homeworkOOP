package sample;

import java.util.Arrays;

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
	public String toString() {
		return "Student [name - " + this.getName() + ", lastName - " + this.getLastName() + ", age - " + this.getAge()
				+ ", id - " + id + ", group - " + group + "]";
	}

}
