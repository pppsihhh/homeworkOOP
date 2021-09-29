package sample;

public class Cat extends Animal {
	String name;

	public Cat(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
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

	@Override
	public String getVoice() {
		return "Mew mew mew";
	}

	@Override
	public void eat() {
		System.out.println("Mew, Om-Nom-nom");

	}

	@Override
	public void sleep() {
		System.out.println("Rrr, zZ-zZ-zZ");

	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", ration=" + this.getRation() + ", color=" + this.getColor() + ", weight="
				+ this.getWeight() + "]";
	}

}
