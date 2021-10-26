package sample;

public class CharClass {
	private char c;
	private int frequency;
	
	public CharClass(char c, int frequency) {
		super();
		this.c = c;
		this.frequency = frequency;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	@Override
	public String toString() {
		return c + " => " + frequency + " times";
	}
	
	
	
	
}
