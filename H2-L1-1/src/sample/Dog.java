package sample;

public class Dog extends Animal {
	private String name;

	public Dog(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}

	public Dog() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getVoice() {
		return "Woof woof woof";
	}

	@Override
	public void eat() {
		System.out.println("Woof, Om-Nom-nom");

	}

	@Override
	public void sleep() {
		System.out.println("Grr, zZ-zZ-zZ");

	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", ration=" + this.getRation() + ", color=" + this.getColor() + ", weight="
				+ this.getWeight() + "]";
	}
}
