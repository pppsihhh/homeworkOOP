package sample;

public class Human {
	private String name;
	private String lastName;
	private int age;
	private Sex sex;

	public Human(String name, String lastName, int age, Sex sex) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.sex = sex;
	}

	public Human() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", lastName=" + lastName + ", age=" + age + ", sex=" + sex + "]";
	}

}
