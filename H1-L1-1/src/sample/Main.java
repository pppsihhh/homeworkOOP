package sample;

public class Main {

	public static void main(String[] args) {
		Product pr1 = new Product("Headphones", 0.25, 129);
		Product pr2 = new Product("PC mouse", 0.1, 25);
		Product pr3 = new Product("Monitor", 1.7, 220);

		System.out.println(pr1);
		System.out.println(pr2);
		System.out.println(pr3);

		pr1.setDescription("Super Headphones");
		pr2.setWeight(0.12);
		pr3.setPrice(225);

		System.out.println("");
		System.out.println("New description = " + pr1.getDescription());
		System.out.println("New weight = " + pr2.getWeight());
		System.out.println("New price = " + pr3.getPrice());
	}

}
