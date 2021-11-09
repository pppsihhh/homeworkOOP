package sample;

public class Cat {
	private String name;
	private int age;

	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean catTest (int age, char sName) {
		boolean t1 = false;
		if (this.age < age) {
			t1 = true;
		}
		boolean t2 = false;
		char temp = Character.toUpperCase(this.name.charAt(0));
		if (Character.toUpperCase(sName) < temp) {
			t2 = true;
		}
		return t1 && t2;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
}
