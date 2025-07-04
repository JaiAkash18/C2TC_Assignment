package day6UsingFinal;

public class FinalVariable {
	final int x = 100;

	// Declare a static blank final variable.
	final static int Y;

	
	final static int Z = 10;

	
	void change() {
		 // final static variables can't be reassigned
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y" + Y + "]";
	}

	
	static {
		Y = 20;
		
		System.out.println("Value of Y: " + Y);
	}

}
