package sample;

public class Main {
	public static void main(String[] args) {
		Cat cat1 = new Cat("wiskas", "grey", 4, "Keks");
		Dog dog1 = new Dog("pedigry", "white", 6, "Sharik");
		Veterinarian v1 = new Veterinarian("Oleg");
		
		v1.treatment(cat1);
		v1.treatment(dog1);
	}
}
