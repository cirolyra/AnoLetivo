package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public double Media() {
		double p1 = 30.0;
		double p2 = 35.0;
		
		return (p1*grade1)+(p2*grade2)+(p2*grade3)/p1+p2+p2;
	}
}

