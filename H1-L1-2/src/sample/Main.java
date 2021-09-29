package sample;

public class Main {
	
	public static void main(String[] args) {
		Triangle t1 = new Triangle(3.4, 2.1, 5.3);
		Triangle t2 = new Triangle(5, 4.2, 3.5);
		
		double at1 = t1.getArea();
		double at2 = t2.getArea();
		
		System.out.println(String.format("Площадь триугольника №1 = %.2f", at1));
		System.out.println(String.format("Площадь триугольника №2 = %.2f", at2));
	}

}
