package sample;

public class Student extends Human {
	private int id;
	private String group;

	public Student(String name, String surname, int age, Sex sex, int id, String group) {
		super(name, surname, age, sex);
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

	public String toStringShort() {
		return this.getSurname() + " " + this.getName();
	}

	@Override
	public String toString() {
		return "Student [name - " + this.getName() + "Surname - " + this.getSurname() + "id - " + id + ", group - " + group + "]";
	}

}
