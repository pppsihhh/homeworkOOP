package sample;

public class Triangle {
	private double ab;
	private double bc;
	private double ca;

	public Triangle(double ab, double bc, double ca) {
		super();
		this.ab = ab;
		this.bc = bc;
		this.ca = ca;
	}

	public Triangle() {
		super();
	}

	public double getAB() {
		return ab;
	}

	public void setAB(double ab) {
		this.ab = ab;
	}

	public double getBC() {
		return bc;
	}

	public void setBC(double bc) {
		this.bc = bc;
	}

	public double getCA() {
		return ca;
	}

	public void setCA(double ca) {
		this.ca = ca;
	}

	public double getArea() {
		double p = this.getSemiPerimeter();
		return Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
	}

	public double getSemiPerimeter() {
		return (ab + bc + ca) / 2;
	}

	@Override
	public String toString() {
		return "Triangle [AB=" + ab + ", BC=" + bc + ", CA=" + ca + "]";
	}

}
