package sample;

public class Veterinarian {
	private String name;

	public Veterinarian(String name) {
		super();
		this.name = name;
	}

	public Veterinarian() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void treatment(Animal animal) {
		System.out.print("My name is " + this.name);
		System.out.println(", and now I cure " + animal.toString());
		System.out.println("now the animal is healthy, and happily speaks - " + animal.getVoice());
		
	}

	@Override
	public String toString() {
		return "Veterinarian [name=" + name + "]";
	}
}
